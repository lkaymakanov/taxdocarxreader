package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14HParts {


	private List<XmlMapperDecl14HomePart> homeparts;  //HOME_PART

	@XmlElement(name="HOME_PART")
	public List<XmlMapperDecl14HomePart> getHomeparts() {
		return homeparts;
	}

	public void setHomeparts(List<XmlMapperDecl14HomePart> homeparts) {
		this.homeparts = homeparts;
	}
	
	
}
