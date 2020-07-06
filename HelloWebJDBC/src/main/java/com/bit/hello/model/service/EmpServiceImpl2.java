package com.bit.hello.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bit.hello.model.dao.DBConnection;
import com.bit.hello.model.dto.Emp;
import com.bit.hello.model.dto.EmpInfo;
@Service("empService")
public class EmpServiceImpl2 implements EmpService {
	private static final Logger logger=LoggerFactory.getLogger(EmpServiceImpl2.class);
	private Connection conn = DBConnection.getConnection();
	
	@Override
	public Emp loginProcess(final int empNo, final String eName) {
		String sql = "select job, mgr from emp where empno=? and ename=?";
		
		PreparedStatement pstmt=null;
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
	/*
	 * @Override public void loginProcess(Emp emp) { // TODO Auto-generated method
	 * stub return null; }
	 */
	@Override
	public void loginProcess(Emp emp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<EmpInfo> empAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
