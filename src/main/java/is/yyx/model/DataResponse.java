package is.yyx.model;

import lombok.*;

/**
 * @author Ye.Yunxi
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DataResponse<T> extends Response {

    private T data;
}
