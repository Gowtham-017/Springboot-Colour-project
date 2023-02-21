package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Color {
	@GetMapping("show1")
	public String display()
	{
		String colour="Green";
		return "My favourite color is "+ colour;
		
	}


}
