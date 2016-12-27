import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="acupoint")
//穴位详细信息
public class Acupoint {
	//穴位详细信息ID
	@Column
	private int ACUPOINT_ID; 
	//穴位名字
	@Column
	private String ACUPOINT_NAME;
	//穴位名拼音码
	@Column
	private String PY;
	//穴位字母代码
	@Column
	private String CODE_Manila_1989;
	//穴位字母代码
	@Column
	private String CODE_Geneva_1989;
	//定位
	@Column
	private String POSITION;
	//解刨
	@Column
	private String DISSECT;
	//主治
	@Column
	private String EFFECT;
	//操作
	@Column
	private String OPERATION;
	//示意图
	@Column
	private String DIAGRAM;
	//经络ID
	@Column
	private int MERIDIAN_ID;
	//现代报道摘录
	@Column
	private String REPORT;
	//古代报道摘录
	@Column
	private String EXCERPT;
	//无参构造方法
	public Acupoint() {
		super();
	}
	//有参构造方法
	public Acupoint(int aCUPOINT_ID, String aCUPOINT_NAME, String pY, String cODE_Manila_1989, String cODE_Geneva_1989,
			String pOSITION, String dISSECT, String eFFECT, String oPERATION, String dIAGRAM, int mERIDIAN_ID,
			String rEPORT, String eXCERPT) {
		super();
		ACUPOINT_ID = aCUPOINT_ID;
		ACUPOINT_NAME = aCUPOINT_NAME;
		PY = pY;
		CODE_Manila_1989 = cODE_Manila_1989;
		CODE_Geneva_1989 = cODE_Geneva_1989;
		POSITION = pOSITION;
		DISSECT = dISSECT;
		EFFECT = eFFECT;
		OPERATION = oPERATION;
		DIAGRAM = dIAGRAM;
		MERIDIAN_ID = mERIDIAN_ID;
		REPORT = rEPORT;
		EXCERPT = eXCERPT;
	}
	//穴位详细信息ID set/get方法
	public int getACUPOINT_ID() {
		return ACUPOINT_ID;
	}
	public void setACUPOINT_ID(int aCUPOINT_ID) {
		ACUPOINT_ID = aCUPOINT_ID;
	}
	//穴位名字  set/get方法
	public String getACUPOINT_NAME() {
		return ACUPOINT_NAME;
	}
	public void setACUPOINT_NAME(String aCUPOINT_NAME) {
		ACUPOINT_NAME = aCUPOINT_NAME;
	}
	//拼音码  set/get方法
	public String getPY() {
		return PY;
	}
	public void setPY(String pY) {
		PY = pY;
	}
	//穴位字母代码  set/get方法
	public String getCODE_Manila_1989() {
		return CODE_Manila_1989;
	}
	public void setCODE_Manila_1989(String cODE_Manila_1989) {
		CODE_Manila_1989 = cODE_Manila_1989;
	}
	//穴位字母代码  set/get方法
	public String getCODE_Geneva_1989() {
		return CODE_Geneva_1989;
	}
	public void setCODE_Geneva_1989(String cODE_Geneva_1989) {
		CODE_Geneva_1989 = cODE_Geneva_1989;
	}
	//定位  set/get方法
	public String getPOSITION() {
		return POSITION;
	}
	public void setPOSITION(String pOSITION) {
		POSITION = pOSITION;
	}
	//解剖  set/get方法
	public String getDISSECT() {
		return DISSECT;
	}
	public void setDISSECT(String dISSECT) {
		DISSECT = dISSECT;
	}
	//主治  set/get方法
	public String getEFFECT() {
		return EFFECT;
	}
	public void setEFFECT(String eFFECT) {
		EFFECT = eFFECT;
	}
	//操作  set/get方法
	public String getOPERATION() {
		return OPERATION;
	}
	public void setOPERATION(String oPERATION) {
		OPERATION = oPERATION;
	}
	//示意图  set/get方法
	public String getDIAGRAM() {
		return DIAGRAM;
	}
	public void setDIAGRAM(String dIAGRAM) {
		DIAGRAM = dIAGRAM;
	}
	//经络ID  set/get方法
	public int getMERIDIAN_ID() {
		return MERIDIAN_ID;
	}
	public void setMERIDIAN_ID(int mERIDIAN_ID) {
		MERIDIAN_ID = mERIDIAN_ID;
	}
	//古代文献摘要  set/get方法
	public String getREPORT() {
		return REPORT;
	}
	public void setREPORT(String rEPORT) {
		REPORT = rEPORT;
	}
	//古代文献摘要  set/get方法
	public String getEXCERPT() {
		return EXCERPT;
	}
	public void setEXCERPT(String eXCERPT) {
		EXCERPT = eXCERPT;
	}
	//tostring方法
	@Override
	public String toString() {
		return "acupoint [ACUPOINT_ID=" + ACUPOINT_ID + ", ACUPOINT_NAME=" + ACUPOINT_NAME + ", PY=" + PY
				+ ", CODE_Manila_1989=" + CODE_Manila_1989 + ", CODE_Geneva_1989=" + CODE_Geneva_1989 + ", POSITION="
				+ POSITION + ", DISSECT=" + DISSECT + ", EFFECT=" + EFFECT + ", OPERATION=" + OPERATION + ", DIAGRAM="
				+ DIAGRAM + ", MERIDIAN_ID=" + MERIDIAN_ID + ", REPORT=" + REPORT + ", EXCERPT=" + EXCERPT + "]";
	}
	
}
