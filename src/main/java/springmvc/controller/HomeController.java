package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/seller")
public class HomeController {
	
	// index page
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("home page");
		model.addAttribute("name", "Umesh Gaur");
		model.addAttribute("course" , "java and Spring");
		
		List<String> allCourses = new ArrayList<String>();
		allCourses.add("java");
		allCourses.add("python");
		allCourses.add("Cpp");
		allCourses.add("C#");
		allCourses.add("kotlin");
		model.addAttribute("allCourses", allCourses);
		return "index";
	}
	// about page
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		// setting data
		modelAndView.addObject("name", "Umesh");
		modelAndView.addObject("rollNo",5235);
		
		LocalDateTime time = LocalDateTime.now(); 
		modelAndView.addObject("time",time);

		// subjects
		List<String> subjects = new ArrayList<String>();
		subjects.add("maths");
		subjects.add("science");
		subjects.add("chemistry");
		
		modelAndView.addObject("subjects", subjects);
		
		// setting view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}

