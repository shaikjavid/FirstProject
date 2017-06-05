package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;

@Controller
public class AdminCategoryController 
{
@Autowired
CategoryDao categoryDao;

@RequestMapping("/mgncat")
public ModelAndView categoryd()
{
ModelAndView mv = new ModelAndView("AdminCategory");
return mv;
}
//listing the category data from database to datatable
@RequestMapping("/categories/all")
public @ResponseBody List<Category> categoriesall() 
{
System.out.println("display category list");
return categoryDao.allCategories();

}
@RequestMapping("/addcategory")
public String addCategory(@ModelAttribute("category") Category category,BindingResult result,ModelMap model) {
System.out.println("entered into add category");
categoryDao.newCategory(category);
return "AdminCategory";
}

@RequestMapping("/{id}/editcategory")
public String editcategory(@PathVariable Integer id,ModelMap model) {
	System.out.println("i am in edit category control fun");
	model.addAttribute("editcategory", true);
	model.addAttribute("category",categoryDao.getCategory(id));
	return "AdminCatDML";
}
@RequestMapping("/{id}/updatecategory")
public String updateCategory(@ModelAttribute("category") Category category, BindingResult result,ModelMap model) {
	System.out.println("entered add category");
	categoryDao.update(category);
	model.addAttribute("categories", true);
	return "AdminCategory";
}
@RequestMapping("/{id}/deletecategory")
public String deleteCategory(@PathVariable Integer id, ModelMap model) {
	categoryDao.deleteCategory(id);
	model.addAttribute("categories",true);
	return "AdminCategory";
	
}
@RequestMapping("/newcat")
public ModelAndView NewAddCat()
{
	ModelAndView m = new ModelAndView("AdminCatDML");
	m.addObject("newcategory",true);
	m.addObject("category",new Category());
	return m;
}
//admin header mapping
@RequestMapping("/adh")
public ModelAndView Admin()
{
			return new ModelAndView("adminpage");
}

}
