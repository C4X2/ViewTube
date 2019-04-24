package com.viewtube.controller;

import com.viewtube.mongodb.*;
import com.viewtube.user.ViewTubeViewer;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		ViewTubeViewer viewer = new ViewTubeViewer();
		view.addObject("viewtuber", viewer);
		view.addObject("login", "Login");
		return view;
	}
	
	@RequestMapping(path = "/signup", method = RequestMethod.GET)
	public ModelAndView viewTubeSignUpPath(ModelAndView view) {
		view.addObject("signup", "Sign Up!");
		view.setViewName("login");
		return view;
	}
	
	@RequestMapping(path = "/loginattempt", method = RequestMethod.POST)
	public String loginModule (@ModelAttribute("viewtuber") ViewTubeViewer vtvw, ModelAndView mav) {
		System.out.println(vtvw);
		System.out.println(vtvw.getUsername());
		System.out.println(vtvw.getPassword());
		mav.addObject("viewtuber", vtvw);
		//Add Validation logic here
		DBService.create(vtvw);
		//if vtvw was found in the database return to the index page
		//else return to the login page and complain
		return "login";
	}

}
