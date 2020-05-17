package com.example.backend.vo;

public class ResponseVO {

    /**
     * 调用是否成功
     */
    private boolean success;

    /**
     * 返回的提示
     */
    private String message;

    /**
     * 内容
     */
    private Object content;

    public static ResponseVO buildSuccess() {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(true);
        return responseVO;
    }

    public static ResponseVO buildSuccess(Object content) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(true);
        responseVO.setContent(content);
        return responseVO;
    }


    public static ResponseVO buildFailure(String message) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(false);
        responseVO.setMessage(message);
        return responseVO;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
