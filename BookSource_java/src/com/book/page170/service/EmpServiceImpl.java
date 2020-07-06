package com.book.page170.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.book.page170.dao.DeptDao;
import com.book.page170.dao.EmpDao;
import com.book.page170.domain.Dept;
import com.book.page170.domain.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDao empDao;
	
	@Autowired
	private DeptDao deptDao;
	
	public List<Dept> getAllDepts() {
		return deptDao.getAllDepts();
	}
	
	@Transactional
	public Emp selectEmp(int empno) {
		Emp emp = empDao.selectEmp(empno);
		return emp;
	}
	
	public List<Integer> getAllEmpno() {
		return empDao.getAllEmpNo();
	}
	
	public void insertEmp(Emp emp) {
		empDao.insertEmp(emp);
	}
	
	public List<Emp> getAllEmps() {
		return empDao.getAllEmps();
	}
	
	public void updateEmp(Emp emp) {
		empDao.updateEmp(emp);
	}
	
	public void deleteEmp(int empno) {
		empDao.deleteEmp(empno);
	}
	
	
}
