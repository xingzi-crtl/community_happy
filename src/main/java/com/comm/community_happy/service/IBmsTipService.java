package com.comm.community_happy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.comm.community_happy.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
