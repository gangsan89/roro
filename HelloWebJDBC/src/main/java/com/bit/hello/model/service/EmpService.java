package com.bit.hello.model.service;


import java.util.List;

import com.bit.hello.model.dto.Emp;
import com.bit.hello.model.dto.EmpInfo;

public interface EmpService {
	Emp loginProcess(int empNo, String eName);

	void loginProcess(Emp emp);
	
	List<EmpInfo> empAll();
}
