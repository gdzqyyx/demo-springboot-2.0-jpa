package is.yyx.exception;

import is.yyx.enums.RestStatus;

public class RestException extends RuntimeException {

    private static final long serialVersionUID = -5837148155576001638L;

    private final RestStatus restStatus;
    private final transient Object detail;

    public RestException(RestStatus restStatus) {
        super(restStatus.getErrorDesc());
        this.restStatus = restStatus;
        this.detail = null;
    }

    public RestException(RestStatus restStatus, Object detail) {
        super(restStatus.getErrorDesc() + " [" + detail + "]");
        this.restStatus = restStatus;
        this.detail = detail;
    }

    public RestException(RestStatus restStatus, Throwable cause) {
        super(restStatus.getErrorDesc(), cause);
        this.restStatus = restStatus;
        this.detail = null;
    }

    public RestException(RestStatus restStatus, Object detail, Throwable cause) {
        super(restStatus.getErrorDesc() + " [" + detail + "]", cause);
        this.restStatus = restStatus;
        this.detail = detail;
    }

    public RestStatus getRestStatus() {
        return restStatus;
    }

    public Object getDetail() {
        return detail;
    }
}
