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

    private static final long serialVersionUID = -5681306176833079763L;

    private T data;
}
