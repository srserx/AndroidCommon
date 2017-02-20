package es.plating.androidcommons;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public abstract class BaseRecyclerAdapter<K> extends RecyclerView.Adapter
{
    private List<K> mItems = new ArrayList<>();

    public void setData(List<K> data)
    {
        mItems.clear();
        mItems.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View thisItemsView = inflater.inflate(getViewHolderLayoutId(), parent, false);
        return getViewHolder(thisItemsView);
    }

    protected abstract RecyclerView.ViewHolder getViewHolder(View view);
    protected abstract int getViewHolderLayoutId();

    @Override
    public int getItemCount()
    {
        return mItems.size();
    }
}
