package com.example.webdemo.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@Autowired
	public ItemService itemService;
	
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		
		return itemService.getAllItems();
	}
	
}
