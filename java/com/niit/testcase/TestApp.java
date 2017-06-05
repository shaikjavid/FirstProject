package com.niit.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.config.ApplicationContextConfig;
import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.RegisterDao;
import com.niit.model.Category;
import com.niit.model.Chronicling;
import com.niit.model.Product;


public class TestApp 
{
	@SuppressWarnings("resource")
	public static void main(String[] ar)
	{
		System.out.println("i am in main class");
		
		
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		//context.scan("com.niit");
		//context.refresh();
		/*RegisterDao regDao=(RegisterDao)context.getBean("regDao");
		 Chronicling chronicling=new Chronicling();
		 chronicling.setOnlineMail("shaikjavid029@gmail.com");
		 chronicling.setUSername("Javid");
		 chronicling.setContactno("9177670825");
		 chronicling.setSecretword("jhonny@10");
		 
		 regDao.addData(chronicling);*/
		 
		CategoryDao catDao= (CategoryDao) context.getBean("catDao");
		/*	Category category=new Category();
		
			category.setCatname("Samsung");
			catDao.newCategory(category);
		*/

			
/*		ProductDao productDao=(ProductDao) context.getBean("productDao");
		
		
			Product product=new Product();
			
			product.setProductName("iphone");
			product.setProductDespription("latest model");
			product.setProductPrice(34000);
			product.setQuantity(2);
			product.setStatus(true);
			product.setCategory(catDao.getCategory(1));
			productDao.addProduct(product);
*/}
	
	

}
