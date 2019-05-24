package is.yyx.enums;

import com.google.common.collect.ImmutableMap;

public enum RestStatus {

    OK(10000000, "请求成功"),

    COMMON_STATE_ERROR_CODE_NOT_FOUND(18000101, "错误码不存在"),

    USER_PARAM_ID_IS_NULL(18001001, "用户ID不能为空"),
    USER_STATE_ID_NOT_FOUND(18001101, "用户不存在"),

    ;

    private static final ImmutableMap<Integer, RestStatus> CACHE;
    static {
        final ImmutableMap.Builder<Integer, RestStatus> builder = ImmutableMap.builder();
        for (RestStatus restStatus : values()) {
            builder.put(restStatus.getErrorCode(), restStatus);
        }
        CACHE = builder.build();
    }

    private final int errorCode;
    private final String errorDesc;

    RestStatus(int errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public static RestStatus valueOfCode(int errorCode) {
        RestStatus restStatus = CACHE.get(errorCode);
        if (restStatus == null) {
            restStatus = COMMON_STATE_ERROR_CODE_NOT_FOUND;
        }
        return restStatus;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }
}
