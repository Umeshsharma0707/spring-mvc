package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(@RequestParam("email") String email, @RequestParam("userName") String name,
			@RequestParam("userPassword") String userPassword, Model model) {
		
		model.addAttribute("email",email);
		model.addAttribute("name",name);
		model.addAttribute("userPassword", userPassword);
		
		System.out.println("user email : " + email);
		System.out.println("user name : " + name);
		System.out.println("user password : " + userPassword);
		return "success";
	}
}
