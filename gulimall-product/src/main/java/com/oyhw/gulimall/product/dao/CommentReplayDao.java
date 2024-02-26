package com.oyhw.gulimall.product.dao;

import com.oyhw.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-25 15:44:40
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
