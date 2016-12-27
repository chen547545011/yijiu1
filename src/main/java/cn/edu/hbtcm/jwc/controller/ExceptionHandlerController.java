package cn.edu.hbtcm.jwc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ExceptionHandlerController {
	@ExceptionHandler(RuntimeException.class)
	public String operateExp(RuntimeException ex,HttpServletRequest request){
		System.out.println("this is for test");
		//mod.addAttribute("err", ex.getMessage()); //ExceptionHandler处理异常时，Model，是不能用的，否则会不起作用，这里用了HttpServletRequest
		request.setAttribute("err", ex.getMessage());
		return "errors/error";
	}
}
