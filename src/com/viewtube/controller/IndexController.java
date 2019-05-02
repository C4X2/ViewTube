package com.viewtube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class IndexController {
	@GetMapping(value="/")
	public ModelAndView indexView() {
		return new ModelAndView("index");
	}
	
	@GetMapping(value="/index.html")
	public ModelAndView indexView2() {
		return new ModelAndView("index");
	}
	
	@GetMapping(value="index")
	public ModelAndView indexView3() {
		return new ModelAndView("index");
	}
}
