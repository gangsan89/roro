package com.book.page170.dao;

import java.util.List;

import com.book.page170.domain.Emp;

public interface EmpDao {
	Emp selectEmp(int empNo);
	List<Integer> getAllEmpNo();
	void insertEmp(Emp emp);
	List<Emp> getAllEmps();
	
	void updateEmp(Emp emp);
	void deleteEmp(int empNo);
}
