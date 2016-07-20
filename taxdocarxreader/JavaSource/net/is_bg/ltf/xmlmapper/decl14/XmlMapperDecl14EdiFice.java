package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14EdiFice {
	List<XmlMapperDecl14Building> buildings;

	
	@XmlElement(name="BUILDING")
	public List<XmlMapperDecl14Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<XmlMapperDecl14Building> buildings) {
		this.buildings = buildings;
	}
}
