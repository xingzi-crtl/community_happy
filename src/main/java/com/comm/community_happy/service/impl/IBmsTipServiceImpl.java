package com.comm.community_happy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.comm.community_happy.mapper.BmsTipMapper;
import com.comm.community_happy.model.entity.BmsTip;
import com.comm.community_happy.service.IBmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IBmsTipServiceImpl extends ServiceImpl<BmsTipMapper, BmsTip>
        implements IBmsTipService {
    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try {
            todayTip = this.baseMapper.getRandomTip();
        } catch (Exception e){
            log.info("tip转换失败");
        }
        return todayTip;
    }
}
