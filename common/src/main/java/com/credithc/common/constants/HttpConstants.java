package com.credithc.common.constants;

/**
 * @author zzy
 * @date 2018/8/10
 */

public class HttpConstants {
    //测试环境
    public static String SERVER_ADDRESS = "https://api-test.duolerong.com/csc-api";
    public static String AES_KEY = "!$@C438ai%^2^&*b";

    //是否加密
    public static boolean IS_ENCRYPT = true;

    public static final int SUCCESS = 0;
    public static final int FAIL = 1;
    public static final int NO_ERROR = 0;
    public static final String ERROR_CODE = "code";
    public static final String ERROR_MESSAGE = "msg";


    //业务接口
    //获取全局配置
    public static final String GLOBAL_CONFIG = "getGlobalConfig";

}
