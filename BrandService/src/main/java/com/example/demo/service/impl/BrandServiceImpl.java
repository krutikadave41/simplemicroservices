package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.dto.ItemResponse;
import com.example.demo.service.BrandService;
import com.example.demo.service.CatalogServiceProxy;

@Component
public class BrandServiceImpl implements BrandService {

	@Autowired
	CatalogServiceProxy catalogServiceProxy;
	
	@Override
	public List<String> topBrands() {
		ResponseEntity<List<ItemResponse>> items = catalogServiceProxy.getItems();
		List<ItemResponse> itemResponseList = items.getBody();
		List<String> topBrands = itemResponseList.stream().filter(i->Integer.valueOf(i.getRating())>3).map(i->i.getBrand()).collect(Collectors.toList());
		return topBrands;
	}

}
