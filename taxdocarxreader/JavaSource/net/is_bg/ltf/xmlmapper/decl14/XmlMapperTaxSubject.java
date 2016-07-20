package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperTaxSubject {

	/**
	 * taxsubjectno as "TAXSUBJECTNO",
-- (select m.name from municipality m where m.municipality_id = ts.municipality_id) as "MUNICIPALITY",
(select d.value from decode d where UPPER(d.columnname) = 'ISPERSON' and d.code::integer = isperson::integer)  as "ISPERSON",
(select d.value from decode d where upper(d.columnname) = 'KIND_IDN' and d.code = kind_idn) as "KIND_IDN",
xmlstructure.xmladdress(present_clientaddr_id) as "PRESENT_CLIENTADDR",
to_char(present_addrdate,'dd.mm.yyyy') as "PRESENT_ADDRDATE",
idn as "IDN",tsaccount as "TSACCOUNT", taxno as "TAXNO",
permanent_addres_exist as "PERMANENT_ADDRES_EXIST",
xmlstructure.xmladdress(permanent_clientaddr_id) as "PERMANENT_CLIENTADDR",
name as "SUBJECTNAME",
xmlstructure.xmladdress(post_clientaddr_id) as "POST_CLIENTADDR_ID",
to_char(post_addrdate,'dd.mm.yyyy') as "POST_ADDRDATE",
-- user_date,
-- user_id,
to_char(permanent_addrdate,'dd.mm.yyyy') as "PERMANENT_ADDRDATE",
e_mail as "E_MAIL",telefon as "TELEFON",fax as "FAX",
note as "NOTE",postaddr_input_code::integer as "POSTADDR_INPUT_CODE",
permaddr_input_code::integer as "PERMADDR_INPUT_CODE")
into subject
from taxsubject ts
where ts.taxsubject_id = iptaxsubject_id
	 */
	
	private String taxSubjectNo; //TAXSUBJECTNO
	private String municiapality; //MUNICIPALITY
	private String isPerson; //ISPERSON
	private String kindIdn; //KIND_IDN
	private XmlMapperDecl14Address  presentClientAddr; //PRESENT_CLIENTADDR
	private String presentAddrDate; //PRESENT_ADDRDATE
	private String idn; //IDN
	private String tAccount; //TSACCOUNT
	private String taxNo; //TAXNO
	private String permanentAddressExist; //PERMANENT_ADDRES_EXIST
	private XmlMapperDecl14Address permanentClientAddress; //PERMANENT_CLIENTADDR
	private String subjectName; //SUBJECTNAME
	private XmlMapperDecl14Address postClientAddress; //POST_CLIENTADDR_ID
	private String permanentAddrDate; //PERMANENT_ADDRDATE
	private String email; //E_MAIL
	private String telefon; //TELEFON
	private String fax; //FAX
	private String note; //NOTE
	private String postAddrInputCode; //POSTADDR_INPUT_CODE
	private String permAddrInputCode; //PERMADDR_INPUT_CODE
	
	@XmlElement(name="TAXSUBJECTNO")
	public String getTaxSubjectNo() {
		return taxSubjectNo;
	}
	@XmlElement(name="MUNICIPALITY")
	public String getMuniciapality() {
		return municiapality;
	}
	@XmlElement(name="ISPERSON")
	public String getIsPerson() {
		return isPerson;
	}
	@XmlElement(name="KIND_IDN")
	public String getKindIdn() {
		return kindIdn;
	}
	@XmlElement(name="PRESENT_CLIENTADDR")
	public XmlMapperDecl14Address getPresentClientAddr() {
		return presentClientAddr;
	}
	@XmlElement(name="PRESENT_ADDRDATE")
	public String getPresentAddrDate() {
		return presentAddrDate;
	}
	@XmlElement(name="IDN")
	public String getIdn() {
		return idn;
	}
	@XmlElement(name="TSACCOUNT")
	public String gettAccount() {
		return tAccount;
	}
	@XmlElement(name="TAXNO")
	public String getTaxNo() {
		return taxNo;
	}
	@XmlElement(name="PERMANENT_ADDRES_EXIST")
	public String getPermanentAddressExist() {
		return permanentAddressExist;
	}
	@XmlElement(name="PERMANENT_CLIENTADDR")
	public XmlMapperDecl14Address getPermanentClientAddress() {
		return permanentClientAddress;
	}
	@XmlElement(name="SUBJECTNAME")
	public String getSubjectName() {
		return subjectName;
	}
	@XmlElement(name="POST_CLIENTADDR_ID")
	public XmlMapperDecl14Address getPostClientAddress() {
		return postClientAddress;
	}
	@XmlElement(name="PERMANENT_ADDRDATE")
	public String getPermanentAddrDate() {
		return permanentAddrDate;
	}
	@XmlElement(name="E_MAIL")
	public String getEmail() {
		return email;
	}
	@XmlElement(name="TELEFON")
	public String getTelefon() {
		return telefon;
	}
	@XmlElement(name="FAX")
	public String getFax() {
		return fax;
	}
	@XmlElement(name="NOTE")
	public String getNote() {
		return note;
	}
	@XmlElement(name="POSTADDR_INPUT_CODE")
	public String getPostAddrInputCode() {
		return postAddrInputCode;
	}
	@XmlElement(name="PERMADDR_INPUT_CODE")
	public String getPermAddrInputCode() {
		return permAddrInputCode;
	}
	public void setTaxSubjectNo(String taxSubjectNo) {
		this.taxSubjectNo = taxSubjectNo;
	}
	public void setMuniciapality(String municiapality) {
		this.municiapality = municiapality;
	}
	public void setIsPerson(String isPerson) {
		this.isPerson = isPerson;
	}
	public void setKindIdn(String kindIdn) {
		this.kindIdn = kindIdn;
	}
	public void setPresentClientAddr(XmlMapperDecl14Address presentClientAddr) {
		this.presentClientAddr = presentClientAddr;
	}
	public void setPresentAddrDate(String presentAddrDate) {
		this.presentAddrDate = presentAddrDate;
	}
	public void setIdn(String idn) {
		this.idn = idn;
	}
	public void settAccount(String tAccount) {
		this.tAccount = tAccount;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public void setPermanentAddressExist(String permanentAddressExist) {
		this.permanentAddressExist = permanentAddressExist;
	}
	public void setPermanentClientAddress(
			XmlMapperDecl14Address permanentClientAddress) {
		this.permanentClientAddress = permanentClientAddress;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void setPostClientAddress(XmlMapperDecl14Address postClientAddress) {
		this.postClientAddress = postClientAddress;
	}
	public void setPermanentAddrDate(String permanentAddrDate) {
		this.permanentAddrDate = permanentAddrDate;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setPostAddrInputCode(String postAddrInputCode) {
		this.postAddrInputCode = postAddrInputCode;
	}
	public void setPermAddrInputCode(String permAddrInputCode) {
		this.permAddrInputCode = permAddrInputCode;
	}
	
}
