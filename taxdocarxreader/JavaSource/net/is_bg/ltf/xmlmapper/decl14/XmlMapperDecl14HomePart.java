package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14HomePart {

	/***
	 * ob.seqnots as "SEQNOTS",
xmlstructure.xmlsubject(ob.taxsubject_id::integer) as "TAXSUBJECT",
(select d.value from decode d where d.columnname = 'TypeDeclar' and d.code = typedeclar) as "TYPEDECLAR",
to_char(ob.earn_date, 'dd.mm.yyyy')  as "EARNDATE",
to_char(ob.end_date, 'dd.mm.yyyy')  as "ENDDATE",
ob.divident::integer as "DIVIDENT",
ob.divisor::integer  as "DIVISOR",
numbertrim(ob.area)     as "AREA",
numbertrim(ob.part)     as "PART",
decode(ob.isbasehome,1.0,'да','не') as "ISBASEHOME",
decode(ob.isrelief,1.0,'да','не') as "TELK",
xmlstructure.xmlparthomeusers(ob.parthomeobj_id) as "PARTHOMEUSERS"
	 */
	
	private XmlMapperTaxSubject subject; //TAXSUBJECT
	private String typeDeclar; //TYPEDECLAR
	private String earnDate; //EARNDATE
	private String endDate; //ENDDATE
	private String divident; //DIVIDENT
	private String divisor; //DIVISOR
	private String area; //AREA
	private String part; //PART
	private String isBaseHome; //ISBASEHOME
	private String telk; //TELK
	private XmlMapperDecl14PartHomeUser partHomeUsers; //PARTHOMEUSERS
	
	
	
	@XmlElement(name="TAXSUBJECT")
	public XmlMapperTaxSubject getSubject() {
		return subject;
	}
	@XmlElement(name="TYPEDECLAR")
	public String getTypeDeclar() {
		return typeDeclar;
	}
	@XmlElement(name="EARNDATE")
	public String getEarnDate() {
		return earnDate;
	}
	@XmlElement(name="ENDDATE")
	public String getEndDate() {
		return endDate;
	}
	@XmlElement(name="DIVIDENT")
	public String getDivident() {
		return divident;
	}
	@XmlElement(name="DIVISOR")
	public String getDivisor() {
		return divisor;
	}
	@XmlElement(name="AREA")
	public String getArea() {
		return area;
	}
	@XmlElement(name="PART")
	public String getPart() {
		return part;
	}
	@XmlElement(name="ISBASEHOME")
	public String getIsBaseHome() {
		return isBaseHome;
	}
	@XmlElement(name="TELK")
	public String getTelk() {
		return telk;
	}
	@XmlElement(name="PARTHOMEUSERS")
	public XmlMapperDecl14PartHomeUser getPartHomeUsers() {
		return partHomeUsers;
	}
	public void setSubject(XmlMapperTaxSubject subject) {
		this.subject = subject;
	}
	public void setTypeDeclar(String typeDeclar) {
		this.typeDeclar = typeDeclar;
	}
	public void setEarnDate(String earnDate) {
		this.earnDate = earnDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setDivident(String divident) {
		this.divident = divident;
	}
	public void setDivisor(String divisor) {
		this.divisor = divisor;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public void setIsBaseHome(String isBaseHome) {
		this.isBaseHome = isBaseHome;
	}
	public void setTelk(String telk) {
		this.telk = telk;
	}
	public void setPartHomeUsers(XmlMapperDecl14PartHomeUser partHomeUsers) {
		this.partHomeUsers = partHomeUsers;
	}
	
}
