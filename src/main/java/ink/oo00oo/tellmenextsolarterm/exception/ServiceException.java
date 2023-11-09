package ink.oo00oo.tellmenextsolarterm.exception;

import lombok.Data;

@Data
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }

    /**
     * 状态码
     */
    private int statusCode;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误类型
     */
    private ErrorType errorType;

    /**
     * 错误枚举
     */
    public enum ErrorType {
        CLIENT,
        SERVER,
        UNKNOWN,
    }

}
