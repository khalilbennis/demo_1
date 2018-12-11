package com.example.demo;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthTest {

	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("email") Optional<String> email,@RequestParam("password") Optional<String> password) {
		ModelAndView mv  =  new ModelAndView("login");
		ModelAndView mv2  =  new ModelAndView("login2");
		if(email.isPresent() && password.isPresent()) {
			String em = email.get();
			String pass = password.get();
			if(em.equals("houda@houda.com") && pass.equals("houda")) {
				mv2.addObject("email",em);
				mv2.addObject("password",pass);
				return mv2;
			}
		}
		return mv;
	}
	
}
