package com.timhagberg.servlet;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timhagberg.bean.WorkExampleBean;
import com.timhagberg.model.WorkExampleDAO;

@RequestMapping
@Controller
public class WorkExampleController {

	private WorkExampleDAO workExampleDao;

	@RequestMapping(value="/workexamples")
	public String getWorkExamples(Model model) {
		
		List<WorkExampleBean> workExamples = workExampleDao.getWorkExamples();
		
		model.addAttribute("workExamples", workExamples);
		
		return "workexamples";
	}
	
	public WorkExampleDAO getWorkExampleDao() {
		return workExampleDao;
	}

	public void setWorkExampleDao(WorkExampleDAO workExampleDao) {
		this.workExampleDao = workExampleDao;
	}
}
