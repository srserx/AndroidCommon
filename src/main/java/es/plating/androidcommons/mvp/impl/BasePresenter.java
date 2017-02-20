package es.plating.androidcommons.mvp.impl;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;

import es.plating.androidcommons.mvp.IPresenter;
import es.plating.androidcommons.mvp.IView;

public abstract class BasePresenter implements IPresenter {

    private WeakReference<IView> view;

    public void bindView(@NonNull IView view) {
        this.view = new WeakReference<>(view);
    }

    public void unbindView() {
        this.view = null;
    }

    protected IView view() {
        if (view == null) {
            return null;
        } else {
            return view.get();
        }
    }
}
