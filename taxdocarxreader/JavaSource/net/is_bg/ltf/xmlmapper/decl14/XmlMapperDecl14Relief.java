package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14Relief {
	
	private String subjectName;     //SUBJECTNAME
	private String subjectIdn; //SUBJECTIDN
	private String isRetired;//ISRETIRED
	private String retiredBeginDate;//RETIRED_BEGINDATE
	private String retiredEndDate;//RETIRED_ENDDATE
	private String telkDecisionDate;//TELK_DECISIONDATE
	private String telkDecisionNo;//TELK_DECISIONNO
	private String telkBeginDate;//TELK_BEGINDATE
	private String telkEndDate;//TELK_ENDDATE
	private String permRelief;//PERMRELIEF
	private String note;//NOTE
	
	@XmlElement(name="SUBJECTNAME")
	public String getSubjectName() {
		return subjectName;
	}
	@XmlElement(name="SUBJECTIDN")
	public String getSubjectIdn() {
		return subjectIdn;
	}
	@XmlElement(name="ISRETIRED")
	public String getIsRetired() {
		return isRetired;
	}
	@XmlElement(name="RETIRED_BEGINDATE")
	public String getRetiredBeginDate() {
		return retiredBeginDate;
	}
	@XmlElement(name="RETIRED_ENDDATE")
	public String getRetiredEndDate() {
		return retiredEndDate;
	}
	@XmlElement(name="TELK_DECISIONDATE")
	public String getTelkDecisionDate() {
		return telkDecisionDate;
	}
	@XmlElement(name="TELK_DECISIONNO")
	public String getTelkDecisionNo() {
		return telkDecisionNo;
	}
	@XmlElement(name="TELK_BEGINDATE")
	public String getTelkBeginDate() {
		return telkBeginDate;
	}
	@XmlElement(name="TELK_ENDDATE")
	public String getTelkEndDate() {
		return telkEndDate;
	}
	@XmlElement(name="PERMRELIEF")
	public String getPermRelief() {
		return permRelief;
	}
	@XmlElement(name="NOTE")
	public String getNote() {
		return note;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void setSubjectIdn(String subjectIdn) {
		this.subjectIdn = subjectIdn;
	}
	public void setIsRetired(String isRetired) {
		this.isRetired = isRetired;
	}
	public void setRetiredBeginDate(String retiredBeginDate) {
		this.retiredBeginDate = retiredBeginDate;
	}
	public void setRetiredEndDate(String retiredEndDate) {
		this.retiredEndDate = retiredEndDate;
	}
	public void setTelkDecisionDate(String telkDecisionDate) {
		this.telkDecisionDate = telkDecisionDate;
	}
	public void setTelkDecisionNo(String telkDecisionNo) {
		this.telkDecisionNo = telkDecisionNo;
	}
	public void setTelkBeginDate(String telkBeginDate) {
		this.telkBeginDate = telkBeginDate;
	}
	public void setTelkEndDate(String telkEndDate) {
		this.telkEndDate = telkEndDate;
	}
	public void setPermRelief(String permRelief) {
		this.permRelief = permRelief;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
