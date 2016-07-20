package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 *
 */

@XmlRootElement(name="TAXDOC")
public class XmlMapperDecl14 {
	
	private String municipality;   //MUNICIPALITY
	private XmlMapperDecl14TaxObject object;   //OBJECT
	private String declIdn;   //DECL_IDN
	private String declName;   //DECL_NAME
	private String telefon;   //TELEFON
	private String identDocKind;           //IDENTDOC_KIND
	private String declIdentDocKind;       //DECL_IDENTDOC_KIND
	private String declEmissionDate;       //DECL_EMISSION_DATE
	private String declRdvr;                //DECL_RDVR 
	private XmlMapperDecl14AddressNew declPermAddress;  //DECL_PERM_ADDR
	private XmlMapperDecl14AddressNew declPostAddress;   //DECL_POST_ADDR
	private String kindDecl;    //KINDDECL
	private String taxObjNo;   //TAXOBJNO
	private String partidano;  // PARTIDANO 
	private String oldPartidano;   //OLD_PARTIDANO
	private String documentType;   //DOCUMENTTYPE
	private String taxdocDate;    //TAXDOCDATE
	private String DOCEXTNO; //DOCEXTNO
	private String docDate;  //DOC_DATE
	private String docExtDate; //DOCEXT_DATE
	private String earnDate;    //EARN_DATE
	private String changeDate;  //CHANGE_DATE
	private String empIdn;  //EMP_IDN
	private String empName; //EMP_NAME
	private XmlMapperDecl14AddressNew empPostAddress;  //EMP_POST_ADDR
	private String empIdentDocKind;   //EMP_IDENTDOC_KIND
	private String empIdentDoc;  //EMP_IDENTDOCNO
	private String empNo;   //EMPNO
	private String empEmissionDate;  //EMP_EMISSIONDATE
	private String empCertify;   //EMP_CERTIFY
	private String empIdentEmissionDate; //EMP_IDENT_EMISSION_DATE
	private String empRdvr;   //EMP_RDVR
	private String giveReasonReg; //GIVE_REASONREG
	private XmlMapperDecl14Relief relief; // RELIEF;
	private String docWorkFinalDate; //DOCWORK_FINALDATE
	private String receiverDate; //RECEIVER_DATE
	private String receiverNote; //RECEIVER_NOTE
	private String docInputDate; //DOCINPUT_DATE
	private String note; //NOTE
	private String clodeNote; //CLOSENOTE
	private String accValue; //ACCVALUE
	private String company;  //COMPANY
	private String docStatus; //DOCSTATUS
	private String closeReasonReg; //CLOSE__REASONREG
	private String closeDate;   //CLOSE_DATE
	private String closeTaxDocId; //CLOSE_TAXDOC_ID
	private String isInheritance;    //ISINHERITANCE
	private String waitDate;    //WAIT_DATE
	private String toUserId;   //TO_USER_ID
	private String locationDoc;   //LOCATION_DOC
	private String userDate;    //USER_DATE
	private String userName;    //USER_NAME
	private String beginTaxDate;   //BEGINTAXDATE
	private String endTaxDate;   //ENDTAXDATE
	private String isInvalid; //ISINVALID
	private String receiverUserId;       //RECEIVER_USER_ID
	private String receiverUserName;     //RECEIVER_USER_NAME
 	private String repName;              //REPRNAME
	private XmlMapperDecl14Property property;   //PROPERTY
	
