package com.credic.home.action;

import android.content.Context;
import android.content.Intent;

import com.credic.home.view.HomeActivity;
import com.zzy.annotations.ScActionAnnotation;
import com.zzy.core.serverCenter.ScAction;
import com.zzy.core.serverCenter.ScCallback;


/**
 * @author zzy
 * @date 2018/8/13
 */
@ScActionAnnotation("entryHome")
public class HomeEntryAction implements ScAction {
    @Override
    public void invoke(Context context,String param, ScCallback callback) {
        Intent intent = new Intent();
        intent.setClass(context, HomeActivity.class);
        context.startActivity(intent);

        callback.onCallback(true,"HomeEntryAction:我把HomeActivity打开了","");
    }
}
