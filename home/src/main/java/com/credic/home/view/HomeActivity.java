package com.credic.home.view;

import android.os.Bundle;
import com.credic.home.R;
import com.credic.home.contract.HomeContract;
import com.credic.home.presenter.HomePresenter;
import com.zzy.commonlib.base.BaseActivity;

/**
 * @author dell-7020
 * @Description:
 * @date 2018/08/07 16:25:23
 */

public class HomeActivity extends BaseActivity implements HomeContract.View{
    private HomeContract.Presenter presenter;
    private static final String TAG = "HomeActivity";

/****************************************************************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_activity_home);
        presenter = new HomePresenter(this);

    }

 }