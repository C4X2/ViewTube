package com.viewtube.controller;

import com.viewtube.mongodb.*;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;


@Controller
public class ViewTubeController {
	
	@RequestMapping(path = "/ViewTube/#index", method = RequestMethod.GET)
	public ModelAndView viewTubeHomePath(ModelAndView view) {
		view.setViewName("/ViewTube/#index");
		return view;
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ModelAndView viewTubeLoginPath(ModelAndView view) {
		view.addObject("login", "Login");
		return view;
	}
	
	@RequestMapping(path = "/signup", method = RequestMethod.GET)
	public ModelAndView viewTubeSignUpPath(ModelAndView view) {
		view.addObject("signup", "Sign Up!");
		view.setViewName("login");
		return view;
	}

}
