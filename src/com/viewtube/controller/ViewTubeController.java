package com.viewtube.controller;

import com.viewtube.mongodb.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ViewTubeController {
	
	@RequestMapping(path = "/ViewTube/#index", method = RequestMethod.GET)
	public ModelAndView viewTubeHomePath(ModelAndView view) {
		view.setViewName("/ViewTube/#index");
		return view;
	}

}
