package com.bit.hello.model.dto;

import java.sql.Date;

/**
 * 사원번호 int empNo
 * 사원이름	empName
 * 일,직무 job
 * 매니지먼트 mgr
 * 
 * @author bitcamp
 *
 */
public class Emp {
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	
	
	
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		System.err.println("empNo="+empNo);
		this.empNo = empNo;
	}
	public String getEName() {
		return eName;
	}
	public void setEName(String eName) {
		System.err.println("eName="+eName);
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + empNo;
		result = prime * result + ((hiredate == null) ? 0 : hiredate.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + mgr;
		result = prime * result + sal;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		
		if (empNo != other.empNo)
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		
		if (mgr != other.mgr) 
			return false;
		
		if (sal != other.sal)
			return false;
		return true;
	}
	
	
	
}
