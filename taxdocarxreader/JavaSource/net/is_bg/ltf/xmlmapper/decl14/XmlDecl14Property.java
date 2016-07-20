package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

/***/
public class XmlDecl14Property {
	
	private String locationMunicipality;   //LOCATION_MUNICIPALITY
	private String seqNoProperty;//SEQNOPROPERTY
	private String taxUnit2;  //TAXUNIT2
	private XmlMapperDecl14Address propertyAddress;   //PROPERTY_ADDRESS
	private String oneSender;// ONESENDER
	private String propertyNo;  //PROPERTYNO
	private String propDocDate; //PROPDOCDATE
	private String propertyNoDoc;  //PROPERTYNODOC
	private String kindProperty;//KINDPROPERTY
	private String propEmission; //PROPEMISSION
	private String oneOwner; //ONEOWNER
	private String oneuser;  //ONEUSER
	private String propertyNote; //PROPERTYNOTE
	private String kindLand; //KINDLAND
	private String otherInDoc; //OTHER_INCDOC 
	private String isElctro; //ISELECTRO
	private String isWater;//ISWATER
	private String kadastrNo;//KADASTRNO
	private String kadastrYear;//KADASTR_YEAR
	private String isSewer; //ISSEWER
	private String isTec;//ISTEC
	private String isRoad;//ISROAD
	private String categoryCity;//CATEGORY_CITY
	private String isNationalResort; //ISNATIONALRESORT
	private String isLocalResort;//ISLOCALRESORT
	private String isSeezone;//ISSEEZONE
	private String isNationalRoadNet; //ISNATIONALROADNET
	private String isIsolatedZone; //ISISOLATEDZONE
	private String cityCategory1;//CITY_CATEGORY1
	private String cityCategory2; //CITY_CATEGORY2
	private String builderZone; //BUILDER_ZONE
	private String zrpnoDistrict; //ZRPNO_DISTRICT
	private String zrpNoParcel; //ZRPNO_PARCEL
	private String zrpDate;//ZRP_DATE
	private String seeZoneCat; //SEEZONE_CAT
	private String note; //NOTE
	private String constructionBound; //CONSTRUCTIONBOUND
	private String structureZone; //STRUCTUREZONE
	private String replUserName; //REPL_USER_NAME
	private String propertyDoc; //PROPERTYDOC
	private String usesRight; //USESRIGHT
	private String status; //STATUS
	private String errorData; //ERRORDATA
	private String codeTbo; //CODETBO
	private String propgroupTbo; //PROPGROUPTBO
	private String promil; //PROMIL
	private String dublProperty; //DUBLPROPERTY
	private String propertyUsage; //PROPERTYUSAGE
	private String specifyotherUsage; //SPECIFYOTHERUSAGE
	private String propertyIdentifier; //PROPERTYIDENTIFIER
	private String inCharge; //INCHARGE
	private XmlMapperDecl14EdiFice edifice; //EDIFICE
	private XmlMapperDecl14Land land; //LAND
	private XmlMapperDecl14PartProperty partProperty;  //PARTPROPERTY
	
