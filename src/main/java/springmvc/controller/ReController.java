package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
		@RequestMapping(path = "/one")
		public String one() {
			System.out.println("one request handler");
			return "redirect:/two";
		}
		
		@RequestMapping(path = "/two")
		public RedirectView two() {
			System.out.println("two request handler");
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("contact");
			
			return redirectView;
		}
}
