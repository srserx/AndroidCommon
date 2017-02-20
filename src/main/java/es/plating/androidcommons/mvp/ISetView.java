package es.plating.androidcommons.mvp;

import java.util.List;

public interface ISetView<ViewModel>
{
    void showData(List<ViewModel> data);
}
