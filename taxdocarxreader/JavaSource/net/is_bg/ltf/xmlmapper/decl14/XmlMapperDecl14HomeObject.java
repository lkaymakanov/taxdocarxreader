package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14HomeObject {

	/***/
	private String seqNoObj;   //SEQNOOBJ
	private String homeObjNo;//HOMEOBJNO
	private String functionho;  //FUNCTIONHO
	private String objectarea;// OBJECTAREA
	private String kindHomeObj;  //KINDHOMEOBJ
	private String cellArea; //CELLERAREA
	private String atticArea;  //ATTICAREA
	private String earnDate;//EARN_DATE
	private String changeDate; //CHANGE_DATE
	private String totalArea; //TOTALAREA
	private String height;  //HEIGHT
	private String buildDate; //BUILDDATE
	private String floor; //FLOOR
	private String kindConstruction; //KINDCONSTRUCTION 
	private String isElectro; //ISELECTRO
	private String isWater;//ISWATER
	private String isSewer;//ISSEWER
	private String isTec;//ISTEC
	private String isTelefon; //ISTELEFON
	private String isBusiness;//ISBUSINESS
	private String repairDate;//REPAIRDATE
	private String isHeating;//ISHEATING
	private String isAirCondition; //ISAIRCONDITION
	private String luxWindow;//LUXWINDOW
	private String soundInsulation;//SOUNDINSULATION
	private String specialRoof; //SPECIALROOF
	private String luxDecorate; //LUXDECORATE
	private String errorData;//ERRORDATA
	private String noUseDoc; //NOUSEDOC
	private String noUseDate; //NOUSEDATE
	private String restoreObj; //RESTOREOBJ
	private String restoreObjDate; //RESTOREOBJDATE
	private String restoreObjDoc;//RESTOREOBJDOC
	private String zeeCertificate; //ZEESERTIFICAT
	private String taxBeaginDate; //TAXBEGINDATE
	private String taxEndDate; //TAXENDDATE
	private String objectIdentifier; //OBJECTIDENTIFIER
	private String badCondition; //BADCONDITION
	private XmlMapperDecl14HParts hPart; //HPARTS
	private XmlMapperDecl14FirmHome hfirm; //HFIRM
	

	@XmlElement(name="SEQNOOBJ")
	public String getSeqNoObj() {
		return seqNoObj;
	}
	@XmlElement(name="HOMEOBJNO")
	public String getHomeObjNo() {
		return homeObjNo;
	}
	@XmlElement(name="FUNCTIONHO")
	public String getFunctionho() {
		return functionho;
	}
	@XmlElement(name="OBJECTAREA")
	public String getObjectarea() {
		return objectarea;
	}
	@XmlElement(name="KINDHOMEOBJ")
	public String getKindHomeObj() {
		return kindHomeObj;
	}
	@XmlElement(name="CELLERAREA")
	public String getCellArea() {
		return cellArea;
	}
	@XmlElement(name="ATTICAREA")
	public String getAtticArea() {
		return atticArea;
	}
	@XmlElement(name="EARN_DATE")
	public String getEarnDate() {
		return earnDate;
	}
	@XmlElement(name="CHANGE_DATE")
	public String getChangeDate() {
		return changeDate;
	}
	@XmlElement(name="TOTALAREA")
	public String getTotalArea() {
		return totalArea;
	}
	@XmlElement(name="HEIGHT")
	public String getHeight() {
		return height;
	}
	@XmlElement(name="BUILDDATE")
	public String getBuildDate() {
		return buildDate;
	}
	@XmlElement(name="FLOOR")
	public String getFloor() {
		return floor;
	}
	@XmlElement(name="KINDCONSTRUCTION")
	public String getKindConstruction() {
		return kindConstruction;
	}
	@XmlElement(name="ISELECTRO")
	public String getIsElectro() {
		return isElectro;
	}
	@XmlElement(name="ISWATER")
	public String getIsWater() {
		return isWater;
	}
	@XmlElement(name="ISSEWER")
	public String getIsSewer() {
		return isSewer;
	}
	@XmlElement(name="ISTEC")
	public String getIsTec() {
		return isTec;
	}
	@XmlElement(name="ISTELEFON")
	public String getIsTelefon() {
		return isTelefon;
	}
	@XmlElement(name="ISBUSINESS")
	public String getIsBusiness() {
		return isBusiness;
	}
	@XmlElement(name="REPAIRDATE")
	public String getRepairDate() {
		return repairDate;
	}
	@XmlElement(name="ISHEATING")
	public String getIsHeating() {
		return isHeating;
	}
	@XmlElement(name="ISAIRCONDITION")
	public String getIsAirCondition() {
		return isAirCondition;
	}
	@XmlElement(name="LUXWINDOW")
	public String getLuxWindow() {
		return luxWindow;
	}
	@XmlElement(name="SOUNDINSULATION")
	public String getSoundInsulation() {
		return soundInsulation;
	}
	@XmlElement(name="SPECIALROOF")
	public String getSpecialRoof() {
		return specialRoof;
	}
	@XmlElement(name="LUXDECORATE")
	public String getLuxDecorate() {
		return luxDecorate;
	}
	@XmlElement(name="ERRORDATA")
	public String getErrorData() {
		return errorData;
	}
	@XmlElement(name="NOUSEDOC")
	public String getNoUseDoc() {
		return noUseDoc;
	}
	@XmlElement(name="NOUSEDATE")
	public String getNoUseDate() {
		return noUseDate;
	}
	@XmlElement(name="RESTOREOBJ")
	public String getRestoreObj() {
		return restoreObj;
	}
	@XmlElement(name="RESTOREOBJDATE")
	public String getRestoreObjDate() {
		return restoreObjDate;
	}
	@XmlElement(name="RESTOREOBJDOC")
	public String getRestoreObjDoc() {
		return restoreObjDoc;
	}
	@XmlElement(name="ZEESERTIFICAT")
	public String getZeeCertificate() {
		return zeeCertificate;
	}
	@XmlElement(name="TAXBEGINDATE")
	public String getTaxBeaginDate() {
		return taxBeaginDate;
	}
	@XmlElement(name="TAXENDDATE")
	public String getTaxEndDate() {
		return taxEndDate;
	}
	@XmlElement(name="OBJECTIDENTIFIER")
	public String getObjectIdentifier() {
		return objectIdentifier;
	}
	@XmlElement(name="BADCONDITION")
	public String getBadCondition() {
		return badCondition;
	}
	@XmlElement(name="HPARTS")
	public XmlMapperDecl14HParts gethPart() {
		return hPart;
	}
	@XmlElement(name="HFIRM")
	public XmlMapperDecl14FirmHome getHfirm() {
		return hfirm;
	}
	public void setSeqNoObj(String seqNoObj) {
		this.seqNoObj = seqNoObj;
	}
	public void setHomeObjNo(String homeObjNo) {
		this.homeObjNo = homeObjNo;
	}
	public void setFunctionho(String functionho) {
		this.functionho = functionho;
	}
	public void setObjectarea(String objectarea) {
		this.objectarea = objectarea;
	}
	public void setKindHomeObj(String kindHomeObj) {
		this.kindHomeObj = kindHomeObj;
	}
	public void setCellArea(String cellArea) {
		this.cellArea = cellArea;
	}
	public void setAtticArea(String atticArea) {
		this.atticArea = atticArea;
	}
	public void setEarnDate(String earnDate) {
		this.earnDate = earnDate;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}
	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public void setKindConstruction(String kindConstruction) {
		this.kindConstruction = kindConstruction;
	}
	public void setIsElectro(String isElectro) {
		this.isElectro = isElectro;
	}
	public void setIsWater(String isWater) {
		this.isWater = isWater;
	}
	public void setIsSewer(String isSewer) {
		this.isSewer = isSewer;
	}
	public void setIsTec(String isTec) {
		this.isTec = isTec;
	}
	public void setIsTelefon(String isTelefon) {
		this.isTelefon = isTelefon;
	}
	public void setIsBusiness(String isBusiness) {
		this.isBusiness = isBusiness;
	}
	public void setRepairDate(String repairDate) {
		this.repairDate = repairDate;
	}
	public void setIsHeating(String isHeating) {
		this.isHeating = isHeating;
	}
	public void setIsAirCondition(String isAirCondition) {
		this.isAirCondition = isAirCondition;
	}
	public void setLuxWindow(String luxWindow) {
		this.luxWindow = luxWindow;
	}
	public void setSoundInsulation(String soundInsulation) {
		this.soundInsulation = soundInsulation;
	}
	public void setSpecialRoof(String specialRoof) {
		this.specialRoof = specialRoof;
	}
	public void setLuxDecorate(String luxDecorate) {
		this.luxDecorate = luxDecorate;
	}
	public void setErrorData(String errorData) {
		this.errorData = errorData;
	}
	public void setNoUseDoc(String noUseDoc) {
		this.noUseDoc = noUseDoc;
	}
	public void setNoUseDate(String noUseDate) {
		this.noUseDate = noUseDate;
	}
	public void setRestoreObj(String restoreObj) {
		this.restoreObj = restoreObj;
	}
	public void setRestoreObjDate(String restoreObjDate) {
		this.restoreObjDate = restoreObjDate;
	}
	public void setRestoreObjDoc(String restoreObjDoc) {
		this.restoreObjDoc = restoreObjDoc;
	}
	public void setZeeCertificate(String zeeCertificate) {
		this.zeeCertificate = zeeCertificate;
	}
	public void setTaxBeaginDate(String taxBeaginDate) {
		this.taxBeaginDate = taxBeaginDate;
	}
	public void setTaxEndDate(String taxEndDate) {
		this.taxEndDate = taxEndDate;
	}
	public void setObjectIdentifier(String objectIdentifier) {
		this.objectIdentifier = objectIdentifier;
	}
	public void setBadCondition(String badCondition) {
		this.badCondition = badCondition;
	}
	public void sethPart(XmlMapperDecl14HParts hPart) {
		this.hPart = hPart;
	}
	public void setHfirm(XmlMapperDecl14FirmHome hfirm) {
		this.hfirm = hfirm;
	}
	
}
