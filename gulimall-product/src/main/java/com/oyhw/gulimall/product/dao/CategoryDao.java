package com.oyhw.gulimall.product.dao;

import com.oyhw.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author oyhw
 * @email oyhw030910@gmail.com
 * @date 2024-02-25 15:44:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
