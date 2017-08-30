package com.taotao.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.pojo.ContentCategory;
import com.taotao.manager.service.ContentCategoryService;

@Controller
@RequestMapping("content/category")
public class ContentCategoryController {
	@Autowired
	private ContentCategoryService contentCategoryService;
	// url : '/rest/content/category',
	// animate: true,
	// method : "GET",
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<ContentCategory> queryContentCategoryByParentId(@RequestParam(value="id",defaultValue="0")Long parentId){
		//调用服务查询
		List<ContentCategory> list=this.contentCategoryService.queryContentCategoryByParentId(parentId);
		return list;
	}
	/**
	 * 新增
	 */
	@RequestMapping(value="add", method=RequestMethod.POST)
	@ResponseBody
	public ContentCategory saveContentCategory(ContentCategory	contentCategory){
		//调用服务保存
		ContentCategory result = this.contentCategoryService.saveContentCategory(contentCategory);
		
		return result;
		
	}
	/**
	 * 修改
	 */
	@RequestMapping(value="update", method=RequestMethod.POST)
	@ResponseBody
	public String updateContentCategoryById(ContentCategory contentCategory){
		//调用服务更新
		this.contentCategoryService.updateByIdSelective(contentCategory);
		return "200";
	}
	/**
	 * 删除
	 */
	@RequestMapping(value="delete" ,method=RequestMethod.POST)
	@ResponseBody
	public String deleteContentCategoryById(Long parentId,Long id){
		//调用服务删除
		this.contentCategoryService.deleteContentCategoryById(parentId ,id);
		return "200";
	}
}
