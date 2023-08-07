package com.java.App;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.dao.impl.CakeDAOImpl;
import com.store.dto.CakeDto;
import com.store.dto.OrderDto;

@SpringBootApplication
@Controller
public class AppApplication {

	private CakeDAOImpl cakeDao = new CakeDAOImpl();
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	
	@RequestMapping("/service.html")
	public String service(ModelMap model) {
		
		OrderDto order = new OrderDto();
		
		List<CakeDto> listCake = cakeDao.listCake(2);
		
		model.addAttribute("listCake",listCake);
		
		model.addAttribute("order",order);
		
		return "service";
		
	}
	
 	@RequestMapping("/testimonial.html")
	public String testimonial(ModelMap model) {
		return "testimonial";
	}
  	
  	@RequestMapping("/about.html")
	public String about(ModelMap model) {
		return "about";
	}
  	
  	@RequestMapping(value={"", "/index.html"})
	public String index(ModelMap model) {
  		
		OrderDto order = new OrderDto();
		
		List<CakeDto> listCake = cakeDao.listCake(2);
		
		model.addAttribute("listCake",listCake);
		
		model.addAttribute("order",order);
		return "index";
	}
  	
  	@RequestMapping("/menu.html")
	public String menu(ModelMap model) {
		return "menu";
	}
  	
  	@RequestMapping("/team.html")
	public String team(ModelMap model) {
		return "team";
	}
  	
  	@RequestMapping("/contact.html")
	public String contact(ModelMap model) {
		return "contact";
	}
	
	  @PostMapping("/save-order")
	  public String saveProduct(@ModelAttribute OrderDto orderDto,  Model model) {
		  orderDto.setStatus("inprogress");
		//List<CakeDto> listPro = cakeDao.listProduct(1);
		// model.addAttribute("listPro",listPro);
		  OrderDto order = new OrderDto();
		model.addAttribute("order",order);
		model.addAttribute("msg","Thêm mới thành công! Chúng tôi sẽ liên hệ với "+orderDto.getCustomer()+" sớm theo sdt trên!");
	    return "service";
	  }
  	
}
