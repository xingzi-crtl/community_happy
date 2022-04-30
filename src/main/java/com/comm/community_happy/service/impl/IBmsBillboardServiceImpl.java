package com.comm.community_happy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.comm.community_happy.mapper.BmsBillboardMapper;
import com.comm.community_happy.model.entity.BmsBillboard;
import com.comm.community_happy.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper, BmsBillboard>
        implements IBmsBillboardService {
}
