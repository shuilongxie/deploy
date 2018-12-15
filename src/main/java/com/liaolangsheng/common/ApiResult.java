package com.liaolangsheng.common;

public class ApiResult {
    /*
     * 必需参数
     * 状态值 仅限1=正确，0=有误
     *
     */
    protected int status;

    /*
     * 按需赋值
     * status=0时的异常或错误编码(非必填)
     */
    protected int ecode;

    /*
     * 按需赋值
     * status=0时的异常或错误描述信息(非必填)
     */
    protected String emessage;

    /*
     * 按需赋值
     * status=0时data值为空，status=1时data值为放回的数据
     */
    protected Object data;

    public static ApiResult getSuccess(){
        return getSuccess(true);
    }

    public static ApiResult getSuccess(Object data){
        ApiResult apiResult = new ApiResult();
        apiResult.setData(data);
        apiResult.setStatus(ResultConstants.SUCCESS);
        return apiResult;
    }
    public static ApiResult getFailed(int errorCode, String errorMessage){
        ApiResult apiResult = new ApiResult();
        apiResult.setStatus(ResultConstants.FAIL);
        apiResult.setEcode(errorCode);
        apiResult.setEmessage(errorMessage);
        return apiResult;
    }
    public static ApiResult getFailed(String errorMessage){
        ApiResult apiResult = new ApiResult();
        apiResult.setStatus(ResultConstants.FAIL);
        apiResult.setEmessage(errorMessage);
        return apiResult;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEcode() {
        return ecode;
    }

    public void setEcode(int ecode) {
        this.ecode = ecode;
    }

    public String getEmessage() {
        return emessage;
    }

    public void setEmessage(String emessage) {
        this.emessage = emessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
