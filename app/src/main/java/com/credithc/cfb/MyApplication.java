package com.credithc.cfb;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.credithc.common.job.MyJobCreator;
import com.evernote.android.job.JobManager;
import com.zhy.autolayout.config.AutoLayoutConifg;
import com.zzy.commonlib.utils.ProcessUtils;
import com.zzy.core.serverCenter.SCM;
import com.zzy.flysp.core.spHelper.SPHelper;

/**
 * @author zzy
 * @date 2018/8/10
 */

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

/****************************************************************************************************************/
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"onCreate");
        //init跨进程库
        initMultiProcessCoreLib();

        //非主进程，至此返回
        if(!ProcessUtils.isMainProcess(this)) return;

        //init主进程库
        initMainProcessCoreLib();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // dex突破65535的限制
        MultiDex.install(this);
    }

    private void initMainProcessCoreLib() {


    }

    private void initMultiProcessCoreLib() {
        try {
            /*server centre*/
            SCM.getInstance().init(this);
            /*auto layout*/
            AutoLayoutConifg.getInstance().useDeviceSize().init(this);
           /*job*/
            JobManager.create(this).addJobCreator(new MyJobCreator());
            /*sp content provider*/
            SPHelper.init(this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
