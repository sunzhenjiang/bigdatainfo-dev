package com.jinyinmao.info.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {

	@RequestMapping(value = "/demo/{purchase}", method = RequestMethod.GET)
	public ModelAndView Demo(@PathVariable String purchase) {
		ModelAndView moView = new ModelAndView("datatables");
		moView.addObject("purchase",  purchase);
		return moView;
	}
	@RequestMapping(value = "/logs/{purchase}",method = RequestMethod.GET)
	public ModelAndView Logs(@PathVariable String purchase) {
		ModelAndView moView = new ModelAndView("logentitys");
		moView.addObject("purchase",  purchase);
		return moView;
	}

}
