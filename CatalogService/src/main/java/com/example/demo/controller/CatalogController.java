package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Item;

@RestController
@RequestMapping("api")
public class CatalogController {

	@GetMapping("items")
	public ResponseEntity<List<Item>> getItems(){
		List<Item> items = new ArrayList<>();
		Item item1 =new Item(1, "Running Shoes", "Nike", "4");
		Item item2 =new Item(2, "Solid Sweatshirt", "Roadster", "2");
		Item item3 =new Item(3, "Sling Bag", "H&M", "3");
		Item item4 =new Item(4, "Moisturizer", "Nivea", "4");
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		return new ResponseEntity(items, HttpStatus.OK);
	}
	
}
