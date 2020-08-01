package funix.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminPanelController {
	public static final String VIEW = "007-AdminPanel";
	
	@RequestMapping(value = "dashboard")
	public String login(Model model) {
		System.out.println("admin!");
		return VIEW;
	}
}
