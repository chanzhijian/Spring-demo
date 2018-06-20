package com.csair.ndc.service.consumer.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


//@Service
//public class ConsumerServiceImpl implements ConsumerService {
	
//	Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);
//	@Resource
//	ReportService reportService;
//
//	@Override
//	public List<CurrencyWayDto> testService() {
//
//		List<CurrencyWayDto> list = null;
//		try {
//			EcsOperator ecsOperator =new EcsOperator();
//			ecsOperator.setChannelId("B2COU");
//			ecsOperator.setOpName("B2COU");
//			ecsOperator.setOrgName("B2COU");
//			ecsOperator.setOpContact("B2COU");
//			ecsOperator.setAid("B2COU");
//			ecsOperator.setOpId("B2COU");
//			ecsOperator.setOrgId("B2COU");
//			list = reportService.getCurrencyWayDto(ecsOperator);
//			logger.info("list size : {}", list.size());
//		} catch (EcsException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}

//}
