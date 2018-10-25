package com.credic.home.presenter;


import android.support.annotation.NonNull;

import com.credic.home.contract.HomeContract;

/**
 * @author dell-7020
 * @Description:
 * @date 2018/08/07 16:25:23
 */

public class HomePresenter implements HomeContract.Presenter{
    private final HomeContract.View view;

/****************************************************************************************************/
    public HomePresenter(@NonNull HomeContract.View view) {
        this.view = view;
    }
    @Override
    public void start() { }


}