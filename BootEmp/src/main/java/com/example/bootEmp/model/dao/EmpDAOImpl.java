package com.example.bootEmp.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bootEmp.model.domain.Emp;

@Service
public class EmpDAOImpl implements EmpDAO {
	
	/*
	 * empAll 을 통해서 가져온 emp의 정보중 empNo를 뽑아서
	 * empNo만 리스트에 담아서 
	 * 합병정렬(Merge Sort)를 한 후에 
	 * 결과를 출력해준다
	 */
	public List<Emp> selectAll(Emp empNo) {
		List<Emp> empList = new ArrayList<>();
		empList = selectAll(empNo);
		int listSize = empList.size();
		for(int i=0; i < listSize; i++) {
			
		}
		
		return empList;
	}
	
	
	
	@Override
	public List<Emp> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> empAll(Emp empNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> empNo(Emp empNo) {
		List<Emp> list = new ArrayList<Emp>();
		
		return list;
	}

}
