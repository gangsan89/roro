package com.example.bootEmp.model.dao;

import java.util.List;

import com.example.bootEmp.model.domain.Emp;

public interface EmpDAO {
	List<Emp> selectAll();
	
	List<Emp> empAll(Emp empNo);
	
	List<Emp> empNo(Emp empNo);
}
