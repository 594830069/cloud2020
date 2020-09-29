package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lilong
 * @date 2020/9/29 16:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}

