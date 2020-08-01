package funix.edu.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import funix.edu.entity.User;

@Controller
public class LoginController {
	public static final String VIEW = "003-Login";
	
	@RequestMapping(value = {"login"})
	public String login(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return VIEW;
	}
	
	@RequestMapping(value = "login/submit", method = RequestMethod.POST)
	public String submitLogin(HttpSession session, Model model, @Valid @ModelAttribute User user, BindingResult result) {
		System.out.println("submit");
		if (result.hasErrors()) {
			System.out.println("has error!");
			return VIEW;
		}
		session.setAttribute("user", user);
		return "redirect:" + "/admin/dashboard";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:" + "/member-area";
	}
}
