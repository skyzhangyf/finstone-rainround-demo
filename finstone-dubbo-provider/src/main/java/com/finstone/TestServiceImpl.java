package com.finstone;

/**
 * @author zhangyf
 * @description
 * @date 2019/4/23/023
 */
public class TestServiceImpl  implements TestService {
    @Override
    public String sayHello(String str) {
        return "hello word:"+str;
    }
}