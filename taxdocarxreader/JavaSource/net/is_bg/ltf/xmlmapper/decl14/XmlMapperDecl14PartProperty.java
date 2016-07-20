package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14PartProperty {
	private List<XmlMapperDecl14Owner> owners;   //OWNERS

	@XmlElement(name="OWNERS")
	public List<XmlMapperDecl14Owner> getOwners() {
		return owners;
	}

	public void setOwners(List<XmlMapperDecl14Owner> owners) {
		this.owners = owners;
	}
	
}
