package com.comm.community_happy.controller;

import com.comm.community_happy.common.api.ApiResult;
import com.comm.community_happy.model.entity.BmsTip;
import com.comm.community_happy.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController{
    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip(){
         BmsTip tip = bmsTipService.getRandomTip();
         return ApiResult.success(tip);
    }

}
