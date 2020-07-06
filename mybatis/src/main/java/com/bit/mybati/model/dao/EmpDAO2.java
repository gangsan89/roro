package com.bit.mybati.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.mybati.model.domain.Emp;

@Service("service")
public interface EmpDAO2 {
	public Emp selectEmp(int empNo);
	public List<Integer> getAllEmpNo();
	public void insertEmp(Emp emp);
	public List<Emp> getAllEmps();
	public void updateEmp(Emp emp);
	public void deleteEmp(int empNo);
	
}
