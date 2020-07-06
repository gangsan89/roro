package com.my.bit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.bit.model.dao.DeptDao;
import com.my.bit.model.dao.EmpDao;
import com.my.bit.model.domain.Dept;
import com.my.bit.model.domain.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao empDao;

	@Autowired
	private DeptDao deptDao;

	public int getAllEmpCount() {
		return empDao.getAllEmpCount();
	}

	public List<Dept> getAllDepts() {
		return deptDao.getAllDepts();
	}

	public Emp selectEmp(int empno) {
		Emp emp = empDao.selectEmp(empno);
		return emp;
	}

	public List<Integer> getAllEmpno() {
		return empDao.getAllEmpno();
	}

	@Transactional
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
