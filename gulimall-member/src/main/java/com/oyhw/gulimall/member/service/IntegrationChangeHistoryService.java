package com.oyhw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyhw.common.utils.PageUtils;
import com.oyhw.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-26 21:35:20
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

