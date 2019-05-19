package is.yyx.model;

import lombok.*;

/**
 * @author Ye.Yunxi
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class DataResponse<T> extends Response {

    private T data;
}
