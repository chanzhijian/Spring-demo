package com.csair.ndc.test;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csair.ndc.model.OrderChangeRQ.OrderChangeRQ;
import com.csair.ndc.util.HttpClientUtil;
import com.csair.ndc.util.JAXBUtil;

public class RestInterfaceClient {
	private static Logger logger = LoggerFactory
			.getLogger(RestInterfaceClient.class);

//	@Test
	public void httpClinetMethod() {
		String url = "http://10.108.68.49:8081/ndc172/consumer";
		String result = HttpClientUtil.doPost(url);
		logger.info("result : {}", result);
	}
	
//	@Test
	public void testRefundMethod() {	
		logger.info("begin");
		
		String url = "http://10.108.68.49:8081/ndc172/outside/international/refund/orderchange";
		Map<String, String> map = new HashMap<String, String>();
		OrderChangeRQ orderChangeRQ = new OrderChangeRQ();
		orderChangeRQ.setAltLangID("test");
		String param = JAXBUtil.toXML(orderChangeRQ);
		
		logger.info("param : {}", param);
		map.put("OrderChangeRQ", param);
		String result = HttpClientUtil.doPostXML(url, param);
		logger.info("result : {}", result);
	}

}
