package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14Land {
/***
 * (select d.value from decode d where d.columnname = 'TypeDeclar' and d.code::integer =  typedeclar::integer) as "TYPEDECLAR", landno as "LANDNO",
DECODE(buildingowner,1.0,'да','не') as "BUILDINGOWNER",
numbertrim(landarea) as "LANDAREA", numbertrim(builtuparea) as "BUILTUPAREA", to_char(taxbegindate,'dd.mm.yyyy') as "TAXBEGINDATE",
to_char(taxenddate, 'dd.mm.yyyy') as "TAXENDDATE",
to_char(earn_date,'dd.mm.yyyy') as "EARN_DATE",
to_char(change_date,'dd.mm.yyyy') as "CHANGE_DATE",
numbertrim(fenceheight) as "FENCEHEIGHT", numbertrim(fencelength) as "FENCELENGTH",
DECODE(isfence,1.0,'да','не') as "ISFENCE",
 numbertrim(coveringarea) as "COVERINGAREA",
 numbertrim(sportarea) as "SPORTAREA",
DECODE(iscovering,1.0,'да','не') as "ISCOVERING",
numbertrim(poolcapacity) as "POOLCAPACITY", numbertrim(greenparking) as "GREENPARKING",
numbertrim(parkingarea) as "PARKINGAREA",
DECODE(issportcovering,1.0,'да','не')  as "ISSPORTCOVERING",
DECODE(ispark,1.0,'да','не')   as "ISPARK",
DECODE(ispool,1.0,'да','не')   as "ISPOOL", DECODE(issport,1.0,'да','не') as "ISSPORT",
DECODE(ispublic,1.0,'да','не') as "ISPUBLIC",
 kindpublicproperty as "KINDPUBLICPROPERTY",
DECODE(isgreenparking,1.0,'да','не') as "ISGREENPARKING",
  numbertrim(dutyfree) as "DUTYFREE",
dutyfreeorder as "DUTYFREEORDER", DECODE(isparking,1.0,'да','не') as "ISPARKING",
DECODE(isbusiness,1.0,'да','не') as "ISBUSINESS",  DECODE(restoreland,1.0,'да','не') as "RESTORELAND",
restorelanddoc as "RESTORELANDDOC",
 to_char(restorelanddate,'dd.mm.yyyy') as "RESTORELANDDATE",
--user_id, user_date,
note as "NOTE", numbertrim(errordata) as "ERRORDATA", used_from as "USED_FROM"
,xmlstructure.xmllandpart(l.land_id) as "LPARTS",
 xmlstructure.xmlfirm14land(l.land_id) as "LFIRM"
 */
	
	private String typeDeclar; //TYPEDECLAR
	private String landNo; //LANDNO
	private String buildingOwner; //BUILDINGOWNER
	private String landArea; //LANDAREA
	private String builtupArea; //BUILTUPAREA
	private String taxBeginDate; //TAXBEGINDATE
	private String taxEndDate; //TAXENDDATE
	private String earnDate; //EARN_DATE
	private String changeDate; //CHANGE_DATE
	private String fenceHeight; //FENCEHEIGHT
	private String fenceLength; //FENCELENGTH
	private String isFence; //ISFENCE
	private String coveringArea; //COVERINGAREA
	private String sportArea; //SPORTAREA
	private String isCovering; //ISCOVERING
	private String poolCapacity; //POOLCAPACITY
	private String greenParking; //GREENPARKING
	private String parkingArea; //PARKINGAREA
	private String isSportCovering; //ISSPORTCOVERING
	private String isPark; //ISPARK
	private String isPool; //ISPOOL
	private String isSport; //ISSPORT
	private String isPublic; //ISPUBLIC
	private String kindPublicProperty; //KINDPUBLICPROPERTY
	private String isGreenParking; //ISGREENPARKING
	private String dutyFree; //DUTYFREE
	private String isParking;  //ISPARKING
	private String dutyFreeOrder; //DUTYFREEORDER
	private String isBusiness; //ISBUSINESS
	private String restoreLand; //RESTORELAND
	private String restoreLandDoc; //RESTORELANDDOC
	private String restoreLandDate; //RESTORELANDDATE
	private String note; //NOTE
	private String errorData;  //ERRORDATA
	private String usedFrom; //USED_FROM
	private XmlMapperDecl14PartLands lParts;  //LPARTS
	private XmlMapperDecl14FirmLand lFirm ; //LFIRM
	
	@XmlElement(name="TYPEDECLAR")
	public String getTypeDeclar() {
		return typeDeclar;
	}
	@XmlElement(name="LANDNO")
	public String getLandNo() {
		return landNo;
	}
	@XmlElement(name="BUILDINGOWNER")
	public String getBuildingOwner() {
		return buildingOwner;
	}
	@XmlElement(name="LANDAREA")
	public String getLandArea() {
		return landArea;
	}
	@XmlElement(name="BUILTUPAREA")
	public String getBuiltupArea() {
		return builtupArea;
	}
	@XmlElement(name="TAXBEGINDATE")
	public String getTaxBeginDate() {
		return taxBeginDate;
	}
	@XmlElement(name="TAXENDDATE")
	public String getTaxEndDate() {
		return taxEndDate;
	}
	@XmlElement(name="EARN_DATE")
	public String getEarnDate() {
		return earnDate;
	}
	@XmlElement(name="CHANGE_DATE")
	public String getChangeDate() {
		return changeDate;
	}
	@XmlElement(name="FENCEHEIGHT")
	public String getFenceHeight() {
		return fenceHeight;
	}
	@XmlElement(name="FENCELENGTH")
	public String getFenceLength() {
		return fenceLength;
	}
	@XmlElement(name="ISFENCE")
	public String getIsFence() {
		return isFence;
	}
	@XmlElement(name="COVERINGAREA")
	public String getCoveringArea() {
		return coveringArea;
	}
	@XmlElement(name="SPORTAREA")
	public String getSportArea() {
		return sportArea;
	}
	@XmlElement(name="ISCOVERING")
	public String getIsCovering() {
		return isCovering;
	}
	@XmlElement(name="POOLCAPACITY")
	public String getPoolCapacity() {
		return poolCapacity;
	}
	@XmlElement(name="GREENPARKING")
	public String getGreenParking() {
		return greenParking;
	}
	@XmlElement(name="PARKINGAREA")
	public String getParkingArea() {
		return parkingArea;
	}
	@XmlElement(name="ISSPORTCOVERING")
	public String getIsSportCovering() {
		return isSportCovering;
	}
	@XmlElement(name="ISPARK")
	public String getIsPark() {
		return isPark;
	}
	@XmlElement(name="ISPOOL")
	public String getIsPool() {
		return isPool;
	}
	@XmlElement(name="ISSPORT")
	public String getIsSport() {
		return isSport;
	}
	@XmlElement(name="ISPUBLIC")
	public String getIsPublic() {
		return isPublic;
	}
	@XmlElement(name="KINDPUBLICPROPERTY")
	public String getKindPublicProperty() {
		return kindPublicProperty;
	}
	@XmlElement(name="ISGREENPARKING")
	public String getIsGreenParking() {
		return isGreenParking;
	}
	@XmlElement(name="DUTYFREE")
	public String getDutyFree() {
		return dutyFree;
	}
	@XmlElement(name="ISPARKING")
	public String getIsParking() {
		return isParking;
	}
	@XmlElement(name="DUTYFREEORDER")
	public String getDutyFreeOrder() {
		return dutyFreeOrder;
	}
	@XmlElement(name="ISBUSINESS")
	public String getIsBusiness() {
		return isBusiness;
	}
	@XmlElement(name="RESTORELAND")
	public String getRestoreLand() {
		return restoreLand;
	}
	@XmlElement(name="RESTORELANDDOC")
	public String getRestoreLandDoc() {
		return restoreLandDoc;
	}
	@XmlElement(name="RESTORELANDDATE")
	public String getRestoreLandDate() {
		return restoreLandDate;
	}
	@XmlElement(name="NOTE")
	public String getNote() {
		return note;
	}
	@XmlElement(name="ERRORDATA")
	public String getErrorData() {
		return errorData;
	}
	@XmlElement(name="USED_FROM")
	public String getUsedFrom() {
		return usedFrom;
	}
	@XmlElement(name="LPARTS")
	public XmlMapperDecl14PartLands getlParts() {
		return lParts;
	}
	@XmlElement(name="LFIRM")
	public XmlMapperDecl14FirmLand getlFirm() {
		return lFirm;
	}
	public void setTypeDeclar(String typeDeclar) {
		this.typeDeclar = typeDeclar;
	}
	public void setLandNo(String landNo) {
		this.landNo = landNo;
	}
	public void setBuildingOwner(String buildingOwner) {
		this.buildingOwner = buildingOwner;
	}
	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	public void setBuiltupArea(String builtupArea) {
		this.builtupArea = builtupArea;
	}
	public void setTaxBeginDate(String taxBeginDate) {
		this.taxBeginDate = taxBeginDate;
	}
	public void setTaxEndDate(String taxEndDate) {
		this.taxEndDate = taxEndDate;
	}
	public void setEarnDate(String earnDate) {
		this.earnDate = earnDate;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}
	public void setFenceHeight(String fenceHeight) {
		this.fenceHeight = fenceHeight;
	}
	public void setFenceLength(String fenceLength) {
		this.fenceLength = fenceLength;
	}
	public void setIsFence(String isFence) {
		this.isFence = isFence;
	}
	public void setCoveringArea(String coveringArea) {
		this.coveringArea = coveringArea;
	}
	public void setSportArea(String sportArea) {
		this.sportArea = sportArea;
	}
	public void setIsCovering(String isCovering) {
		this.isCovering = isCovering;
	}
	public void setPoolCapacity(String poolCapacity) {
		this.poolCapacity = poolCapacity;
	}
	public void setGreenParking(String greenParking) {
		this.greenParking = greenParking;
	}
	public void setParkingArea(String parkingArea) {
		this.parkingArea = parkingArea;
	}
	public void setIsSportCovering(String isSportCovering) {
		this.isSportCovering = isSportCovering;
	}
	public void setIsPark(String isPark) {
		this.isPark = isPark;
	}
	public void setIsPool(String isPool) {
		this.isPool = isPool;
	}
	public void setIsSport(String isSport) {
		this.isSport = isSport;
	}
	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}
	public void setKindPublicProperty(String kindPublicProperty) {
		this.kindPublicProperty = kindPublicProperty;
	}
	public void setIsGreenParking(String isGreenParking) {
		this.isGreenParking = isGreenParking;
	}
	public void setDutyFree(String dutyFree) {
		this.dutyFree = dutyFree;
	}
	public void setIsParking(String isParking) {
		this.isParking = isParking;
	}
	public void setDutyFreeOrder(String dutyFreeOrder) {
		this.dutyFreeOrder = dutyFreeOrder;
	}
	public void setIsBusiness(String isBusiness) {
		this.isBusiness = isBusiness;
	}
	public void setRestoreLand(String restoreLand) {
		this.restoreLand = restoreLand;
	}
	public void setRestoreLandDoc(String restoreLandDoc) {
		this.restoreLandDoc = restoreLandDoc;
	}
	public void setRestoreLandDate(String restoreLandDate) {
		this.restoreLandDate = restoreLandDate;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setErrorData(String errorData) {
		this.errorData = errorData;
	}
	public void setUsedFrom(String usedFrom) {
		this.usedFrom = usedFrom;
	}
	public void setlParts(XmlMapperDecl14PartLands lParts) {
		this.lParts = lParts;
	}
	public void setlFirm(XmlMapperDecl14FirmLand lFirm) {
		this.lFirm = lFirm;
	}
	
}
