package com.zhang.provider.client;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Yuman.Zhang
 * @Date 2023/3/9 17:49
 * @Description @RequestMapping 和下面的 @PostMapping不能省，为了让别的服务可以通过@FeignClient注解调用
 */
@RequestMapping("/hello")
public interface HelloWorldClient {

    
    @PostMapping("/sayHello")
    String sayHello();
}
