package cn.edu.hbtcm.jwc.common.dao;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.hbtcm.jwc.controller.WebConstant;
import cn.edu.hbtcm.jwc.controller.base.DocBaseController;
import cn.edu.hbtcm.jwc.model.Doctor;
@Controller
@RequestMapping("doctor")
public class DoctorController extends DocBaseController{
	@RequestMapping("/login") 
	public String saveDoc(Doctor doctor,String vercode) {
		ActionContext ctx = ActionContext.getContext();
		String ver2 = (String)ctx.getSession().get("rand");
		if (vercode.equalsIgnoreCase(ver2)){
			int result = doc.login(doctor);
			if (result == doc.LOGIN_DOC)
			{
				    ctx.getSession().put(WebConstant.USER
						, doctor.getDoctorName());
					ctx.getSession().put(WebConstant.LEVEL
						, WebConstant.DOC_LEVEL);
				   return "main/main_doctor";
			}
		}
		return "redirect:/login.jsp";
	}

}
