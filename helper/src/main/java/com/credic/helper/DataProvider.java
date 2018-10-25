package com.credic.helper;

import android.content.Context;
import com.zzy.commonlib.http.HAdapter;
import com.zzy.commonlib.http.HInterface;
import com.zzy.commonlib.http.HProxy;
import com.zzy.commonlib.http.RequestCtx;
import com.zzy.commonlib.log.MyLog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.Map;

import static com.zzy.commonlib.http.HConstant.HTTP_METHOD_POST;

/**
 * @author zzy
 * @date 2018/8/10
 */

public class DataProvider {
    private static final String TAG = "DataProvider";

//    public static void getGlobalConfig(Context context,final HInterface.DataCallback callback){
//        try {
//            Map<String, String> header = HttpUtils.getHttpHeader(context);
//
//            JSONObject body = new JSONObject();
//            body.put("key", "CSC_APP_CONFIG");
//            JSONObject data = new JSONObject();
//            data.put("data", body);
//            HttpUtils.wrapBody(data,HttpConstants.GLOBAL_CONFIG);
//
//            MyLog.e(TAG,"data:"+data);
//
//            String encryptBody = HttpUtils.onEncryptEvent(data.toString());
//
//            String contentType = HttpUtils.getMediaType();
//
//            HInterface.Decrypter decrypter = new HInterface.Decrypter() {
//                @Override
//                public String decrypt(String s) {
//                    return HttpUtils.onDecryptEvent(s);
//                }
//            };
//
//            RequestCtx ctx = new RequestCtx.Builder(HttpUtils.getServer())
//                    .method(HTTP_METHOD_POST)
//                    .headerMap(header)
//                    .body(encryptBody)
//                    .contentType(contentType)
//                    .callback(callback)
//                    .jsonParser(getGlobalConfigJsonParser)
//                    .decrypter(decrypter)
//                    .timerout(30)
//                    .build();
//            MyLog.e(TAG,"请求服务 url:"+ctx.getUrl());
//            HProxy.getInstance().request(ctx);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    static HInterface.JsonParser getGlobalConfigJsonParser = new HInterface.JsonParser() {
//        @Override
//        public Object[] parse(String str) throws JSONException {
//            MyLog.e(TAG,"服务返回:"+str);
//            if(str==null){
//                throw new JSONException("server return null");
//            }
//            JSONTokener jsonParser = new JSONTokener(str);
//            JSONObject obj = (JSONObject) jsonParser.nextValue();
//            int errorCode = obj.getInt(HttpConstants.ERROR_CODE);
//            if (errorCode == HttpConstants.NO_ERROR) {
//                return new Object[]{HttpConstants.SUCCESS, obj.getJSONObject("data").getString("value")};
//            } else {
//                String msg = obj.getString(HttpConstants.ERROR_MESSAGE);
//                return new Object[]{HttpConstants.FAIL, msg};
//            }
//        }
//    };
}
