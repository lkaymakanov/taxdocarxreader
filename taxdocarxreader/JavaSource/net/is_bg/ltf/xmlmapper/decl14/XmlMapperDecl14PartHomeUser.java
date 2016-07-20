package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class XmlMapperDecl14PartHomeUser {

	private List<XmlMapperDecl14OwnerHomePart>  ownerHomePart;  //OWNERHOMEPART

	@XmlElement(name="OWNERHOMEPART")
	public List<XmlMapperDecl14OwnerHomePart> getOwnerHomePart() {
		return ownerHomePart;
	}

	public void setOwnerHomePart(List<XmlMapperDecl14OwnerHomePart> ownerHomePart) {
		this.ownerHomePart = ownerHomePart;
	}
	
}
