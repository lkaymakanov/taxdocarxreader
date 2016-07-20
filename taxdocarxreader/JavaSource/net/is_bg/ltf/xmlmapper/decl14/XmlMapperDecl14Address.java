package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14Address {
	
	/** select xmlforest(c.name as "COUNTRY", m.name as "MUNICIPALITY",
			  -- decode(ci.kind_city,to_char(0),' ', to_char(1),'гр.', to_char(2),'с.', to_char(3),'м.', to_char(4),'кв.', '---' ) || ci.name as "CITY",
			  (case
			  		when ci.kind_city='0' then ' '
			        when ci.kind_city='1' then 'гр.'
			        when ci.kind_city='2' then 'с.'
			        when ci.kind_city='3' then 'м.'
			        when ci.kind_city='4' then 'кв.'
			        else '---'
			    end) || ci.name as "CITY",
			    -------------------------------------------
			  -- nvl(decode(s.kind_street, to_char(0), ' ',   to_char(1), 'ул.',   to_char(2), 'бул.',   to_char(3), 'пл.',   to_char(4),'ж.р.',   to_char(5), 'ж.к.',  to_char(6),'ж.кв.',  to_char(7),'кв.','---') || s.name , a.street_name) as "STREET",
			  (case
			  		when s.kind_street='0' then ' '
			        when s.kind_street='1' then 'ул.'
			        when s.kind_street='2' then 'бул.'
			        when s.kind_street='3' then 'пл.'
			        when s.kind_street='4' then 'ж.р.'
			        when s.kind_street='5' then 'ж.к.'
			        when s.kind_street='6' then 'ж.кв.'
			        when s.kind_street='7' then 'кв.'
			        else '---'
			    end) || s.name  as "STREET",
			    --COMMENT nvl  decode - nikoga njama da se izpylni
			    -------------------------------------------
			  a.nom as "NOM", a.block as "BLOCK", a.entry as "ENTRY",
			  a.floor as "FLOOR", a.apartment as "APARTMENT",null as "POSTCODE",
			  a.mailbox as "MAILBOX", a.note as "ADDRNOTE") into addr*/
	
	private String country;    //COUNTRY
	private String province;   //PROVINCE
	private String municipality;  //MUNICIPALITY
	private String postCode;    //POSTCODE
	private String city;        //CITY
	private String street;    //STREET
	private String nomer;  //NOM
	private String block;  // BLOCK
	private String entry;  //ENTRY
	private String floor;  //FLOOR
	private String apart;  //APARTMENT
	private String mailBox; //MAILBOX
	private String addrNote;  //ADDRNOTE
	
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
	@XmlElement(name="NOM")
	public String getNomer() {
		return nomer;
	}
	@XmlElement(name="BLOCK")
	public String getBlock() {
		return block;
	}
	@XmlElement(name="ENTRY")
	public String getEntry() {
		return entry;
	}
	@XmlElement(name="FLOOR")
	public String getFloor() {
		return floor;
	}
	@XmlElement(name="APARTMENT")
	public String getApart() {
		return apart;
	}
	
	@XmlElement(name="MAILBOX")
	public String getMailBox() {
		return mailBox;
	}
	@XmlElement(name="ADDRNOTE")
	public String getAddrNote() {
		return addrNote;
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
	public void setMailBox(String mailBox) {
		this.mailBox = mailBox;
	}
	public void setAddrNote(String addrNote) {
		this.addrNote = addrNote;
	}
}
