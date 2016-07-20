package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14PartLand {

	/***
	 * select xmlelement(name "LANDPART",xmlattributes(seqnots  as "PLN"),xmlforest(
ob.seqnots  as "SEQNOTS",
xmlstructure.xmlsubject(ob.taxsubject_id)  as "TAXSUBJECT",
(select d.value from decode d
	where d.columnname = 'TypeDeclar' and d.code = nvl(ob.typedeclar,'1'))  as "TYPEDECLAR",-- COMMENT d.code = nvl(to_char(ob.typedeclar),'1'))  as "TYPEDECLAR"
to_char(ob.earn_date, 'dd.mm.yyyy')  as "EARNDATE",
to_char(ob.end_date, 'dd.mm.yyyy')  as "ENDDATE",
numbertrim(ob.dividentland)  as "DIVIDENT",
numbertrim(ob.divisorland)  as "DIVISOR",
numbertrim(ob.partland)  as "PART",
numbertrim(ob.area)  as "AREA",
xmlstructure.xmlpartlandusers(ob.part_land_id) as "PARTLANDUSERS"
))
	 */
	
	private String seqNots; //SEQNOTS
	private XmlMapperTaxSubject taxSubject;//TAXSUBJECT
	private String typeDeclar; //TYPEDECLAR
	private String earnDate; //EARNDATE
	private String endDate; //ENDDATE
	private String divident; //DIVIDENT
	private String divisor; //DIVISOR
	private String part; //PART
	private String area; //AREA
	private XmlMapperDecl14PartLandUsers  partLandUsers; //PARTLANDUSERS
	
	
	@XmlElement(name="SEQNOTS")
	public String getSeqNots() {
		return seqNots;
	}
	@XmlElement(name="TAXSUBJECT")
	public XmlMapperTaxSubject getTaxSubject() {
		return taxSubject;
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
	@XmlElement(name="PART")
	public String getPart() {
		return part;
	}
	@XmlElement(name="AREA")
	public String getArea() {
		return area;
	}
	@XmlElement(name="PARTLANDUSERS")
	public XmlMapperDecl14PartLandUsers getPartLandUsers() {
		return partLandUsers;
	}
	public void setSeqNots(String seqNots) {
		this.seqNots = seqNots;
	}
	public void setTaxSubject(XmlMapperTaxSubject taxSubject) {
		this.taxSubject = taxSubject;
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
	public void setPart(String part) {
		this.part = part;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setPartLandUsers(XmlMapperDecl14PartLandUsers partLandUsers) {
		this.partLandUsers = partLandUsers;
	}
}
