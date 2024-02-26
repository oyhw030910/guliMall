package com.oyhw.gulimall.member.dao;

import com.oyhw.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-26 21:35:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
