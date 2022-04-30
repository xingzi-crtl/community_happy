package com.comm.community_happy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.community_happy.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
