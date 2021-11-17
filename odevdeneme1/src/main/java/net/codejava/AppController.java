package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	
	  @Autowired
	     private ders_odevRepository  repo;
	  
	  @GetMapping("/")
	     public String listUsers(Model model,@Param("keyword") String keyword) {
   	   List<Ders_odev> listUsers;
   	 if(keyword!=null) {    	
   		 listUsers =repo.search(keyword);
        model.addAttribute("listUsers", listUsers);
        model.addAttribute("keyword",keyword);
	  }
        return "index";
    }
    
}
