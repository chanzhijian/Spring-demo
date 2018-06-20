package com.csair.ndc.service.provider.impl;

import org.springframework.stereotype.Service;

import com.csair.ndc.service.provider.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService{

	@Override
	public String providerServiceTest() {
		
		return "providerServiceTest";
	}

}
