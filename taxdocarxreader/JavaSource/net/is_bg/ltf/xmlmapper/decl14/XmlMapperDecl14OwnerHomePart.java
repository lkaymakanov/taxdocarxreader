package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14OwnerHomePart {
/**
 * select xmlelement(name "OWNERHOMEPART", xmlattributes(ho.seqnots::integer as "PHN"),
                xmlforest(p.ownerparthome_id as  "OWNERPARTHOME_ID",--ownerparthome_id,
                p.divident::integer  as "DIVIDENT" ,--divident,
                p.divisor::integer  as  "DIVISOR",-- divisor,
                numbertrim(p.part) as "PART", --part,
                ho.seqnots as  "OWNERNO"--ownerno
                ))
 */
	private String ownerPartHomeId; //OWNERPARTHOME_ID
	private String divident;   //DIVIDENT
	private String divisor; //DIVISOR
	private String part; //PART
	private String ownerNo; //OWNERNO
	
	@XmlElement(name="OWNERPARTHOME_ID")
	public String getOwnerPartHomeId() {
		return ownerPartHomeId;
	}
	@XmlElement(name="DIVIDENT")
	public String getDivident() {
		return divident;
	}
	@XmlElement(name="DIVISOR")
	public String getDivisor() {
		return divisor;
	}
	@XmlElement(name="PART")
	public String getPart() {
		return part;
	}
	@XmlElement(name="OWNERNO")
	public String getOwnerNo() {
		return ownerNo;
	}
	public void setOwnerPartHomeId(String ownerPartHomeId) {
		this.ownerPartHomeId = ownerPartHomeId;
	}
	public void setDivident(String divident) {
		this.divident = divident;
	}
	public void setDivisor(String divisor) {
		this.divisor = divisor;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public void setOwnerNo(String ownerNo) {
		this.ownerNo = ownerNo;
	}
}
