package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.ItemResponse;

@FeignClient(name="catalog-service", url="http://localhost:8088")
public interface CatalogServiceProxy {

	@RequestMapping(method=RequestMethod.GET, value = "/api/items")
	ResponseEntity<List<ItemResponse>> getItems();	
}
