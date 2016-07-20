package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14FirmLand {
/**
 *   o.kindobj as "KINDOBJ",
           o.seqnoobject as "SEQNOOBJECT",
           o.typeprop as "TYPEPROP",
           (select d.value
            from decode d
            where d.columnname = 'KindOwner'
            and d.code::integer = o.kindowner::integer) as "KINDOWNER",
           o.function as "FUNCTION",
           freereason(o.taxfreereason) as "TAXFREEREASON",
           numbertrim(o.accvalue) as "ACCVALUE"
 */
	
	private String kindObj; //KINDOBJ
	private String seqNoObj; //SEQNOOBJECT
	private String typeProp; //TYPEPROP
	private String kindOwner; //KINDOWNER
	private String function; //FUNCTION
	private String taxFreeReason; //TAXFREEREASON
	private String accValue; //ACCVALUE
	
	@XmlElement(name="KINDOBJ")
	public String getKindObj() {
		return kindObj;
	}
	@XmlElement(name="SEQNOOBJECT")
	public String getSeqNoObj() {
		return seqNoObj;
	}
	@XmlElement(name="TYPEPROP")
	public String getTypeProp() {
		return typeProp;
	}
	@XmlElement(name="KINDOWNER")
	public String getKindOwner() {
		return kindOwner;
	}
	@XmlElement(name="FUNCTION")
	public String getFunction() {
		return function;
	}
	@XmlElement(name="TAXFREEREASON")
	public String getTaxFreeReason() {
		return taxFreeReason;
	}
	@XmlElement(name="ACCVALUE")
	public String getAccValue() {
		return accValue;
	}
	public void setKindObj(String kindObj) {
		this.kindObj = kindObj;
	}
	public void setSeqNoObj(String seqNoObj) {
		this.seqNoObj = seqNoObj;
	}
	public void setTypeProp(String typeProp) {
		this.typeProp = typeProp;
	}
	public void setKindOwner(String kindOwner) {
		this.kindOwner = kindOwner;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public void setTaxFreeReason(String taxFreeReason) {
		this.taxFreeReason = taxFreeReason;
	}
	public void setAccValue(String accValue) {
		this.accValue = accValue;
	}
}
