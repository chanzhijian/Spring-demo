package com.csair.ndc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csair.ndc.service.provider.ProviderService;

/**
 * 简易消费者
 * 測試dubbo_provider
 * @author Administrator
 *
 * @date 2018-6-8
 */
public class dubboConmsumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("classpath:dubbo_consumer.xml");
		ProviderService  server =(ProviderService) context.getBean("testProviderService");
			String  list = server.providerServiceTest();
			System.out.println("ReportService : "+ list);
	}
}
