package com.bit.mybati.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.mybati.dao.DeptDAO;
import com.bit.mybati.dao.EmpDAO;
import com.bit.mybati.dao.EmpDAO2;
import com.bit.mybati.domain.Dept;
import com.bit.mybati.domain.Emp;
import com.bit.mybati.service.EmpService;
import com.bit.mybati.service.UserService;
import com.bit.mybati.service.UserServiceImpl;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bit/mybati/config/mybatis-context.xml");
		/*
		 * EmpDAO empDAO = (EmpDAO)ctx.getBean("mapper"); System.out.println(
		 * ((EmpDAO)ctx.getBean("mapper")).getAllEmpNo() );
		 */
		
//		EmpService empService =(EmpService)ctx.getBean("empService");
//		
//		for(Emp emp : empService.getAllEmps() ) {
//			  System.out.println(emp);
//		}
//		 
//		System.out.println(empService.getAllEmps());
		
		EmpDAO2 dao2 = (EmpDAO2) ctx.getBean("service");
		System.out.println(dao2.getAllEmpNo());
		
		
		// System.out.println(empDAO.selectEmp(7369)); 
		//System.out.println(empDAO.getAllEmpNo());
		//System.out.println(empDAO.getAllEmps());
//		Emp emp = new Emp();
//		emp.setEmpNo(6666);
//		emp.setEName("테스트용");
//		emp.setJob("비트");
//		emp.setMgr(7777);
//		emp.setHireDate(new Date(2020-03-24));
//		emp.setSal(5000);
//		emp.setComm(600);
//		emp.setDeptNo(20);
//		empDAO.insertEmp(emp);
//		empDAO.updateEmp(emp);
//		empDAO.deleteEmp(6666);
//		System.out.println(deptDAO.getAllDepts());
		
		
	}
}
