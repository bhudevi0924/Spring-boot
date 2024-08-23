package com.MyBatisIntegration.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.MyBatisIntegration.model.Article;

@Mapper
public interface ArticleMapper {
	  @Select("SELECT * FROM ARTICLES WHERE id = #{id}")
	    Article getArticle(@Param("id") Long id);
}
