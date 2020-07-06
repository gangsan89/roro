package com.bit.mybati.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.mybati.model.dao.EmpDAO;
import com.bit.mybati.model.domain.Emp;

@Service("empService") 
public class EmpServiceImpl implements EmpService{

	@Autowired(required = false)
	private EmpDAO empDAO;
	
	@Override
	public Emp selectEmp(int empNo) {
		return empDAO.selectEmp(empNo);
	}

	@Override
	public List<Integer> getAllEmpNo() {
		return empDAO.getAllEmpNo();
	}

	@Override
	public void insertEmp(Emp emp) {
		empDAO.insertEmp(emp);
	}

	@Override
	public List<Emp> getAllEmps() {
		return empDAO.getAllEmps();
	}

	@Override
	public void updateEmp(Emp emp) {
		empDAO.updateEmp(emp);
		
	}

	@Override
	public void deleteEmp(int empNo) {
		empDAO.deleteEmp(empNo);
	}

}
