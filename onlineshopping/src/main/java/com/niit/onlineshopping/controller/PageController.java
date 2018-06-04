package com.niit.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
	}
	
	/*@RequestMapping(value="/test1")
	public ModelAndView test1(@RequestParam(value="greeting", required=false) String greeting){
		if(greeting==null) greeting="Hello There";
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}
	
	@RequestMapping(value="/test2/{greeting}")
	public ModelAndView test2(@PathVariable("greeting") String greeting){
		if(greeting == null) greeting="Hello There";
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}*/

}
