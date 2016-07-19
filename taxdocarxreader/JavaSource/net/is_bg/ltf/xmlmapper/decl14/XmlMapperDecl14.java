package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlRootElement;

/***
 *
 */

@XmlRootElement(name="TAXDOC")
public class XmlMapperDecl14 {
	
	private String municipality;   //MUNICIPALITY
	private XmlMapperDecl14Object object;   //OBJECT
	private String declIdn;   //DECL_IDN
	private String declName;   //DECL_NAME
	private String telefon;   //TELEFON
	private String identDocKind;           //IDENTDOC_KIND
	private String declIdentDocKind;       //DECL_IDENTDOC_KIND
	private String declEmissionDate;       //DECL_EMISSION_DATE
	private String declRdvr;                //DECL_RDVR 
	private XmlMapperDecl14Address declPermAddress;  //DECL_PERM_ADDR
	private XmlMapperDecl14Address declPostAddress;   //DECL_POST_ADDR
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
	private XmlMapperDecl14Address empPostAddress;  //EMP_POST_ADDR
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
	private XmlDecl14Property property;   //PROPERTY
	
	
	
}
