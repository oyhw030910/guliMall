package com.oyhw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyhw.common.utils.PageUtils;
import com.oyhw.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-26 21:28:05
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

