package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.DoctorDao;
import cn.edu.hbtcm.jwc.model.Doctor;

public class DoctorDaoHibernate4 extends BaseDaoHibernate4<Doctor>
implements DoctorDao {
	/**
	 * 根据用户名和密码查询医生
	 * @param doc 包含指定用户名、密码的医生
	 * @return 符合指定用户名和密码的医生
	 */
	/*public List<Doctor> findByIDAndPass(Doctor doc){
		return find("from Doctor as a where a.doctorName=?0 and a.password=?1" , doc.getDoctorName(), doc.getPassword());
	}*/
	public List<Doctor> findByIDAndPass(Doctor doc){
		return find("from Doctor as a where a.userId=?0" , doc.getUserId());
	}
	/**
	 * 根据id
	 * @param id 医生id
	 * @return 医生
	 */
	public Doctor findByID(int id){
		List<Doctor> doc = find("select a from Doctor a where a.userId = ?0"
				, id);
			if (doc!= null && doc.size() >= 1)
			{
				for (Doctor doctor : doc)
				{
					if (doctor.getUserId() == id )
					{
						return doctor;
					}
				}
			}
			return null;
	}
	

	/**
	 * 根据用户名查找医生
	 * @param name 医生的名字
	 * @return 对应的医生
	 */
	public List<Doctor> findByName(String name){
		return find("from Doctor as a where a.doctorName=?0" , name);
		
	}
	/**
	 * 根据用户名查找医生
	 * @return 所有的医生
	 */
	public List<Doctor> find(){
		return find("from Doctor");
		
	}

}
