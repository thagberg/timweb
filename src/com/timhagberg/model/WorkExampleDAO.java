package com.timhagberg.model;

import java.util.List;

import com.timhagberg.bean.WorkExampleBean;

public interface WorkExampleDAO {

	public WorkExampleBean getWorkExample(int workId);
	public List<WorkExampleBean> getWorkExamples();
}
