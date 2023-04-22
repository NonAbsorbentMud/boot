package own.cfb.boot.domain;

import java.io.Serializable;

public class Response<T> implements Serializable {
    /**
     * 响应代码 0=成功 其他=失败
     */
    private Integer code = 0;

    /**
     * 响应信息，主要用于code!=0时，记录错误信息
     */
    private String msg;

    /**
     * 返回的对象
     */
    private T result;

    /**
     * result的总数量
     */
    private Long totalCount;

    private Long totalPages;
    /**
     * 接口开始调用时间
     */
    private long startTime;
    /**
     * 接口调用用时
     */
    private Long totalTime;

    /**
     * 初始化时保存初始化时间戳
     */
    public Response(){
        startTime=System.currentTimeMillis();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }
}
