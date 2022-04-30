package com.comm.community_happy.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.comm.community_happy.common.api.ApiResult;
import com.comm.community_happy.model.entity.BmsBillboard;
import com.comm.community_happy.service.IBmsBillboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/billboard")
public class BmsBillboardController extends BaseController{
    @Resource
    private IBmsBillboardService bmsBillboardService;

    @GetMapping("/show")
    public ApiResult<BmsBillboard> getNotices(){
        List<BmsBillboard> list = bmsBillboardService.list(new
                LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::isShow,true));
        return ApiResult.success(list.get(list.size()-1));

    }


}
