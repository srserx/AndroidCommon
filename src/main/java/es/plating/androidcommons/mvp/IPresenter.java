package es.plating.androidcommons.mvp;

import android.support.annotation.NonNull;

/**
 * Created by Sergi on 19/2/17.
 */

public interface IPresenter
{
    public void bindView(@NonNull IView view);
    public void unbindView();
}
