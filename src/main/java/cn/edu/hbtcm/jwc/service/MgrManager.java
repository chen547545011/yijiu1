package cn.edu.hbtcm.jwc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.hbtcm.jwc.model.Doctor;
import cn.edu.hbtcm.jwc.model.Manager;
@Service("mgr")
public interface MgrManager {
	// 登录失败
	public static final int LOGIN_FAIL = 0;
	// 以医生登录
	public static final int LOGIN_DOC = 1;
	// 以管理员登录
	public static final int LOGIN_MGR = 2;
	/**
	 * 登陆判断
	 * @param mgr 包含指定用户名、密码的管理员
	 * @return 是否存在
	 */
    int login(Manager mgr);
	/**
	 * 查看所有医生
	 * @return 返回所有医生列表
	 */
	List<Doctor> lookDoc();
	/**
	 * 查看所有医生
	 * @param doc 要更新的医生数据
	 * @return 更新医生数据
	 */
	List<Doctor> update(Doctor doc);
	/**
	 * 查看所有医生
	 * @param doc 要删除的医生数据
	 * @return 删除后的医生数据
	 */
	List<Doctor> delete(Doctor doc);
	/**
	 * 查看所有医生
	 * @param doc 要增加的医生数据
	 * @return 删除医生数据
	 */
	List<Doctor> add(Doctor doc);
	
	/**
	 * 查看该管理员数据
	 * @param mgr 该管理员
	 * @return 该管理员
	 */
	Manager lookMgr(Manager mgr);

	/**
	 * 更新管理员密码
	 * @param mgr 该管理员
	 * @return 该管理员
	 */
	Manager update(Manager mgr);

}
