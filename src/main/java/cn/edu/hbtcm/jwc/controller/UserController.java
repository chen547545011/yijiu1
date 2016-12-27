package cn.edu.hbtcm.jwc.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.hbtcm.jwc.controller.base.MgrBaseController;
import cn.edu.hbtcm.jwc.model.Doctor;
import cn.edu.hbtcm.jwc.model.Manager;
import net.sf.json.JSONArray;


@Controller
@RequestMapping("user")
public class UserController extends MgrBaseController {
	@RequestMapping("/reg")
	public String saveUser(Manager manager) {
		List<Doctor> mer=mgr.lookDoc();
		JSONArray jsonarray = JSONArray.fromObject(mer);
		System.out.println(jsonarray);
		System.out.println("你哈。。。");
		System.out.println("manger.userId="+manager.getUserId()+"   manager.Psaaword()="+manager.getPsaaword());
		if(mgr.login(manager)== mgr.LOGIN_MGR) {
		   return "success";
		}else
		{
			return "error";
		}
	}
	/*@RequestMapping("/rge")
	public String saveDoc(){
		return "success";	
	}
*/
	public String getCargosTemp(HttpServletRequest request,HttpServletResponse response) throws IOException{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的rand属性
	   String ver2 = "1234";//(String)ctx.getSession().get("rand");
        List<Doctor> list = mgr.lookDoc();
        JSONArray arr = JSONArray.fromObject(list);
        PrintWriter out = response.getWriter();  
        out.println(arr.toString());
        out.flush(); 
        out.close(); 
        return null;
    }
}
