package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14PartLands {

	private List<XmlMapperDecl14PartLand>    landparts;  //LANDPART

	@XmlElement(name="LANDPART")
	public List<XmlMapperDecl14PartLand> getLandparts() {
		return landparts;
	}

	public void setLandparts(List<XmlMapperDecl14PartLand> landparts) {
		this.landparts = landparts;
	}
	
	
}
