package com.oyhw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyhw.common.utils.PageUtils;
import com.oyhw.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-26 21:35:20
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

