package com.taotao.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.service.DateTest;

@Controller
@RequestMapping("test")
public class DateControllerTest {

	@Autowired
	private DateTest dateTest;
	
	@RequestMapping("date")
	@ResponseBody
	public String queryDate(){
		System.out.println("11111111111111111");
		return dateTest.queryDate();
	}
}
