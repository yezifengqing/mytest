package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("page")
@Controller
public class PageController {
	/**
	 * 页面跳转
	 */
	
	@RequestMapping("{pageName}")
	public String toPage(@PathVariable("pageName")String pageName){
		return pageName;
	}
}
