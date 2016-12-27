package cn.edu.hbtcm.jwc.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.hbtcm.jwc.model.*;
@Service("doc")
public interface DocManager {
	// 登录失败
	public static final int LOGIN_FAIL = 0;
	// 以医生登录
	public static final int LOGIN_DOC = 1;
	// 以管理员登录
	public static final int LOGIN_MGR = 2;

	//登陆验证
	int login(Doctor doc);
	/**
	 * 根据疾病查询
	 * @param TCMDISEASE_NAME 指定的疾病名
	 * @return Tcmdisease对象
	 */
	Tcmdisease querybyName(String TCMDISEASE_NAME);
	/**
	 * 根据部门名查询
	 * @param part 指定的部门名
	 * @return List<Tcmdisease>对象
	 */
	List<Tcmdisease> querybyPart(String part);
	/**
	 * 根据部门号查询
	 * @param bid 指定的部门号
	 * @return List<Tcmdisease>对象
	 */
	List<Tcmdisease> querybyBid(int bid);
	/**
	 * 根据经络Id查询
	 * @param MERIDIAN_Id 指定的经络ID
	 * @return List<Acupoint>对象并且按照py的递增排序
	 */
	List<Acupoint> querybyM_Id(int MERIDIAN_ID);
	/**
	 * 根据经络名字查询
	 * @param MERIDIAN_NAME 指定的经络名字
	 * @return List<Acupoint>对象并且按照py的递增排序
	 */
	List<Acupoint> querybyMname(String MERIDIAN_NAME);
	/**
	 * 根据穴位ID查询
	 * @param Acupoint_ID 指定的穴位名字
	 * @return Acupoint对象
	 */
	Acupoint querybyA_Id(int Acupoint_ID);
	/**
	 * 根据穴位名字查询
	 * @param Acupoint_NAME 指定的穴位名字
	 * @return Acupoint对象
	 */
	Acupoint querybyAname(String Acupoint_NAME);
	/**
	 * 根据py查询
	 * @param py 指定的穴位名拼音
	 * @return Acupoint对象并且按照py的递增排序
	 */
	List<Acupoint> findByPy(String Py);
	/**
	 * 根据经络py查询
	 * @param py 指定的经络名拼音
	 * @return 该部位对应的经络对象并且按照py的递增排序
	 */
	List<Meridian> meridianFindByPY (String py);
	/**
	 * 根据医生id,日期查询
	 * @param doc_id,date 指定的医生id，日期
	 * @return List<Ou_register>对象
	 */
	List<OuRegister> Ou_registerFind (int doc_id,Date date);
	/**
	 * 根据医生id
	 * @param doc_id指定的医生id
	 * @return List<Record>对象并且按照时间的递减排序
	 */
	List<Record> RecordFindBydoc_id1 (int doc_id);
	/**
	 * 根据医生id
	 * @param doc_id指定的医生id
	 * @return List<Record>对象并且按照病人Id的递增排序
	 */
	List<Record> RecordFindBydoc_id2 (int doc_id);
	/**
	 * 根据医生id
	 * @param doc_id指定的医生id
	 * @return List<Record>对象并且按照病人姓名的递增排序
	 */
	List<Record> RecordFindBydoc_id3 (int doc_id);
	/**
	 * 根据病人id，病人id
	 * @param Pid，doc_id指定的病人id，医生id
	 * 给Record添加数据，并且封装
	 * @return Record
	 */
	Record Recordadd(int Pid,int doc_id);
	/**
	 * add增加一条记录
	 * @param record指定的病例记录
	 * @return boolean
	 */
	boolean AddRecord (Record record);
	/**
	 * update修改一条记录
	 * @param record指定的病例记录
	 * @return boolean
	 */
	boolean UpdateRecord (Record record);
	

}
