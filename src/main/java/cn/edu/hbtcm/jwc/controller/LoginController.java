package cn.edu.hbtcm.jwc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.opensymphony.xwork2.*;


import cn.edu.hbtcm.jwc.controller.base.LoginBaseController;
import cn.edu.hbtcm.jwc.model.*;
import cn.edu.hbtcm.jwc.util.*;

@Controller
public class LoginController extends LoginBaseController {
	@RequestMapping("login")
	public String login(HttpSession httpSession,@RequestParam String userID,@RequestParam String password,@RequestParam String vercode) throws Exception{
		System.out.println(PasswordHash.createHash(password));
		// 创建ActionContext实例
//		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的rand属性
		String ver2=(String) httpSession.getAttribute("rand");
		if (vercode.equalsIgnoreCase(ver2)){
			Manager manager=new Manager();
			manager.setUserId(Integer.parseInt(userID));
//			System.out.println(PasswordHash.createHash(password));
			manager.setPsaaword(password);
			int result = mgr.login(manager);
			if (result == mgr.LOGIN_MGR)
			{
				httpSession.setAttribute(WebConstant.USER, manager.getUserId());
				httpSession.setAttribute(WebConstant.LEVEL, WebConstant.MGR_LEVEL);
//					 return "main/main_manager";
					 return "main/bottom";
//					 return SUCCESS;
			}
			Doctor doctor=new Doctor();
			doctor.setUserId(Integer.parseInt(userID));
			doctor.setPassword(password);
			result = doc.login(doctor);
			if (result == doc.LOGIN_DOC)
			{
				httpSession.setAttribute(WebConstant.USER
						, doctor.getDoctorName());
				httpSession.setAttribute(WebConstant.LEVEL
						, WebConstant.DOC_LEVEL);
				   return "index";
//				return SUCCESS;
			}
		}
//		return "redirect:/login.jsp";
		 return ERROR;
	}

}
