package com.book.page170.dao;

import java.util.List;

import com.book.page170.domain.Dept;

public interface DeptDao {
	List<Dept> getAllDepts();
	Dept getDept(int deptNo);
}
