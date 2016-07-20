package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;


public class XmlMapperDecl14Building {
	
	private String seqBuilding; //SEQNOBUILDING
	private String buildingNo; //BUILDINGNO
	private String kindFunction; //KINDFUNCTION
	private String floorNumber; //FLOORNUMBER
	private String floorNumOver; //FLOORNUMOVER
	private String elevator; //ELEVATOR
	private String monument; //MONUMENT
	private String monumentDoc; //MONUMENTDOC
	private String monumentDate; //MONUMENTDATE
	private String publicTransport; //PUBLICTRANSPORT
	private String farm; //FARM
	private String damage; //DAMAGE
	private String damageDoc; //DAMAGEDOC
	private String damageDocDate; //DAMAGEDOCDATE
	private String damageDocPubl; //DAMAGEDOCPUBL
	private String errorData; //ERRORDATA
	private String isTemporary; //ISTEMPORARY
	private String buildYear; //BUILDYEAR
	private String zeeCertificate; //ZEESERTIFICAT
	private String zeeCategory; //ZEECATEGORY
	private String zeeClass;//ZEECLASS
	private String zeeBeginPeriod; //ZEEBEGINPERIOD
	private String zeeCertNo; //ZEESERTNO
	private String zeeCertate; //ZEESERTDATE
	private String zeeCertPubl; //ZEESERTPUBL
	private String bck; //BCK
	private String zeeActivity; //ZEEACTIVITY
	private String outland; //OUTLAND
	private String dutyFree; //DUTYFREE
	private String dutyFreeOrder; //DUTYFREEORDER
	private String note; //NOTE
	private String isMuseum; //ISMUSEUM
	private String monumentYear; //MONUMENTYEAR
	private String officailJurnal; //OFFICIALJURNAL
	private String restoreBuild; //RESTOREBUILD
	private String restoreBuildDate; //RESTOREBUILD_DATE
	private String restoreBuildDoc; //RESTOREBUILDDOC
	private String restoreDocIssue; //RESTOREDOCISSUE
	private String restoreYear; //RESTOREYEAR
	private String usedFrom; //USED_FROM
	private XmlMapperDecl14Homes homes; //HOMES
	
