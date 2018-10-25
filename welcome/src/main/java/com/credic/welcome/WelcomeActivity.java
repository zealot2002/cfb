package com.credic.welcome;

import android.os.Bundle;
import android.os.Handler;

import com.zzy.commonlib.base.BaseActivity;
import com.zzy.commonlib.log.MyLog;
import com.zzy.core.serverCenter.SCM;
import com.zzy.core.serverCenter.ScCallback;

/**
 * @author zzy
 * @date 2018/8/7
 */

public class WelcomeActivity extends BaseActivity {
    private static final String TAG = "WelcomeAcitvity";
    private static Handler handler;
    private final int SHOW_TIME = 3000; //开屏页时间

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity_welcome);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                entryMain();
            }

        }, SHOW_TIME);
    }

    private void entryMain() {
        try {
            SCM.getInstance().req(WelcomeActivity.this, "entryHome", new ScCallback() {
                @Override
                public void onCallback(boolean b, String data, String tag) {
                    MyLog.e(TAG,"return:"+data);
                    if(b){
                        //成功打开Home页面之后，关闭WelcomeActivity
                        finish();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
