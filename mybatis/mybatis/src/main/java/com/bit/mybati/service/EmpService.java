package com.bit.mybati.service;

import java.util.List;

import com.bit.mybati.domain.Emp;

public interface EmpService {
	public Emp selectEmp(int empNo);
	public List<Integer> getAllEmpNo();
	public void insertEmp(Emp emp);
	public List<Emp> getAllEmps();
	public void updateEmp(Emp emp);
	public void deleteEmp(int empNo);
}
