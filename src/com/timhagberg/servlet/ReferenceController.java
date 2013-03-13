package com.timhagberg.servlet;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.timhagberg.bean.ReferenceBean;
import com.timhagberg.model.ReferenceDAO;

@RequestMapping
@Controller
public class ReferenceController {

	private ReferenceDAO referenceDao;
	
	@RequestMapping(value="/reference", method=RequestMethod.GET)
	public @ResponseBody List<ReferenceBean> getReferencesJSON() {
		
		return referenceDao.getReferences();
	}
	@RequestMapping(value="/references")
	public String getReferences(Model model) {
		
		List<ReferenceBean> references = referenceDao.getReferences();
		
		model.addAttribute("references", references);
		
		return "references";
	}

	public ReferenceDAO getReferenceDao() {
		return referenceDao;
	}

	public void setReferenceDao(ReferenceDAO referenceDao) {
		this.referenceDao = referenceDao;
	}
}
