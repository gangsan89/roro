package com.bit.re;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SignController {
	public static final Logger log= LoggerFactory.getLogger("SignController"); 
	
	@RequestMapping("/sign")
	public String sign(Model model) {
		model.addAttribute("memberVO", new MemberVO());
		
		return "member/formcheck";
	}
	
	
	
	 @RequestMapping(value = "", method = RequestMethod.POST)
	    public String memberInsert(Model model, @ModelAttribute("memberVo") @Valid MemberVO memberVo,
	            BindingResult bindingResult, RedirectAttributes rttr) {
	        log.info("--------------POST member-----");
	        if (bindingResult.hasErrors()) {
	            return "member/sign_form";
	        }

	        int count = loginService.checkSignLoginId(memberVo.getId());
	        if (count != 0) {
	            model.addAttribute("MSG", MessageUtils.getMessage("fail.Sign"));
	            return "member/sign_form";
	        } else {
	            memberService.loginAndMemberInsert(memberVo);
	            rttr.addFlashAttribute("MSG", MessageUtils.getMessage("success.Sign"));
	            return "redirect:/";
	        }

	    }


}
