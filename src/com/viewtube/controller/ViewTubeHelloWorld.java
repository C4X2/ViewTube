package com.viewtube.controller;

import com.viewtube.mongodb.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
/**
 * @author- C4X2
 * 
 */
 
@Controller
public class ViewTubeHelloWorld {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		//JavaMongoDBConnection jmdbc = new JavaMongoDBConnection();
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping(path = "/about")
	public ModelAndView about() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("about","aboutUsText",message);
		
	}
	
	@RequestMapping(path = "/subscriptions")
	public ModelAndView subscriptions() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("subscriptions","subscriptions",message);
		
	}
	
	@RequestMapping(path = "/contactus", method= RequestMethod.GET)
	public ModelMap contactus(ModelMap map) {
		String attribute = "contactus";
		String message = "Feel free to contact us!";
		
		map.addAttribute(attribute, message);
		
		return map;
		
	}
	
	@RequestMapping(path = "/developer", method = RequestMethod.GET)
	public ModelAndView developer(ModelAndView mvc) {
		String html = "<p>If you are interested in developing an application that works with ViewTube, "
				+ "you can find our code and APIs on <a href='https://github.com/C4X2/ViewTube' target='blank'>github</a></p>";
		
		mvc.addObject("developer", html);
		mvc.setViewName("contactus");
		contactus(mvc.getModelMap());
		return mvc;
	}
	
	
}
