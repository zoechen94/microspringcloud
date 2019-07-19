package com.andlinks.springcloud.common;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResultData<T> {
    private  int code;
    private T content;
    private  String msg;

    /**
     * 成功
     * @param t
     * @param <T>
     * @return
     */
    public   static<T> ResultData<T>  success(T t){
       ResultData<T> resultData=new ResultData<>();
       resultData.code=200;
       resultData.content=t;
       resultData.msg="success";
       return resultData;
    }

    /**
     * 失败
     * @param t
     * @param <T>
     * @return
     */
    public static <T> ResultData<T> error(T t){
        ResultData<T> resultData=new ResultData<>();
        resultData.code=400;
        resultData.content=t;
        resultData.msg="error";
        return resultData;
    }
}
