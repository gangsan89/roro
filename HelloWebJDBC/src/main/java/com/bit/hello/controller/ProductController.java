package com.bit.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.hello.model.dto.Product;
import com.bit.hello.model.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	//그 다음에 어트페이지를 사용자가 접속 했을때
	//어느 메소드를 실행시킬지를 말해줘야한다!
	//이때 쓰는것이 RequestMapping Annotation 이다
	
	@RequestMapping(value="/products/list", method = RequestMethod.GET)
	public String selectAll(Model model) {
		List<Product> list = service.selectAll();
		model.addAttribute("list", list);
		return "product/viewAll";
	}
	
	//selectIne과 같이 주소에 있는 무언가를 
	//우리가 메소드의 파라미터로 사용하기 위해서는 어노테이션을 사용해서
	//파라미터에 끌어와야 한다 이럴대 사용하는 어노테이션 이름은 @PathVariable이다
	@RequestMapping(value ="/products/selectOne/{id}", method = RequestMethod.GET)
	public String selectOne(Model model, @PathVariable int id) {
		Product p = service.selectOne(id);
		model.addAttribute("product", p);
		
		return "product/viewOne";
		
	}
	
}





