package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages="com.example.dao")
@EnableTransactionManagement
@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(DemoApplication.class,args);
		/*SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setBannerMode(Banner.Mode.OFF);// 关闭启动Banner
		app.run(args);*/

	}
}
