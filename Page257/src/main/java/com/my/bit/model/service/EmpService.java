package com.my.bit.model.service;

import java.util.List;

import com.my.bit.model.domain.Dept;
import com.my.bit.model.domain.Emp;

public interface EmpService {
	int getAllEmpCount(); 
	List<Dept>getAllDepts(); 
	Emp selectEmp(int empno); 
	List<Integer>getAllEmpno(); 
	void insertEmp(Emp emp); 
	List<Emp>getAllEmps(); 
	void updateEmp(Emp emp); 
	void deleteEmp(int empno);
}
