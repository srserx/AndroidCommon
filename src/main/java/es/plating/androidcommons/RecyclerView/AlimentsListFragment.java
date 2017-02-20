package es.plating.androidcommons.RecyclerView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import es.plating.androidcommons.BaseRecyclerAdapter;
import es.plating.androidcommons.R;
import es.plating.androidcommons.mvp.ISetView;

public abstract class AlimentsListFragment<ViewModel> extends Fragment implements ISetView<ViewModel>
{
    private BaseRecyclerAdapter mAdapter;

    public AlimentsListFragment()
    {
        mAdapter = getAdapter();
    }

    protected abstract BaseRecyclerAdapter getAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aliments_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        // Adapter
        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recyclerView);
        rView.setAdapter(mAdapter);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        rView.setHasFixedSize(true);

        // Tell recyclerView that it is a grid
        GridLayoutManager layoutManager = new GridLayoutManager(view.getContext(), 5);
        rView.setLayoutManager(layoutManager);
    }

    @Override
    public void showData(List<ViewModel> data)
    {
        mAdapter.setData(data);
    }
}
