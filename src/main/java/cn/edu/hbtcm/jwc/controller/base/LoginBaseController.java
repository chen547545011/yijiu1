package cn.edu.hbtcm.jwc.controller.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.hbtcm.jwc.service.DocManager;
import cn.edu.hbtcm.jwc.service.MgrManager;

public class LoginBaseController extends ActionSupport{
	@Autowired
	protected DocManager doc;
	@Autowired
	protected MgrManager mgr;
	public DocManager getDoc() {
		return doc;
	}
	public void setDoc(DocManager doc) {
		this.doc = doc;
	}
	public MgrManager getMgr() {
		return mgr;
	}
	public void setMgr(MgrManager mgr) {
		this.mgr = mgr;
	}
	

}
