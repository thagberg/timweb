package com.timhagberg.model;

import java.util.List;

import com.timhagberg.bean.ReferenceBean;

public interface ReferenceDAO {

	
	public ReferenceBean getReferenceById(int referenceId);
	
	public List<ReferenceBean> getReferences();
}
