package com.bit.lib.service;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bit.lib.dao.AdminDAO;
import com.bit.lib.dto.NewBookDTO;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired(required = false)
	AdminDAO adminDAO;
	
	/* private static final String SAVE_PATH = "D:/libFile/"; */

	@Override
	public void addBook(NewBookDTO newBookDTO) {

		adminDAO.addBookProc(newBookDTO); // book테이블에 도서등록
		// 등록한 book테이블에서 bookstatus에 넣어주기위한 bookcode,qty 가져와서 세팅.
		newBookDTO = adminDAO.selectBookInfo(newBookDTO); 

		for (int i = 0; i < newBookDTO.getBookQty(); i++) {// bookstatus테이블에 book테이블의 qty만큼 반복해서 넣어주기
			String bookNo = "BC" + newBookDTO.getBookCode() + "BIT" + i;
			newBookDTO.setBookNo(bookNo); 
			newBookDTO.setBookCode(newBookDTO.getBookCode());
			adminDAO.addBookProc2(newBookDTO);
		}
		
		/**
		 * MultipartFile file 이 받은 크기만큼 읽어라 (파일 생성, 그 파일을 원하는 위치에 저장)
		 * 
		 * 
		 */
		
		
	}
	
	/*
	 * public void addBook(NewBookDTO newBookDTO, MultipartFile file) {
	 * 
	 * String originalFilename = file.getOriginalFilename(); long fileSize =
	 * file.getSize(); String safeFile = SAVE_PATH + System.currentTimeMillis() +
	 * originalFilename;
	 * 
	 * try { file.transferTo(new File(safeFile));
	 * 
	 * } catch (IllegalStateException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * OutputStream out;
	 * 
	 * }
	 */

	

}
