package com.timhagberg.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ContactController {

	@RequestMapping(value="/contact")
	public String getContact(Model model) {
		
		model.addAttribute("emailMailTo", "mailto:timothy.m.hagberg@gmail.com");
		model.addAttribute("emailAddress", "timothy.m.hagberg@gmail.com");
		model.addAttribute("phoneNumber", "(334) 306-5821");
		model.addAttribute("twitterAddress", "http://twitter.com/#!/TimothyHagberg");
		model.addAttribute("twitterName", "@TimothyHagberg");
		model.addAttribute("facebookAddress", "http://www.facebook.com/profile.php?id=732879067");
		model.addAttribute("facebookName", "Tim Hagberg");
		
		return "contact";
	}
}
