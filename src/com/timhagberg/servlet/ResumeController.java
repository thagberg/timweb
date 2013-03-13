package com.timhagberg.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class ResumeController {

	@RequestMapping(value="/resume")
	public String getResume() {
		
		return "resume";
	}
}
