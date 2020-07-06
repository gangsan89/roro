package com.bit.lib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.lib.dao.ReserveDAO;
import com.bit.lib.dto.ReserveListDTO;

@Service("reserveService")
public class ReserveServiceImpl implements ReserveService {

	
	@Autowired(required=false)
	private ReserveDAO reserveDao;
	

	
	
	public List<ReserveListDTO> getReserveList(String id) {
		return reserveDao.getReserveList(id);
	}

	@Override
	public void insertReserve( String id, List<String> chknos) {
		// TODO Auto-generated method stub
		String bookNo = chknos.get(0).toString();
		System.out.println(bookNo+"////"+id+"reserv");
		reserveDao.insertReserve(id, bookNo);
	}

	@Override
	public void insertReserveup(List<String> chknos) {
		// TODO Auto-generated method stub
		String bookNo=chknos.get(0).toString();
		System.out.println(bookNo+"insert up");
		reserveDao.insertReserveup(bookNo);
	}

	@Override
	public void reserveCancel(String bookNo) {
		// TODO Auto-generated method stub
		
		reserveDao.reserveCancel(bookNo);
	}

	@Override
	public void reserveCancelup(String bookNo) {
		// TODO Auto-generated method stub
		
		reserveDao.reserveCancelup(bookNo);
	}
	



	


}