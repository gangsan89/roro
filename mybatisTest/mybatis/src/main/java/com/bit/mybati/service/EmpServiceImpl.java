package com.bit.mybati.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.mybati.dao.EmpDAO;
import com.bit.mybati.domain.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO empDao;
	
	
	@Override
	public List<Emp> getAllEmps() {
		
		return empDao.getAllEmps();
	}
	
	@Override
	public List<Integer> getAllEmpNo() {
		
		return empDao.getAllEmpNo();
	}

}
