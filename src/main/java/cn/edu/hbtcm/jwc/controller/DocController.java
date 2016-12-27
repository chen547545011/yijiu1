package cn.edu.hbtcm.jwc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.hbtcm.jwc.controller.base.DocBaseController;
import cn.edu.hbtcm.jwc.model.Doctor;

@Controller
public class DocController extends DocBaseController{
	@RequestMapping("doctor/login")
	public String saveDoc(Doctor doctor) {
		System.out.println("你哈。。。");
		System.out.println("doctor.userId="+doctor.getUserId()+"   doctor.Password="+doctor.getPassword());
		if(doc.login(doctor)==doc.LOGIN_DOC) {
		   return "main/main_doctor";
		}else
		{
			return "redirect:/login.jsp";
		}
	}
}
