package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.PatientDao;
import cn.edu.hbtcm.jwc.model.Patient;

public class PatientDaoHibernate4 extends BaseDaoHibernate4<Patient>
implements PatientDao{
	/**
	 * 根据id查询
	 * @param id 指定的病人id
	 * @return 病人对象
	 */
	public Patient findByID(int id){
		List<Patient> pats = find("select a from Patient a where a.pid = ?0"
				, id);
			if (pats!= null && pats.size() >= 1)
			{
				for (Patient patient : pats)
				{
					if (patient.getPid() == id )
					{
						return patient;
					}
				}
			}
			return null;
	}
	/**
	 * 根据name查询
	 * @param name 指定的病人name
	 * @return 病人对象列表
	 */
	public List<Patient> findByName(String name){
		return find("from Patient as a where a.patientName=?0",name);
	}
	
	/**
	 * 根据py查询
	 * @param py 指定的病人py
	 * @return 病人对象
	 */
	public List<Patient> findByPy(String py){
		return find("from Patient as a where a.py=?0",py);
	}
	
}
