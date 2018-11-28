package com.wy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class TestController {
	
	   @ResponseBody
	   @RequestMapping(value="/test1",method=RequestMethod.GET)
       public String Test() {
    	   return "test";
		
	}
}
