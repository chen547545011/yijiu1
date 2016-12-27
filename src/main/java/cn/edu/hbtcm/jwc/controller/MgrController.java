package cn.edu.hbtcm.jwc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.hbtcm.jwc.controller.base.MgrBaseController;
import cn.edu.hbtcm.jwc.model.*;

@Controller
@RequestMapping("manager")
public class MgrController extends MgrBaseController {
	@RequestMapping("/login") 
	public String saveDoc(Manager manager,String vercode) {
		ActionContext ctx = ActionContext.getContext();
		String ver2 = (String)ctx.getSession().get("rand");
		if (vercode.equalsIgnoreCase(ver2)){
			int result = mgr.login(manager);
			if (result == mgr.LOGIN_MGR)
			{
				    ctx.getSession().put(WebConstant.USER
						, manager.getUserId());
					ctx.getSession().put(WebConstant.LEVEL
						, WebConstant.MGR_LEVEL);
					 return "main/main_manager";
			}
		}
		return "redirect:/login.jsp";
	}
}
