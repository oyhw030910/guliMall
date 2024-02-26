package com.oyhw.gulimall.order.dao;

import com.oyhw.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-26 21:41:30
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
