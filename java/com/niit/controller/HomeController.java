package com.niit.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.ProductDao;
import com.niit.dao.RegisterDao;
import com.niit.model.Chronicling;
import com.niit.model.Product;

@Controller
public class HomeController 
{
	@Autowired
	RegisterDao regdao;
	
		@RequestMapping("/")
	public ModelAndView Home(Principal principal)
	{
		if(principal!=null)
		{
		Chronicling user=	regdao.getOnlinemail(principal.getName());
		if(user.getRole().equals("ROLE_ADMIN"))
		{
			return new ModelAndView("adminpage");
		}
		else
		{
			return new ModelAndView("CustomerProductDisplayPage");
		}
		
		}
		return new ModelAndView("index");
	}

	@RequestMapping("/reg")
	public ModelAndView SignUp()
	{
		Chronicling userpage = new Chronicling();
		return new ModelAndView("Registration","UserDetails",userpage);
	}
	
	@RequestMapping("/register")
	public ModelAndView Reg(@ModelAttribute("UserDetails") Chronicling user , BindingResult result)
	{
		System.out.println("i am in reg controller");
		if(result.hasErrors())
		{
		return new ModelAndView("Registration");
		}
		
		regdao.addData(user);
		return new ModelAndView("Registration");
	}

	@RequestMapping("/login")
	//@GetMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error, ModelMap model) {
		System.out.println(error);
		if (error != null) {
			model.addAttribute("error", "Authentication Failed - Invalid credentials!");
			return "Gainaccess";
		}

		model.addAttribute("title", "Login");
		return "Gainaccess";
	}
	
	@RequestMapping("/log")
	public ModelAndView logout()
	{
				return new ModelAndView("index");
	}


	@RequestMapping("/get")
	public ModelAndView getintouch()
	{
				return new ModelAndView("Getintouch");
	}
	@RequestMapping("/abt")
	public ModelAndView Aboutus()
	{
				return new ModelAndView("Aboutus");
	}
	
	//service
	@RequestMapping("/ser")
	public ModelAndView services()
	{
				return new ModelAndView("Services");
	}

//products--->>mobiles
	@RequestMapping("/mob")
	public ModelAndView mobiles()
	{
				return new ModelAndView("mobiles");
	}
	//accessories--->>mobiles
		@RequestMapping("/acc")
		public ModelAndView accessories()
		{
					return new ModelAndView("Accessories");
		}
	
	
	@Autowired
	ProductDao productDao;

	@RequestMapping("/{id}/viewproduct")
	public String viewProduct(@PathVariable Integer id,ModelMap model)
	{System.out.println("view product");

	model.addAttribute("product",productDao.get(id));
	return "viewproduct";
	}

	
}
