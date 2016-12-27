package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.AcupointDao;
import cn.edu.hbtcm.jwc.dao.RecordDao;
import cn.edu.hbtcm.jwc.model.Acupoint;
import cn.edu.hbtcm.jwc.model.Patient;
import cn.edu.hbtcm.jwc.model.Record;

public class RecordDaoHibernate4 extends BaseDaoHibernate4<Record>
implements RecordDao{
	/**
	 * 根据医生id查询
	 * @param id 指定的病人id
	 * @return 病历对象列表并且按照recordid顺序排序，递减
	 */
	public List<Record> findByDocID(int id){
		return find("from Record a where a.doctor.userId=?0 order by a.recordId desc"
				, id);
	}
	/**
	 * 根据病人id查询
	 * @param id 指定的病人id
	 * @return 病历对象列表
	 */
	public List<Record> findByPatID(int id){
		return find("from Record a where a.patient.pid=?0 "
//				+ "group by a.doctor.userId "
				+ "order by a.recordId desc"
				, id);
	}
	/**
	 * 根据病人name查询
	 * @param name 指定的病人name
	 * @return 病历对象列表
	 */
	public List<Record> findByPatName(String name){
		return find("from Record a where a.patient.patientName=?0 "
//				+ "group by a.doctor.userId "
				+ "order by a.recordId desc"
				, name);
	}
	/**
	 * 根据病人name模糊查询
	 * @param name 指定的病人name
	 * @return 病历对象列表
	 */
	public List<Record> findByPatNameL(String name){
		String name1="%"+name+"%";
		return find("from Record a where a.patient.patientName like ?0 "
//				+ "group by a.doctor.userId "
				+ "order by a.recordId desc"
				, name1);
		
	}
	/**
	 * 根据病人name和医生ID查询
	 * @param name 指定的病人name
	 * @return 病历对象
	 */
	public List<Record> findByPatNameAndDocID(String name, int docid){
		return find("from Record a where a.patient.patientName=?0 and a.doctor.userId=?1"
//				+ "group by a.doctor.userId "
				+ "order by a.recordId desc"
				, name,docid);
	}
	/**
	 * 根据病人id和医生ID查询
	 * @param name 指定的病人name
	 * @return 病历对象
	 */
	public List<Record> findByPatIDAndDocID(int patid, int docid){
		return find("from Record a where a.patient.pid=?0 and a.doctor.userId=?1"
//				+ "group by a.doctor.userId "
				+ "order by a.recordId desc"
				, patid,docid);
	}
}
