package funix.edu.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import funix.edu.entity.User;

@Controller
public class MemberController {
	
	@RequestMapping(value = {"/member-area", "/"}, method = RequestMethod.GET)
	public String checkLogin(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return "redirect:" + "/admin/dashboard";
		}else {
			return "redirect:" + "/login";
		}
	}

}
