package com.line.code.code.one.base.domain;


/**
 * @Author: yangcs
 * @Date: 2020/3/27 14:04
 * @Description: crms项目前段页面统一返回对象
 */
public class Response<T> {

    //成功与否
    private Boolean success;
    //数据
    private T rows;
    //分页总行数
    private Integer total;
    //返回信息
    private String result;


    /**
     * @param rows  列表数据
     * @param total 总条数
     * @Description: 构建成功信息
     */
    public static <T> Response<T> buildSuccessResponse(T rows, Integer total) {
        return new Response<T>(Boolean.TRUE, rows, total);
    }

    /**
     * @param msg 返回消息
     * @Description: 构建失败消息
     */
    public static Response buildFailureResponse(String msg) {
        return new Response(Boolean.FALSE, msg);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public Response() {

    }

    public Response(Boolean success, String result) {
        this.success = success;
        this.result = result;
    }

    public Response(T rows, Integer total) {
        this.rows = rows;
        this.total = total;
    }

    public Response(Boolean success, T rows, Integer total) {
        this.success = success;
        this.rows = rows;
        this.total = total;
    }

    public Response(T rows, Integer total, String result) {
        this.rows = rows;
        this.total = total;
        this.result = result;
    }
}
