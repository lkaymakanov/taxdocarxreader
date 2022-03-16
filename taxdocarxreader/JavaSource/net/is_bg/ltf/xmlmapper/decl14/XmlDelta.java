package net.is_bg.ltf.xmlmapper.decl14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class XmlDelta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8358178555626188741L;
	List<XmlMapperDecl14Owner> newOwners = new ArrayList<XmlMapperDecl14Owner>();
	List<XmlMapperDecl14HomeObject> newHobj = new ArrayList<XmlMapperDecl14HomeObject>();
	List<XmlMapperDecl14Owner>  changeOwners = new ArrayList<XmlMapperDecl14Owner>();
	Map<Integer, XmlMapperDecl14Owner> wrongSubjectsSeqno = new HashMap<>();
	XmlBuildingDelta bDelta = new XmlBuildingDelta();
}
