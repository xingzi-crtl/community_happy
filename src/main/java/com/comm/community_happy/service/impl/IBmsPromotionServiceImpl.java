package com.comm.community_happy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.comm.community_happy.mapper.BmsPromotionMapper;
import com.comm.community_happy.model.entity.BmsPromotion;
import com.comm.community_happy.service.IBmsPromotionService;
import org.springframework.stereotype.Service;

@Service
public class IBmsPromotionServiceImpl extends ServiceImpl<BmsPromotionMapper, BmsPromotion>
        implements IBmsPromotionService {
}
