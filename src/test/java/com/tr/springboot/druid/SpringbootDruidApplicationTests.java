package com.tr.springboot.druid;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
class SpringbootDruidApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
		System.out.println("数据源为：" + dataSource.getClass());
	}

}
