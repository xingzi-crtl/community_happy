package com.comm.community_happy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.comm.community_happy.model.dto.RegisterDTO;
import com.comm.community_happy.model.entity.UmsUser;

public interface IUmsUserService extends IService<UmsUser> {

    /**
     * 注册功能
     * @param dto
     * @return
     */
    UmsUser executeRegister(RegisterDTO dto);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    //UmsUser getUserByUsername(String username);



}
