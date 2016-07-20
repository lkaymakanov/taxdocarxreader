package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14Homes {
	private List<XmlMapperDecl14HomeObject> homeObjects;   //HOME_OBJ

	@XmlElement(name="HOME_OBJ")
	public List<XmlMapperDecl14HomeObject> getHomeObjects() {
		return homeObjects;
	}

	public void setHomeObjects(List<XmlMapperDecl14HomeObject> homeObjects) {
		this.homeObjects = homeObjects;
	}
}
