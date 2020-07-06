package com.bit.hello.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bit.hello.model.dao.DBConnection;
import com.bit.hello.model.dto.Dept;
import com.bit.hello.model.dto.Emp;
import com.bit.hello.model.dto.EmpInfo;

public class EmpServiceImpl implements EmpService {
	private static final Logger logger=LoggerFactory.getLogger(EmpServiceImpl.class);
	private Connection conn = DBConnection.getConnection();
	PreparedStatement pstmt=null;
	
	
	@Override
	public Emp loginProcess(final int empNo, final String eName) {
		String sql = "select job, mgr from emp where empno=? and ename=?";
		
		
		ResultSet resultSet=null;
		Emp emp = null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, empNo);
			pstmt.setString(2, eName);
			resultSet=pstmt.executeQuery();
			if(resultSet.next()) {
				emp=new Emp();
				emp.setEmpNo(empNo);
				emp.setEName(eName);
				emp.setJob(resultSet.getString("job"));
				emp.setMgr(resultSet.getInt("mgr"));
				logger.info("login success");
			}else {
				logger.info("login fail, 존재하지 않는 정보입니다.");
			}
		}catch (SQLException e) {
			logger.error(e.getMessage());
			logger.error(e.getSQLState());
		}catch (Exception e) {
			logger.error(e.getMessage());
		}finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(pstmt!=null)pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return emp;
	}
	
	
	  @Override public void loginProcess(Emp emp) { 
		  emp.setJob("아무거나");
		  emp.setMgr(17);  
		  //return null;
	  }
	 
	
	@Override
	public List<EmpInfo> empAll(){
		String sql="select e.empNo, e.eName, e.job, e.mgr, e.hiredate, e.sal,"
				+ " d.dName, d.deptNo from emp e, dept d where e.deptNo=d.deptNo";
		
		ResultSet resultSet = null;
		List<EmpInfo> infos=null;
		try {
			pstmt = conn.prepareStatement(sql);
			resultSet=pstmt.executeQuery();
			infos = new ArrayList<EmpInfo>();
			while(resultSet.next()) {
				EmpInfo info = new EmpInfo();
				Emp emp = new Emp();
				Dept dept = new Dept();
				
				emp.setEmpNo(resultSet.getInt("empNo"));
				emp.setEName(resultSet.getString("eName"));
				emp.setJob(resultSet.getString("job"));
				emp.setMgr(resultSet.getInt("mgr"));
				emp.setHiredate(resultSet.getDate("hiredate"));
				emp.setSal(resultSet.getInt("sal"));
				
				dept.setdName(resultSet.getString("dName"));
				dept.setDeptNo(resultSet.getInt("deptNo"));
				
				info.setEmp(emp);
				info.setDept(dept);
				infos.add(info);
				
			}
			
		}catch (SQLException e) {
			logger.error(e.getMessage());
		}catch (Exception e) {
			logger.error(e.getMessage());
		}finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(pstmt!=null)pstmt.close();
			}catch (SQLException e) {
				logger.error(e.getMessage());
			}
		}
		
		return infos;
	}
	
	
}
