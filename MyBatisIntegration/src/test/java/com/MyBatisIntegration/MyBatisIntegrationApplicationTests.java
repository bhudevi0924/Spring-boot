package com.MyBatisIntegration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


import com.MyBatisIntegration.mapper.ArticleMapper;
import com.MyBatisIntegration.model.Article;

@SpringBootTest
class MyBatisIntegrationApplicationTests {

	 @Autowired
	 ArticleMapper articleMapper;

	@Test
	void contextLoads() {
		Article article = articleMapper.getArticle(1L);
		assertThat(article).isNotNull();
	    assertThat(article.getId()).isEqualTo(1L);
	    assertThat(article.getAuthor()).isEqualTo("Bhudevi");
	    assertThat(article.getTitle()).isEqualTo("Working with MyBatis in Spring Boot");
	}

}
