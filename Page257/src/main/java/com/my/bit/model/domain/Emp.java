package com.my.bit.model.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Emp implements Serializable {
	private static final long serialVersionUID = 237654222L;
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private String hiredateStr;
	private double sal;
	private double comm;
	private int deptno;
	private List<Dept> deptList;
	private List<Integer> empnoList;
}
