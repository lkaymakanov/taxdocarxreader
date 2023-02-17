package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;

class DumpBuildings {

	/***
	 * Dump the home objects owners in way suitable to insert in db!!!
	 * @param bb
	 * @param d14
	 * @return
	 */
	static String dumpBuildingsHomeObjectParts(XmlMapperDecl14 d14) {
		List<XmlMapperDecl14Building> buildings = d14.getProperty().getEdifice().getBuildings();
		StringBuilder bd = new StringBuilder();
		String line = "";
		for(XmlMapperDecl14Building bb: buildings) {
			for(XmlMapperDecl14HomeObject ho:  bb.getHomes().getHomeObjects()) {
				 line = bb.getSeqBuilding() +  "," + ho.getSeqNoObj();
				 //parts 
				 List<XmlMapperDecl14HomePart> homeParts =  ho.gethPart().getHomeparts();
				 
				 //loop through parts
				 for(XmlMapperDecl14HomePart p : homeParts) {
					 line = bb.getSeqBuilding() +  "," + ho.getSeqNoObj();
					 if(!isValid(p)) continue;
					 line = line + ", "+ ("'"+p.getIdn() + "', " + p.getDivident() + "," +p.getDivisor() + "," + p.getPart()); 
					 bd.append("("+line+")");
					 bd.append(",\n");
				 }
				 
			}
		}
		return bd.toString();
	}
	
	
	private static boolean isValid(XmlMapperDecl14HomePart p) {
		if(!"0".equals(p.getDivident())  &&  !"0".equals(p.getDivisor())) return true;
		return  !p.getPart().equals("0");
	}
	
}
