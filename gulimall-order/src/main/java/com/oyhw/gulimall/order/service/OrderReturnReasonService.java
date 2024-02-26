package com.oyhw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyhw.common.utils.PageUtils;
import com.oyhw.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-26 21:41:30
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

