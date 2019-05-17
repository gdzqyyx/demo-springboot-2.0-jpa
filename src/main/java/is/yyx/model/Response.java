package is.yyx.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Response implements Serializable {

    private static final long serialVersionUID = 8101047308524213813L;

    @ApiModelProperty(value = "错误码（0：成功；非0：失败）", example = "0", required = true)
    private Integer errorCode;

    @ApiModelProperty(value = "错误描述信息", example = "OK", required = true)
    private String errorDesc;
}
