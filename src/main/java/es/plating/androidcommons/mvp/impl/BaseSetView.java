package es.plating.androidcommons.mvp.impl;

import java.util.List;

import es.plating.androidcommons.mvp.ISetView;
import es.plating.androidcommons.mvp.IView;

public abstract class BaseSetView<ViewModel> implements ISetView<ViewModel>
{
    @Override
    public void showData(List<ViewModel> data)
    {

    }
}
