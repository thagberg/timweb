package com.timhagberg.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timhagberg.model.AboutDAO;

@RequestMapping
@Controller
public class AboutController {

	private AboutDAO aboutDao;

	@RequestMapping(value="/about")
	public String getAbout(Model model) {
		
		model.addAttribute("aboutText", aboutDao.getAboutText());
		
		return "about";
	}
	
	public AboutDAO getAboutDao() {
		return aboutDao;
	}

	public void setAboutDao(AboutDAO aboutDao) {
		this.aboutDao = aboutDao;
	}
	
}
