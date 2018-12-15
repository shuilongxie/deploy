package com.liaolangsheng.deploy.controller;

import com.liaolangsheng.common.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping()
    public Object index(){
        return ApiResult.getSuccess("this is deploy home");
    }
}

