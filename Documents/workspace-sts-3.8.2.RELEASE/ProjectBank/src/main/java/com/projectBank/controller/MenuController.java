//package com.projectBank.controller;
//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

//import com.projectBank.Repository.MenuRepository;
//import com.projectBank.model.Menu;

//@Controller
/**public class MenuController{
	
	@Autowired
	private MenuRepository menuRepo;
	
	@RequestMapping(value= "/list", method= RequestMethod.GET)
	public List<Menu>listmenu(){
		
		return (List<Menu>) menuRepo.findAll();
		
	}
	
	

}
**/