package is.yyx.model;

/**
 * @author Ye.Yunxi
 */
public class DataResponses {

    public static <T> DataResponse<T> ok(T data) {
        DataResponse<T> response = new DataResponse<>();
        response.setErrorCode(0);
        response.setErrorDesc("OK");
        response.setData(data);
        return response;
    }

    public static DataResponse error(int code, String message) {
        DataResponse response = new DataResponse();
        response.setErrorCode(code);
        response.setErrorDesc(message);
        return response;
    }
}
