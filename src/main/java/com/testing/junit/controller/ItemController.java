package com.testing.junit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.junit.model.Item;

@RestController
public class ItemController {

	
	@GetMapping("/items")
	public Item itemController() {
		return new Item(1, "bat", 10, 100);
	}
}
