package sitec.cc.example.common.response;

import java.io.Serializable;

public class CommonResponse<T> implements Serializable {
    private static final Integer SUCCESS = 0;
    private Integer errorCode;
    private String errorMessage;
    private boolean isSuccess =  false;
    private T data;


    public static <T> CommonResponse<T> success(T t){
        CommonResponse<T> result = new CommonResponse<>();
        result.setErrorCode(SUCCESS);
        result.setData(t);
        result.setSuccess(true);
        return result;
    }

    public static <T> CommonResponse<T> fail(Integer errorCode,String errorMessage){
        CommonResponse<T> result = new CommonResponse<>();
        result.setErrorCode(errorCode);
        result.setErrorMessage(errorMessage);
        result.setSuccess(false);
        result.setData(null);
        return result;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
