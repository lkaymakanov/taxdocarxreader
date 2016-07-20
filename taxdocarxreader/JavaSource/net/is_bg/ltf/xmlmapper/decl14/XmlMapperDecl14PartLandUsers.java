package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14PartLandUsers {

	private List<XmlMapperDecl14PartLandUser>  ownerLandPart; //OWNERLANDPART

	@XmlElement(name="OWNERLANDPART")
	public List<XmlMapperDecl14PartLandUser> getOwnerLandPart() {
		return ownerLandPart;
	}

	public void setOwnerLandPart(List<XmlMapperDecl14PartLandUser> ownerLandPart) {
		this.ownerLandPart = ownerLandPart;
	}
	
	
}
