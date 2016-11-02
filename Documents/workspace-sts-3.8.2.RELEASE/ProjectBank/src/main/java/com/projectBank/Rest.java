package com.projectBank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projectBank.Repository.MenuRepository;
import com.projectBank.model.Menu;

@RestController
public class Rest{
	
	@Autowired
	private MenuRepository menuRepo;	
	 @RequestMapping("/test")
	    public String index(){
		 String tes = "Testing run Salahdin Lahnoud Spring Boot";
		 return tes;
	    }		
		@RequestMapping(value= "/list", method= RequestMethod.GET)
		public List<Menu>listmenu(){			
			return (List<Menu>) menuRepo.findAll();
		}
		
	//	@RequestMapping(value= "/search/{description}", method= RequestMethod.GET)
	//	public List<Menu>getBydescription(@PathVariable String description){
	//		return (List<Menu>) menuRepo.findBydescription(description);						
	//	}		
		@RequestMapping(value="/save", method= RequestMethod.GET)
		public Menu saveMenu(Menu m){
			return menuRepo.save(m);			
		}		
		@RequestMapping(value="/all", method= RequestMethod.GET)
		public List<Menu> getAll(){			
			return (List<Menu>) menuRepo.findAll();			
		}
		/**@RequestMapping("/Menu")
		public Page<Menu> getMenu(int page){			
			return menuRepo.findAll(new PageRequest(page, 5));			
		}
		**/		
}
