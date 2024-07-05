package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("heading", "this page is handled by Spring MVC");
		model.addAttribute("desc", "feel free to use this form");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processForm" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute() User user , Model model ) {
		
		int id = this.userService.createUser(user);
		
		
		
		model.addAttribute("msg", "user created at id " + id);
		System.out.println(user);
		return "success";
	}
	
	/*
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST) public
	 * String processForm(@RequestParam(name = "email", required = true,
	 * defaultValue = "default@gmail.com") String email, @RequestParam("userName")
	 * String name,
	  
	 * @RequestParam("userPassword") String userPassword, Model model) {
	 * 
	 * User user = new User();
	 * 
	 * user.setEmail(email); user.setUserPassword(userPassword);
	 * user.setUserName(name); System.out.println(user);
	 * 
	 * model.addAttribute("user",user);
	 * 
	 * 
	 * model.addAttribute("email",email); model.addAttribute("name",name);
	 * model.addAttribute("userPassword", userPassword);
	 * 
	 * System.out.println("user email : " + email);
	 * System.out.println("user name : " + name);
	 * System.out.println("user password : " + userPassword);
	 * 
	 * return "success"; }
	 */
}
