package cn.edu.hbtcm.jwc.controller.authority;


import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import cn.edu.hbtcm.jwc.controller.WebConstant;

public class MgrAuthorityInterceptor extends AbstractInterceptor{
	private HttpSession httpSession;
	public String intercept(ActionInvocation invocation)
			throws Exception
		{
			// 创建ActionContext实例
			ActionContext ctx = ActionContext.getContext();
			// 获取HttpSession中的level属性
			String level = (String)httpSession.getAttribute(WebConstant.LEVEL);
			// 如果level不为null，且level为mgr
			if ( level != null && level.equals(WebConstant.MGR_LEVEL))
			{
				return invocation.invoke();
			}
			return "login";
		}

}
