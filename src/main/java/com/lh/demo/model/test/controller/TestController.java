package com.lh.demo.model.test.controller;

import com.lh.demo.common.JsonResult;
import com.lh.demo.config.InitParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private InitParameter initParameter;

    @RequestMapping(value = "/test")
    public JsonResult<String> testJson() {
        try {
            logger.info("测试请求");
            return new JsonResult(JsonResult.OK);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return new JsonResult(JsonResult.ERROR);
    }
}
