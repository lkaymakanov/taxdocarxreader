package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14TaxObject {
	private String municipality; //MUNICIPALITY
	private String taxObjectNo;  //TAXOBJECTNO
	private String prevOwner;   //PREVOWNER
	private String kindTaxObject; //KINDTAXOBJECT
	private String kindProperty;   //KINDPROPERTY
	private String kadastarNo;     //KADASTRNO
	
	@XmlElement(name="MUNICIPALITY")
	public String getMunicipality() {
		return municipality;
	}
	@XmlElement(name="TAXOBJECTNO")
	public String getTaxObjectNo() {
		return taxObjectNo;
	}
	@XmlElement(name="PREVOWNER")
	public String getPrevOwner() {
		return prevOwner;
	}
	@XmlElement(name="KINDTAXOBJECT")
	public String getKindTaxObject() {
		return kindTaxObject;
	}
	@XmlElement(name="KINDPROPERTY")
	public String getKindProperty() {
		return kindProperty;
	}
	@XmlElement(name="KADASTRNO")
	public String getKadastarNo() {
		return kadastarNo;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public void setTaxObjectNo(String taxObjectNo) {
		this.taxObjectNo = taxObjectNo;
	}
	public void setPrevOwner(String prevOwner) {
		this.prevOwner = prevOwner;
	}
	public void setKindTaxObject(String kindTaxObject) {
		this.kindTaxObject = kindTaxObject;
	}
	public void setKindProperty(String kindProperty) {
		this.kindProperty = kindProperty;
	}
	public void setKadastarNo(String kadastarNo) {
		this.kadastarNo = kadastarNo;
	}
}
