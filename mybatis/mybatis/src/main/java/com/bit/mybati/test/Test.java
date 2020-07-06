package com.bit.mybati.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.mybati.dao.DeptDAO;
import com.bit.mybati.dao.EmpDAO;
import com.bit.mybati.dao.EmpDAO2;
import com.bit.mybati.domain.Dept;
import com.bit.mybati.domain.Emp;
import com.bit.mybati.service.EmpService;
import com.bit.mybati.service.EmpServiceImpl;
import com.bit.mybati.service.UserService;
import com.bit.mybati.service.UserServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		//Service용
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bit/mybati/config/mybatis-context.xml");
		//Bean용
		ApplicationContext anno = new AnnotationConfigApplicationContext(Emp.class,Dept.class );
//		EmpDAO empDAO = (EmpDAO)ctx.getBean("mapper");
		EmpDAO2 empService = (EmpDAO2)ctx.getBean("service");
		System.out.println(empService.getAllEmpNo());
		
		// System.out.println(empDAO.selectEmp(7369)); 
		//System.out.println(empDAO.getAllEmpNo());
		//System.out.println(empDAO.getAllEmps());
		Emp emp = (Emp) anno.getBean("empVO");
		Dept dept = (Dept) anno.getBean("deptVO");
//		 Emp emp = new Emp(6666,"테스트용","비트",7777,new Date(2020-03-24),5000,600,20); 
		emp.setEmpNo(6666);
		emp.setEName("테스트용");
		emp.setJob("비트");
		emp.setMgr(7777);
		emp.setHireDate(new Date(2020-03-24));
		emp.setSal(5000);
		emp.setComm(600);
		emp.setDeptNo(20);
//		empService.insertEmp(emp);
//		empDAO.updateEmp(emp);
//		empDAO.deleteEmp(6666);
//		System.out.println(deptDAO.getAllDepts());
		
		
	}
}
