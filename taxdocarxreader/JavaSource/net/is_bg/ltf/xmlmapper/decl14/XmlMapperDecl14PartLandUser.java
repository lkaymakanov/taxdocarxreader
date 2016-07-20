package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14PartLandUser {

	/***
	 *  select xmlelement(name  "OWNERLANDPART",
xmlattributes(pl.seqnots::integer as "PHN"),
                xmlforest(l.ownerpartland_id  as "OWNERPARTLAND_ID",  
                l.divident::integer  as  "DIVIDENT",
                l.divisor::integer  as "DIVISOR" ,
                numbertrim(l.part) as  "PART",
                trim(pl.seqnots) as  "OWNERNO" 
                ))
	 */
	
	private String ownerPartLandId; //OWNERPARTLAND_ID
	private Integer divident; //DIVIDENT
	private Integer divisor; //DIVISOR
	private Integer part; //PART
	private String ownerNo;//OWNERNO
	
	@XmlElement(name="OWNERPARTLAND_ID")
	public String getOwnerPartLandId() {
		return ownerPartLandId;
	}
	@XmlElement(name="DIVIDENT")
	public Integer getDivident() {
		return divident;
	}
	@XmlElement(name="DIVISOR")
	public Integer getDivisor() {
		return divisor;
	}
	@XmlElement(name="PART")
	public Integer getPart() {
		return part;
	}
	@XmlElement(name="OWNERNO")
	public String getOwnerNo() {
		return ownerNo;
	}
	public void setOwnerPartLandId(String ownerPartLandId) {
		this.ownerPartLandId = ownerPartLandId;
	}
	public void setDivident(Integer divident) {
		this.divident = divident;
	}
	public void setDivisor(Integer divisor) {
		this.divisor = divisor;
	}
	public void setPart(Integer part) {
		this.part = part;
	}
	public void setOwnerNo(String ownerNo) {
		this.ownerNo = ownerNo;
	}
	
}
