package com.viewtube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class IndexController {
	/*
	@GetMapping()
	public ModelAndView indexView() {
		System.out.println("Entering get mapping for index");
		System.out.println("Setting index to view name");
		return new ModelAndView("index");
	}

	@GetMapping(value="/index.html")
	public ModelAndView indexView2() {
		return new ModelAndView("index");
	}
	
	@GetMapping(value="index")
	public ModelAndView indexView3() {
		return new ModelAndView("index");
	}*/
}