	@XmlElement(name="SEQNOBUILDING")
	public String getSeqBuilding() {
		return seqBuilding;
	}
	@XmlElement(name="BUILDINGNO")
	public String getBuildingNo() {
		return buildingNo;
	}
	@XmlElement(name="KINDFUNCTION")
	public String getKindFunction() {
		return kindFunction;
	}
	@XmlElement(name="FLOORNUMBER")
	public String getFloorNumber() {
		return floorNumber;
	}
	@XmlElement(name="FLOORNUMOVER")
	public String getFloorNumOver() {
		return floorNumOver;
	}
	@XmlElement(name="ELEVATOR")
	public String getElevator() {
		return elevator;
	}
	@XmlElement(name="MONUMENT")
	public String getMonument() {
		return monument;
	}
	@XmlElement(name="MONUMENTDOC")
	public String getMonumentDoc() {
		return monumentDoc;
	}
	@XmlElement(name="MONUMENTDATE")
	public String getMonumentDate() {
		return monumentDate;
	}
	@XmlElement(name="PUBLICTRANSPORT")
	public String getPublicTransport() {
		return publicTransport;
	}
	@XmlElement(name="FARM")
	public String getFarm() {
		return farm;
	}
	@XmlElement(name="DAMAGE")
	public String getDamage() {
		return damage;
	}
	@XmlElement(name="DAMAGEDOC")
	public String getDamageDoc() {
		return damageDoc;
	}
	@XmlElement(name="DAMAGEDOCDATE")
	public String getDamageDocDate() {
		return damageDocDate;
	}
	@XmlElement(name="DAMAGEDOCPUBL")
	public String getDamageDocPubl() {
		return damageDocPubl;
	}
	@XmlElement(name="ERRORDATA")
	public String getErrorData() {
		return errorData;
	}
	@XmlElement(name="ISTEMPORARY")
	public String getIsTemporary() {
		return isTemporary;
	}
	@XmlElement(name="BUILDYEAR")
	public String getBuildYear() {
		return buildYear;
	}
	@XmlElement(name="ZEESERTIFICAT")
	public String getZeeCertificate() {
		return zeeCertificate;
	}
	@XmlElement(name="ZEECATEGORY")
	public String getZeeCategory() {
		return zeeCategory;
	}
	@XmlElement(name="ZEECLASS")
	public String getZeeClass() {
		return zeeClass;
	}
	@XmlElement(name="ZEEBEGINPERIOD")
	public String getZeeBeginPeriod() {
		return zeeBeginPeriod;
	}
	@XmlElement(name="ZEESERTNO")
	public String getZeeCertNo() {
		return zeeCertNo;
	}
	@XmlElement(name="ZEESERTDATE")
	public String getZeeCertate() {
		return zeeCertate;
	}
	@XmlElement(name="ZEESERTPUBL")
	public String getZeeCertPubl() {
		return zeeCertPubl;
	}
	@XmlElement(name="BCK")
	public String getBck() {
		return bck;
	}
	@XmlElement(name="ZEEACTIVITY")
	public String getZeeActivity() {
		return zeeActivity;
	}
	@XmlElement(name="OUTLAND")
	public String getOutland() {
		return outland;
	}
	@XmlElement(name="DUTYFREE")
	public String getDutyFree() {
		return dutyFree;
	}
	@XmlElement(name="DUTYFREEORDER")
	public String getDutyFreeOrder() {
		return dutyFreeOrder;
	}
	@XmlElement(name="NOTE")
	public String getNote() {
		return note;
	}
	@XmlElement(name="ISMUSEUM")
	public String getIsMuseum() {
		return isMuseum;
	}
	@XmlElement(name="MONUMENTYEAR")
	public String getMonumentYear() {
		return monumentYear;
	}
	@XmlElement(name="OFFICIALJURNAL")
	public String getOfficailJurnal() {
		return officailJurnal;
	}
	@XmlElement(name="RESTOREBUILD")
	public String getRestoreBuild() {
		return restoreBuild;
	}
	@XmlElement(name="RESTOREBUILD_DATE")
	public String getRestoreBuildDate() {
		return restoreBuildDate;
	}
	@XmlElement(name="RESTOREBUILDDOC")
	public String getRestoreBuildDoc() {
		return restoreBuildDoc;
	}
	@XmlElement(name="RESTOREDOCISSUE")
	public String getRestoreDocIssue() {
		return restoreDocIssue;
	}
	@XmlElement(name="RESTOREYEAR")
	public String getRestoreYear() {
		return restoreYear;
	}
	@XmlElement(name="USED_FROM")
	public String getUsedFrom() {
		return usedFrom;
	}
	@XmlElement(name="HOMES")
	public XmlMapperDecl14Homes getHomes() {
		return homes;
	}
	public void setSeqBuilding(String seqBuilding) {
		this.seqBuilding = seqBuilding;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public void setKindFunction(String kindFunction) {
		this.kindFunction = kindFunction;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public void setFloorNumOver(String floorNumOver) {
		this.floorNumOver = floorNumOver;
	}
	public void setElevator(String elevator) {
		this.elevator = elevator;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	public void setMonumentDoc(String monumentDoc) {
		this.monumentDoc = monumentDoc;
	}
	public void setMonumentDate(String monumentDate) {
		this.monumentDate = monumentDate;
	}
	public void setPublicTransport(String publicTransport) {
		this.publicTransport = publicTransport;
	}
	public void setFarm(String farm) {
		this.farm = farm;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public void setDamageDoc(String damageDoc) {
		this.damageDoc = damageDoc;
	}
	public void setDamageDocDate(String damageDocDate) {
		this.damageDocDate = damageDocDate;
	}
	public void setDamageDocPubl(String damageDocPubl) {
		this.damageDocPubl = damageDocPubl;
	}
	public void setErrorData(String errorData) {
		this.errorData = errorData;
	}
	public void setIsTemporary(String isTemporary) {
		this.isTemporary = isTemporary;
	}
	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}
	public void setZeeCertificate(String zeeCertificate) {
		this.zeeCertificate = zeeCertificate;
	}
	public void setZeeCategory(String zeeCategory) {
		this.zeeCategory = zeeCategory;
	}
	public void setZeeClass(String zeeClass) {
		this.zeeClass = zeeClass;
	}
	public void setZeeBeginPeriod(String zeeBeginPeriod) {
		this.zeeBeginPeriod = zeeBeginPeriod;
	}
	public void setZeeCertNo(String zeeCertNo) {
		this.zeeCertNo = zeeCertNo;
	}
	public void setZeeCertate(String zeeCertate) {
		this.zeeCertate = zeeCertate;
	}
	public void setZeeCertPubl(String zeeCertPubl) {
		this.zeeCertPubl = zeeCertPubl;
	}
	public void setBck(String bck) {
		this.bck = bck;
	}
	public void setZeeActivity(String zeeActivity) {
		this.zeeActivity = zeeActivity;
	}
	public void setOutland(String outland) {
		this.outland = outland;
	}
	public void setDutyFree(String dutyFree) {
		this.dutyFree = dutyFree;
	}
	public void setDutyFreeOrder(String dutyFreeOrder) {
		this.dutyFreeOrder = dutyFreeOrder;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setIsMuseum(String isMuseum) {
		this.isMuseum = isMuseum;
	}
	public void setMonumentYear(String monumentYear) {
		this.monumentYear = monumentYear;
	}
	public void setOfficailJurnal(String officailJurnal) {
		this.officailJurnal = officailJurnal;
	}
	public void setRestoreBuild(String restoreBuild) {
		this.restoreBuild = restoreBuild;
	}
	public void setRestoreBuildDate(String restoreBuildDate) {
		this.restoreBuildDate = restoreBuildDate;
	}
	public void setRestoreBuildDoc(String restoreBuildDoc) {
		this.restoreBuildDoc = restoreBuildDoc;
	}
	public void setRestoreDocIssue(String restoreDocIssue) {
		this.restoreDocIssue = restoreDocIssue;
	}
	public void setRestoreYear(String restoreYear) {
		this.restoreYear = restoreYear;
	}
	public void setUsedFrom(String usedFrom) {
		this.usedFrom = usedFrom;
	}
	public void setHomes(XmlMapperDecl14Homes homes) {
		this.homes = homes;
	}
}
