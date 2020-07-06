package com.bit.hello.model.dto;

public class Dept {
	private int DeptNo;
	private String dName;
	private String loc;
	
	public int getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(int deptNo) {
		DeptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Dept [DeptNo=" + DeptNo + ", dName=" + dName + ", loc=" + loc + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DeptNo;
		result = prime * result + ((dName == null) ? 0 : dName.hashCode());
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
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
		Dept other = (Dept) obj;
		if (DeptNo != other.DeptNo)
			return false;
		if (dName == null) {
			if (other.dName != null)
				return false;
		} else if (!dName.equals(other.dName))
			return false;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		return true;
	}
	
	
	
	
}