	@XmlElement(name="LOCATION_MUNICIPALITY")
	public String getLocationMunicipality() {
		return locationMunicipality;
	}
	@XmlElement(name="SEQNOPROPERTY")
	public String getSeqNoProperty() {
		return seqNoProperty;
	}
	@XmlElement(name="TAXUNIT2")
	public String getTaxUnit2() {
		return taxUnit2;
	}
	@XmlElement(name="PROPERTY_ADDRESS")
	public XmlMapperDecl14Address getPropertyAddress() {
		return propertyAddress;
	}
	@XmlElement(name="ONESENDER")
	public String getOneSender() {
		return oneSender;
	}
	@XmlElement(name="PROPERTYNO")
	public String getPropertyNo() {
		return propertyNo;
	}
	@XmlElement(name="PROPDOCDATE")
	public String getPropDocDate() {
		return propDocDate;
	}
	@XmlElement(name="PROPERTYNODOC")
	public String getPropertyNoDoc() {
		return propertyNoDoc;
	}
	@XmlElement(name="KINDPROPERTY")
	public String getKindProperty() {
		return kindProperty;
	}
	@XmlElement(name="PROPEMISSION")
	public String getPropEmission() {
		return propEmission;
	}
	@XmlElement(name="ONEOWNER")
	public String getOneOwner() {
		return oneOwner;
	}
	@XmlElement(name="ONEUSER")
	public String getOneuser() {
		return oneuser;
	}
	@XmlElement(name="PROPERTYNOTE")
	public String getPropertyNote() {
		return propertyNote;
	}
	@XmlElement(name="KINDLAND")
	public String getKindLand() {
		return kindLand;
	}
	@XmlElement(name="OTHER_INCDOC")
	public String getOtherInDoc() {
		return otherInDoc;
	}
	@XmlElement(name="ISELECTRO")
	public String getIsElctro() {
		return isElctro;
	}
	@XmlElement(name="ISWATER")
	public String getIsWater() {
		return isWater;
	}
	@XmlElement(name="KADASTRNO")
	public String getKadastrNo() {
		return kadastrNo;
	}
	@XmlElement(name="KADASTR_YEAR")
	public String getKadastrYear() {
		return kadastrYear;
	}
	@XmlElement(name="ISSEWER")
	public String getIsSewer() {
		return isSewer;
	}
	@XmlElement(name="ISTEC")
	public String getIsTec() {
		return isTec;
	}
	@XmlElement(name="ISROAD")
	public String getIsRoad() {
		return isRoad;
	}
	@XmlElement(name="CATEGORY_CITY")
	public String getCategoryCity() {
		return categoryCity;
	}
	@XmlElement(name="ISNATIONALRESORT")
	public String getIsNationalResort() {
		return isNationalResort;
	}
	@XmlElement(name="ISLOCALRESORT")
	public String getIsLocalResort() {
		return isLocalResort;
	}
	@XmlElement(name="ISSEEZONE")
	public String getIsSeezone() {
		return isSeezone;
	}
	@XmlElement(name="ISNATIONALROADNET")
	public String getIsNationalRoadNet() {
		return isNationalRoadNet;
	}
	@XmlElement(name="ISISOLATEDZONE")
	public String getIsIsolatedZone() {
		return isIsolatedZone;
	}
	@XmlElement(name="CITY_CATEGORY1")
	public String getCityCategory1() {
		return cityCategory1;
	}
	@XmlElement(name="CITY_CATEGORY2")
	public String getCityCategory2() {
		return cityCategory2;
	}
	@XmlElement(name="BUILDER_ZONE")
	public String getBuilderZone() {
		return builderZone;
	}
	@XmlElement(name="ZRPNO_DISTRICT")
	public String getZrpnoDistrict() {
		return zrpnoDistrict;
	}
	@XmlElement(name="ZRPNO_PARCEL")
	public String getZrpNoParcel() {
		return zrpNoParcel;
	}
	@XmlElement(name="ZRP_DATE")
	public String getZrpDate() {
		return zrpDate;
	}
	@XmlElement(name="SEEZONE_CAT")
	public String getSeeZoneCat() {
		return seeZoneCat;
	}
	@XmlElement(name="NOTE")
	public String getNote() {
		return note;
	}
	@XmlElement(name="CONSTRUCTIONBOUND")
	public String getConstructionBound() {
		return constructionBound;
	}
	@XmlElement(name="STRUCTUREZONE")
	public String getStructureZone() {
		return structureZone;
	}
	@XmlElement(name="REPL_USER_NAME")
	public String getReplUserName() {
		return replUserName;
	}
	@XmlElement(name="PROPERTYDOC")
	public String getPropertyDoc() {
		return propertyDoc;
	}
	@XmlElement(name="USESRIGHT")
	public String getUsesRight() {
		return usesRight;
	}
	@XmlElement(name="STATUS")
	public String getStatus() {
		return status;
	}
	@XmlElement(name="ERRORDATA")
	public String getErrorData() {
		return errorData;
	}
	@XmlElement(name="CODETBO")
	public String getCodeTbo() {
		return codeTbo;
	}
	@XmlElement(name="PROPGROUPTBO")
	public String getPropgroupTbo() {
		return propgroupTbo;
	}
	@XmlElement(name="PROMIL")
	public String getPromil() {
		return promil;
	}
	@XmlElement(name="DUBLPROPERTY")
	public String getDublProperty() {
		return dublProperty;
	}
	@XmlElement(name="PROPERTYUSAGE")
	public String getPropertyUsage() {
		return propertyUsage;
	}
	@XmlElement(name="SPECIFYOTHERUSAGE")
	public String getSpecifyotherUsage() {
		return specifyotherUsage;
	}
	@XmlElement(name="PROPERTYIDENTIFIER")
	public String getPropertyIdentifier() {
		return propertyIdentifier;
	}
	@XmlElement(name="INCHARGE")
	public String getInCharge() {
		return inCharge;
	}
	@XmlElement(name="EDIFICE")
	public XmlMapperDecl14EdiFice getEdifice() {
		return edifice;
	}
	@XmlElement(name="LAND")
	public XmlMapperDecl14Land getLand() {
		return land;
	}
	@XmlElement(name="PARTPROPERTY")
	public XmlMapperDecl14PartProperty getPartProperty() {
		return partProperty;
	}
	public void setLocationMunicipality(String locationMunicipality) {
		this.locationMunicipality = locationMunicipality;
	}
	public void setSeqNoProperty(String seqNoProperty) {
		this.seqNoProperty = seqNoProperty;
	}
	public void setTaxUnit2(String taxUnit2) {
		this.taxUnit2 = taxUnit2;
	}
	public void setPropertyAddress(XmlMapperDecl14Address propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public void setOneSender(String oneSender) {
		this.oneSender = oneSender;
	}
	public void setPropertyNo(String propertyNo) {
		this.propertyNo = propertyNo;
	}
	public void setPropDocDate(String propDocDate) {
		this.propDocDate = propDocDate;
	}
	public void setPropertyNoDoc(String propertyNoDoc) {
		this.propertyNoDoc = propertyNoDoc;
	}
	public void setKindProperty(String kindProperty) {
		this.kindProperty = kindProperty;
	}
	public void setPropEmission(String propEmission) {
		this.propEmission = propEmission;
	}
	public void setOneOwner(String oneOwner) {
		this.oneOwner = oneOwner;
	}
	public void setOneuser(String oneuser) {
		this.oneuser = oneuser;
	}
	public void setPropertyNote(String propertyNote) {
		this.propertyNote = propertyNote;
	}
	public void setKindLand(String kindLand) {
		this.kindLand = kindLand;
	}
	public void setOtherInDoc(String otherInDoc) {
		this.otherInDoc = otherInDoc;
	}
	public void setIsElctro(String isElctro) {
		this.isElctro = isElctro;
	}
	public void setIsWater(String isWater) {
		this.isWater = isWater;
	}
	public void setKadastrNo(String kadastrNo) {
		this.kadastrNo = kadastrNo;
	}
	public void setKadastrYear(String kadastrYear) {
		this.kadastrYear = kadastrYear;
	}
	public void setIsSewer(String isSewer) {
		this.isSewer = isSewer;
	}
	public void setIsTec(String isTec) {
		this.isTec = isTec;
	}
	public void setIsRoad(String isRoad) {
		this.isRoad = isRoad;
	}
	public void setCategoryCity(String categoryCity) {
		this.categoryCity = categoryCity;
	}
	public void setIsNationalResort(String isNationalResort) {
		this.isNationalResort = isNationalResort;
	}
	public void setIsLocalResort(String isLocalResort) {
		this.isLocalResort = isLocalResort;
	}
	public void setIsSeezone(String isSeezone) {
		this.isSeezone = isSeezone;
	}
	public void setIsNationalRoadNet(String isNationalRoadNet) {
		this.isNationalRoadNet = isNationalRoadNet;
	}
	public void setIsIsolatedZone(String isIsolatedZone) {
		this.isIsolatedZone = isIsolatedZone;
	}
	public void setCityCategory1(String cityCategory1) {
		this.cityCategory1 = cityCategory1;
	}
	public void setCityCategory2(String cityCategory2) {
		this.cityCategory2 = cityCategory2;
	}
	public void setBuilderZone(String builderZone) {
		this.builderZone = builderZone;
	}
	public void setZrpnoDistrict(String zrpnoDistrict) {
		this.zrpnoDistrict = zrpnoDistrict;
	}
	public void setZrpNoParcel(String zrpNoParcel) {
		this.zrpNoParcel = zrpNoParcel;
	}
	public void setZrpDate(String zrpDate) {
		this.zrpDate = zrpDate;
	}
	public void setSeeZoneCat(String seeZoneCat) {
		this.seeZoneCat = seeZoneCat;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setConstructionBound(String constructionBound) {
		this.constructionBound = constructionBound;
	}
	public void setStructureZone(String structureZone) {
		this.structureZone = structureZone;
	}
	public void setReplUserName(String replUserName) {
		this.replUserName = replUserName;
	}
	public void setPropertyDoc(String propertyDoc) {
		this.propertyDoc = propertyDoc;
	}
	public void setUsesRight(String usesRight) {
		this.usesRight = usesRight;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setErrorData(String errorData) {
		this.errorData = errorData;
	}
	public void setCodeTbo(String codeTbo) {
		this.codeTbo = codeTbo;
	}
	public void setPropgroupTbo(String propgroupTbo) {
		this.propgroupTbo = propgroupTbo;
	}
	public void setPromil(String promil) {
		this.promil = promil;
	}
	public void setDublProperty(String dublProperty) {
		this.dublProperty = dublProperty;
	}
	public void setPropertyUsage(String propertyUsage) {
		this.propertyUsage = propertyUsage;
	}
	public void setSpecifyotherUsage(String specifyotherUsage) {
		this.specifyotherUsage = specifyotherUsage;
	}
	public void setPropertyIdentifier(String propertyIdentifier) {
		this.propertyIdentifier = propertyIdentifier;
	}
	public void setInCharge(String inCharge) {
		this.inCharge = inCharge;
	}
	public void setEdifice(XmlMapperDecl14EdiFice edifice) {
		this.edifice = edifice;
	}
	public void setLand(XmlMapperDecl14Land land) {
		this.land = land;
	}
	public void setPartProperty(XmlMapperDecl14PartProperty partProperty) {
		this.partProperty = partProperty;
	}
	
	
}
