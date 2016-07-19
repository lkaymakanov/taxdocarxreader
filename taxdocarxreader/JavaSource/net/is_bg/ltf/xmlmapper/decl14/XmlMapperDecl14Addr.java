package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14Addr {
	
	private String country;    //COUNTRY
	private String province;   //PROVINCE
	private String municipality;  //MUNICIPALITY
	private String postCode;    //POSTCODE
	private String city;        //CITY
	private String street;    //STREET
	private String nomer;  //NOMER
	private String block;  // BLOK
	private String entry;  //VXOD
	private String floor;  //ETAJ
	private String apart;  //APRT
	
	@XmlElement(name="COUNTRY")
	public String getCountry() {
		return country;
	}
	@XmlElement(name="PROVINCE")
	public String getProvince() {
		return province;
	}
	@XmlElement(name="MUNICIPALITY")
	public String getMunicipality() {
		return municipality;
	}
	@XmlElement(name="POSTCODE")
	public String getPostCode() {
		return postCode;
	}
	@XmlElement(name="CITY")
	public String getCity() {
		return city;
	}
	@XmlElement(name="STREET")
	public String getStreet() {
		return street;
	}
	@XmlElement(name="NOMER")
	public String getNomer() {
		return nomer;
	}
	@XmlElement(name="BLOK")
	public String getBlock() {
		return block;
	}
	@XmlElement(name="VXOD")
	public String getEntry() {
		return entry;
	}
	@XmlElement(name="ETAJ")
	public String getFloor() {
		return floor;
	}
	@XmlElement(name="APRT")
	public String getApart() {
		return apart;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setNomer(String nomer) {
		this.nomer = nomer;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public void setApart(String apart) {
		this.apart = apart;
	}
	
}
