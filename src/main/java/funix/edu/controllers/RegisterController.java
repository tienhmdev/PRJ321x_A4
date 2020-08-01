package funix.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import funix.edu.entity.User;

@Controller
public class RegisterController {
	public static final String VIEW = "002-Register";
	
	@RequestMapping(value = "/register")
	public String login(Model model) {
		User user = new User();
		user.setAddress("Quang Binh");
		model.addAttribute("user", user);
		return VIEW;
	}
	
	@RequestMapping(value = "/register/submit")
	public String submit(Model model, @ModelAttribute("user") User user) {
		System.out.println("submit: " + user.toString());
		return VIEW;
	}
}
