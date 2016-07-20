package net.is_bg.ltf.xmlmapper.decl14;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14Owner {

	/***
select  xmlelement(name "OWNERS",xmlattributes(seqnots  as "PPN"), xmlforest(
seqnots  as "SEQNOTS",
(select ts.idn from taxsubject ts where ts.taxsubject_id = pp.taxsubject_id)  as "IDN",
 (select ts.name from   taxsubject ts where  ts.taxsubject_id = pp.taxsubject_id)  as "NAME",
----xmlstructure.xmladdrnew(post_addr)  as "POST_ADDR",
post_addr   as "POST_ADDR",
telephone  as "TELEPHONE",
--xmlstructure.xmlsubject(pp.taxsubject_id)  as "TAXSUBJECT",
(select d.value from decode d where d.columnname = 'TypeDeclar' and d.code::integer = typedeclar::integer)  as "TYPEDECLAR",
decode(relief_id,NULL,'не','да')  as "TELK",
xmlstructure.xmlrelief(pp.relief_id)  as "RELIEF"
))
	 */
	
	private String seqNots; //SEQNOTS
	private String idn; //IDN
	private String name; //NAME
	private String postAddrees;   //POST_ADDR
	private String telephone;  //TELEPHONE
	private String typeDeclar;  //TYPEDECLAR
	private String telk; //TELK
	private XmlMapperDecl14Relief   relief; //RELIEF
	
	@XmlElement(name="SEQNOTS")
	public String getSeqNots() {
		return seqNots;
	}
	@XmlElement(name="IDN")
	public String getIdn() {
		return idn;
	}
	@XmlElement(name="NAME")
	public String getName() {
		return name;
	}
	@XmlElement(name="POST_ADDR")
	public String getPostAddrees() {
		return postAddrees;
	}
	@XmlElement(name="TELEPHONE")
	public String getTelephone() {
		return telephone;
	}
	@XmlElement(name="TYPEDECLAR")
	public String getTypeDeclar() {
		return typeDeclar;
	}
	@XmlElement(name="TELK")
	public String getTelk() {
		return telk;
	}
	@XmlElement(name="RELIEF")
	public XmlMapperDecl14Relief getRelief() {
		return relief;
	}
	public void setSeqNots(String seqNots) {
		this.seqNots = seqNots;
	}
	public void setIdn(String idn) {
		this.idn = idn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPostAddrees(String postAddrees) {
		this.postAddrees = postAddrees;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setTypeDeclar(String typeDeclar) {
		this.typeDeclar = typeDeclar;
	}
	public void setTelk(String telk) {
		this.telk = telk;
	}
	public void setRelief(XmlMapperDecl14Relief relief) {
		this.relief = relief;
	}
}
