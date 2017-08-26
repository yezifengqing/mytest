package com.taotao.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;

@Controller
@RequestMapping("item/cat")

public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	//分页查询商品
	@RequestMapping("query/{page}")
	@ResponseBody
	public List<ItemCat> queryItemCatByPage(@PathVariable("page") Integer page,@RequestParam("rows") Integer rows){
		
		/*List<ItemCat> list = this.itemCatService.queryItemCatByPage(page, rows);*/
		List<ItemCat> list = this.itemCatService.queryListByPage(page, rows);
		return list;
		
	}
//	url:'/rest/item/cat',
//		method:'GET',
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<ItemCat> queryItemCatByParentId(@RequestParam(value="id",defaultValue="0") Long parentId){
		List<ItemCat> list=this.itemCatService.queryItemCatByParentId(parentId);
		return list;
	}
}
