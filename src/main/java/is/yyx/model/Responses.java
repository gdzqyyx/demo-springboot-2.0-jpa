package is.yyx.model;

/**
 * @author Ye.Yunxi
 */
public class Responses {

    public static Response ok() {
        Response response = new Response();
        response.setErrorCode(0);
        response.setErrorDesc("OK");
        return response;
    }

    public static Response error(int code, String message) {
        Response response = new Response();
        response.setErrorCode(code);
        response.setErrorDesc(message);
        return response;
    }
}
