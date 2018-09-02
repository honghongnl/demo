package com.lh.demo.common;

public class JsonResult<T> {
    /**请求成功 */
    public static final String OK = "200";
    /**请求失败 */
    public static final String ERROR = "500";
    /**参数错误 */
    public static final String BAD = "400";
    public String msg = null;
    public String status = null;
    public T content;

    public JsonResult() {}
    public JsonResult(String status) {
        if (this.OK.equals(status)) {
            this.msg = "ok";
            this.status = this.OK;
        } else if (this.ERROR.equals(status)) {
            this.msg = "error";
            this.status = this.ERROR;
        } else if (this.BAD.equals(status)) {
            this.msg = "bad request";
            this.status = this.BAD;
        } else {
            throw new RuntimeException("请使用标准的返回格式");
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
