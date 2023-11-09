package ink.oo00oo.tellmenextsolarterm.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {

    /**
     * 业务错误编码
     */
    private String bizErrorCode;

    /**
     * 错误类型
     */
    private ServiceException.ErrorType errorType;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 错误码
     */
    private int statusCode;
}
