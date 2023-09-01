package com.hangyeol.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		SqlSessionFactory sqlSessionFactory = new
				SqlSessionFactoryBean();
	}
}
