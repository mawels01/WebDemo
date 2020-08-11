package com.example.webdemo.item;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;


@Service
public class ItemService {

	private List<Item> items = Arrays.asList(
			new Item("1","Phone","Phone 2020",25000.00),
			new Item("2","NoteBook","NoteBook 2020",35000.00),
			new Item("3","Charger","Charger 2020",2500.00)
	);
	
	
	public List<Item> getAllItems(){
		return items;
	}
			
			
	
}