	@XmlElement(name="MUNICIPALITY")
	public String getMunicipality() {
		return municipality;
	}
	@XmlElement(name="OBJECT")
	public XmlMapperDecl14TaxObject getObject() {
		return object;
	}
	@XmlElement(name="DECL_IDN")
	public String getDeclIdn() {
		return declIdn;
	}
	@XmlElement(name="DECL_NAME")
	public String getDeclName() {
		return declName;
	}
	@XmlElement(name="TELEFON")
	public String getTelefon() {
		return telefon;
	}
	@XmlElement(name="IDENTDOC_KIND")
	public String getIdentDocKind() {
		return identDocKind;
	}
	@XmlElement(name="DECL_IDENTDOC_KIND")
	public String getDeclIdentDocKind() {
		return declIdentDocKind;
	}
	@XmlElement(name="DECL_EMISSION_DATE")
	public String getDeclEmissionDate() {
		return declEmissionDate;
	}
	@XmlElement(name="DECL_RDVR")
	public String getDeclRdvr() {
		return declRdvr;
	}
	@XmlElement(name="DECL_PERM_ADDR")
	public XmlMapperDecl14AddressNew getDeclPermAddress() {
		return declPermAddress;
	}
	@XmlElement(name="DECL_POST_ADDR")
	public XmlMapperDecl14AddressNew getDeclPostAddress() {
		return declPostAddress;
	}
	@XmlElement(name="KINDDECL")
	public String getKindDecl() {
		return kindDecl;
	}
	@XmlElement(name="TAXOBJNO")
	public String getTaxObjNo() {
		return taxObjNo;
	}
	@XmlElement(name="PARTIDANO")
	public String getPartidano() {
		return partidano;
	}
	@XmlElement(name="OLD_PARTIDANO")
	public String getOldPartidano() {
		return oldPartidano;
	}
	@XmlElement(name="DOCUMENTTYPE")
	public String getDocumentType() {
		return documentType;
	}
	@XmlElement(name="TAXDOCDATE")
	public String getTaxdocDate() {
		return taxdocDate;
	}
	@XmlElement(name="DOCEXTNO")
	public String getDOCEXTNO() {
		return DOCEXTNO;
	}
	@XmlElement(name="DOC_DATE")
	public String getDocDate() {
		return docDate;
	}
	@XmlElement(name="DOCEXT_DATE")
	public String getDocExtDate() {
		return docExtDate;
	}
	@XmlElement(name="EARN_DATE")
	public String getEarnDate() {
		return earnDate;
	}
	@XmlElement(name="CHANGE_DATE")
	public String getChangeDate() {
		return changeDate;
	}
	@XmlElement(name="EMP_IDN")
	public String getEmpIdn() {
		return empIdn;
	}
	@XmlElement(name="EMP_NAME")
	public String getEmpName() {
		return empName;
	}
	@XmlElement(name="EMP_POST_ADDR")
	public XmlMapperDecl14AddressNew getEmpPostAddress() {
		return empPostAddress;
	}
	@XmlElement(name="EMP_IDENTDOC_KIND")
	public String getEmpIdentDocKind() {
		return empIdentDocKind;
	}
	@XmlElement(name="EMP_IDENTDOCNO")
	public String getEmpIdentDoc() {
		return empIdentDoc;
	}
	@XmlElement(name="EMPNO")
	public String getEmpNo() {
		return empNo;
	}
	@XmlElement(name="EMP_EMISSIONDATE")
	public String getEmpEmissionDate() {
		return empEmissionDate;
	}
	@XmlElement(name="EMP_CERTIFY")
	public String getEmpCertify() {
		return empCertify;
	}
	@XmlElement(name="EMP_IDENT_EMISSION_DATE")
	public String getEmpIdentEmissionDate() {
		return empIdentEmissionDate;
	}
	@XmlElement(name="EMP_RDVR")
	public String getEmpRdvr() {
		return empRdvr;
	}
	@XmlElement(name="GIVE_REASONREG")
	public String getGiveReasonReg() {
		return giveReasonReg;
	}
	@XmlElement(name="RELIEF")
	public XmlMapperDecl14Relief getRelief() {
		return relief;
	}
	@XmlElement(name="DOCWORK_FINALDATE")
	public String getDocWorkFinalDate() {
		return docWorkFinalDate;
	}
	@XmlElement(name="RECEIVER_DATE")
	public String getReceiverDate() {
		return receiverDate;
	}
	@XmlElement(name="RECEIVER_NOTE")
	public String getReceiverNote() {
		return receiverNote;
	}
	@XmlElement(name="DOCINPUT_DATE")
	public String getDocInputDate() {
		return docInputDate;
	}
	@XmlElement(name="NOTE")
	public String getNote() {
		return note;
	}
	@XmlElement(name="CLOSENOTE")
	public String getClodeNote() {
		return clodeNote;
	}
	@XmlElement(name="ACCVALUE")
	public String getAccValue() {
		return accValue;
	}
	@XmlElement(name="COMPANY")
	public String getCompany() {
		return company;
	}
	@XmlElement(name="DOCSTATUS")
	public String getDocStatus() {
		return docStatus;
	}
	@XmlElement(name="CLOSE__REASONREG")
	public String getCloseReasonReg() {
		return closeReasonReg;
	}
	@XmlElement(name="CLOSE_DATE")
	public String getCloseDate() {
		return closeDate;
	}
	@XmlElement(name="CLOSE_TAXDOC_ID")
	public String getCloseTaxDocId() {
		return closeTaxDocId;
	}
	@XmlElement(name="ISINHERITANCE")
	public String getIsInheritance() {
		return isInheritance;
	}
	@XmlElement(name="WAIT_DATE")
	public String getWaitDate() {
		return waitDate;
	}
	@XmlElement(name="TO_USER_ID")
	public String getToUserId() {
		return toUserId;
	}
	@XmlElement(name="LOCATION_DOC")
	public String getLocationDoc() {
		return locationDoc;
	}
	@XmlElement(name="USER_DATE")
	public String getUserDate() {
		return userDate;
	}
	@XmlElement(name="USER_NAME")
	public String getUserName() {
		return userName;
	}
	@XmlElement(name="BEGINTAXDATE")
	public String getBeginTaxDate() {
		return beginTaxDate;
	}
	@XmlElement(name="ENDTAXDATE")
	public String getEndTaxDate() {
		return endTaxDate;
	}
	@XmlElement(name="ISINVALID")
	public String getIsInvalid() {
		return isInvalid;
	}
	@XmlElement(name="RECEIVER_USER_ID")
	public String getReceiverUserId() {
		return receiverUserId;
	}
	@XmlElement(name="RECEIVER_USER_NAME")
	public String getReceiverUserName() {
		return receiverUserName;
	}
	@XmlElement(name="REPRNAME")
	public String getRepName() {
		return repName;
	}
	@XmlElement(name="PROPERTY")
	public XmlMapperDecl14Property getProperty() {
		return property;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public void setObject(XmlMapperDecl14TaxObject object) {
		this.object = object;
	}
	public void setDeclIdn(String declIdn) {
		this.declIdn = declIdn;
	}
	public void setDeclName(String declName) {
		this.declName = declName;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setIdentDocKind(String identDocKind) {
		this.identDocKind = identDocKind;
	}
	public void setDeclIdentDocKind(String declIdentDocKind) {
		this.declIdentDocKind = declIdentDocKind;
	}
	public void setDeclEmissionDate(String declEmissionDate) {
		this.declEmissionDate = declEmissionDate;
	}
	public void setDeclRdvr(String declRdvr) {
		this.declRdvr = declRdvr;
	}
	public void setDeclPermAddress(XmlMapperDecl14AddressNew declPermAddress) {
		this.declPermAddress = declPermAddress;
	}
	public void setDeclPostAddress(XmlMapperDecl14AddressNew declPostAddress) {
		this.declPostAddress = declPostAddress;
	}
	public void setKindDecl(String kindDecl) {
		this.kindDecl = kindDecl;
	}
	public void setTaxObjNo(String taxObjNo) {
		this.taxObjNo = taxObjNo;
	}
	public void setPartidano(String partidano) {
		this.partidano = partidano;
	}
	public void setOldPartidano(String oldPartidano) {
		this.oldPartidano = oldPartidano;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public void setTaxdocDate(String taxdocDate) {
		this.taxdocDate = taxdocDate;
	}
	public void setDOCEXTNO(String dOCEXTNO) {
		DOCEXTNO = dOCEXTNO;
	}
	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}
	public void setDocExtDate(String docExtDate) {
		this.docExtDate = docExtDate;
	}
	public void setEarnDate(String earnDate) {
		this.earnDate = earnDate;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}
	public void setEmpIdn(String empIdn) {
		this.empIdn = empIdn;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpPostAddress(XmlMapperDecl14AddressNew empPostAddress) {
		this.empPostAddress = empPostAddress;
	}
	public void setEmpIdentDocKind(String empIdentDocKind) {
		this.empIdentDocKind = empIdentDocKind;
	}
	public void setEmpIdentDoc(String empIdentDoc) {
		this.empIdentDoc = empIdentDoc;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public void setEmpEmissionDate(String empEmissionDate) {
		this.empEmissionDate = empEmissionDate;
	}
	public void setEmpCertify(String empCertify) {
		this.empCertify = empCertify;
	}
	public void setEmpIdentEmissionDate(String empIdentEmissionDate) {
		this.empIdentEmissionDate = empIdentEmissionDate;
	}
	public void setEmpRdvr(String empRdvr) {
		this.empRdvr = empRdvr;
	}
	public void setGiveReasonReg(String giveReasonReg) {
		this.giveReasonReg = giveReasonReg;
	}
	public void setRelief(XmlMapperDecl14Relief relief) {
		this.relief = relief;
	}
	public void setDocWorkFinalDate(String docWorkFinalDate) {
		this.docWorkFinalDate = docWorkFinalDate;
	}
	public void setReceiverDate(String receiverDate) {
		this.receiverDate = receiverDate;
	}
	public void setReceiverNote(String receiverNote) {
		this.receiverNote = receiverNote;
	}
	public void setDocInputDate(String docInputDate) {
		this.docInputDate = docInputDate;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setClodeNote(String clodeNote) {
		this.clodeNote = clodeNote;
	}
	public void setAccValue(String accValue) {
		this.accValue = accValue;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}
	public void setCloseReasonReg(String closeReasonReg) {
		this.closeReasonReg = closeReasonReg;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public void setCloseTaxDocId(String closeTaxDocId) {
		this.closeTaxDocId = closeTaxDocId;
	}
	public void setIsInheritance(String isInheritance) {
		this.isInheritance = isInheritance;
	}
	public void setWaitDate(String waitDate) {
		this.waitDate = waitDate;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	public void setLocationDoc(String locationDoc) {
		this.locationDoc = locationDoc;
	}
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setBeginTaxDate(String beginTaxDate) {
		this.beginTaxDate = beginTaxDate;
	}
	public void setEndTaxDate(String endTaxDate) {
		this.endTaxDate = endTaxDate;
	}
	public void setIsInvalid(String isInvalid) {
		this.isInvalid = isInvalid;
	}
	public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}
	public void setReceiverUserName(String receiverUserName) {
		this.receiverUserName = receiverUserName;
	}
	public void setRepName(String repName) {
		this.repName = repName;
	}
	public void setProperty(XmlMapperDecl14Property property) {
		this.property = property;
	}
	
	
}
