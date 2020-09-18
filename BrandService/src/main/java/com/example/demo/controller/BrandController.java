package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BrandService;

@RestController
@RequestMapping("api")
public class BrandController {

	
	@Autowired
	BrandService brandService;
	
	@GetMapping("topbrands")
	public ResponseEntity<List<String>> getTopBrands(){
		return new ResponseEntity(brandService.topBrands(), HttpStatus.OK);
	}
}
