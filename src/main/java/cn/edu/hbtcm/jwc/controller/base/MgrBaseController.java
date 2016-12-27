package cn.edu.hbtcm.jwc.controller.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.hbtcm.jwc.service.MgrManager;

public class MgrBaseController extends ActionSupport{
	// 依赖的业务逻辑组件
	//调用cn.edu.hbtcm.jwc.service.MgrManager的接口
	@Autowired
	protected MgrManager mgr;
	// 依赖注入业务逻辑组件所必须的setter方法
	public MgrManager getMgr() {
		return mgr;
	}

	public void setMgr(MgrManager mgr) {
		this.mgr = mgr;
	}

}
