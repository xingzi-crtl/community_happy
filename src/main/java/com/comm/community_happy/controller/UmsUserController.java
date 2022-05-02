package com.comm.community_happy.controller;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.comm.community_happy.common.api.ApiResult;
import com.comm.community_happy.model.dto.RegisterDTO;
import com.comm.community_happy.model.entity.UmsUser;
import com.comm.community_happy.service.IUmsUserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/usm/user")
public class UmsUserController extends BaseController{
    @Resource
    private IUmsUserService iUmsUserService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ApiResult<Map<String,Object>> register(@Valid @RequestBody RegisterDTO dto){

        UmsUser user = iUmsUserService.executeRegister(dto);
        if(ObjectUtils.isEmpty(user)){
            return  ApiResult.failed("账号注册失败");

        }
        Map<String,Object> map = new HashMap<>(16);
        map.put("user",user);
        return  ApiResult.success(map);
    }

}
