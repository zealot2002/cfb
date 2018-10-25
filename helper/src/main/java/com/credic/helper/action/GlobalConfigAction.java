package com.credic.helper.action;

import android.content.Context;
import com.credic.helper.DataProvider;
import com.zzy.annotations.ScActionAnnotation;
import com.zzy.commonlib.http.HInterface;
import com.zzy.core.serverCenter.ScAction;
import com.zzy.core.serverCenter.ScCallback;

/**
 * @author zzy
 * @date 2018/8/13
 */

@ScActionAnnotation("getGlobalConfig")
public class GlobalConfigAction implements ScAction {
    @Override
    public void invoke(Context context, String param,final ScCallback callback) {
//        DataProvider.getGlobalConfig(context,new HInterface.DataCallback() {
//            @Override
//            public void requestCallback(int result, Object o, Object o1) {
//                if (result == HttpConstants.SUCCESS) {
//                    callback.onCallback(true,o.toString(),"");
//                }else{
//                    callback.onCallback(false,o.toString(),"");
//                }
//            }
//        });
    }
}
