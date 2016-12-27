package cn.edu.hbtcm.jwc.controller.base;


import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.hbtcm.jwc.service.DocManager;

public class DocBaseController extends ActionSupport{
	// 依赖的业务逻辑组件
	//调用cn.edu.hbtcm.jwc.service.DocManager的接口
	@Autowired
	protected DocManager doc;
		// 依赖注入业务逻辑组件所必须的setter方法

	public DocManager getDoc() {
		return doc;
	}

	public void setDoc(DocManager doc) {
		this.doc = doc;
	}
         
		

}
