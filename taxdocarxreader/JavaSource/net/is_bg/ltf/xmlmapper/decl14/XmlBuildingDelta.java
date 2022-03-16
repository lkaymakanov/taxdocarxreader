package net.is_bg.ltf.xmlmapper.decl14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XmlBuildingDelta {
	
	public static class XmlBuildingHomeObjectChanges{
		//list with home objects that have modified parts in it 
		//int buildingindex;
		List<XmlMapperDecl14HomeObject> changedParts = new ArrayList<>(); 
		List<XmlMapperDecl14HomeObject> orgParts = new ArrayList<>();
	}
	
	List<XmlMapperDecl14Building> prevbuild = new ArrayList<XmlMapperDecl14Building>();
	List<XmlMapperDecl14Building> thisbuild = new ArrayList<XmlMapperDecl14Building>();
	List<XmlMapperDecl14Building> newBuildings = new ArrayList<>();
	Map<Integer, List<XmlMapperDecl14HomeObject>> newHomeObjInExistingBuildings = new HashMap<>();
	Map<Integer, XmlBuildingHomeObjectChanges> buildingHomesChanges = new HashMap<>();
	
	
	static boolean cmpHomeObjects(XmlMapperDecl14HomeObject ho,  XmlMapperDecl14HomeObject next) {
		List<XmlMapperDecl14HomePart> ho1parts = ho.gethPart().getHomeparts();
		List<XmlMapperDecl14HomePart> ho2parts = next.gethPart().getHomeparts();
		
		Map<String, List<XmlMapperDecl14HomePart>> ho1p = XmlMapperDecl14Manager.groupByPartsBySubjects(ho1parts);
		Map<String, List<XmlMapperDecl14HomePart>> ho2p = XmlMapperDecl14Manager.groupByPartsBySubjects(ho2parts);
		
		//check if one record for each taxsubject
		for( String k: ho1p.keySet()) {
			List<XmlMapperDecl14HomePart> l =  ho1p.get(k);
			if(l.size() > 1) return false;  //;System.out.println("Subject with ein " + k + " is " + l.size() + " times in ho " + getObjectDescription(ho));
		}
		
		for(String k: ho2p.keySet()) {
			List<XmlMapperDecl14HomePart> l =  ho2p.get(k);
			if(l.size() > 1)    return false;//System.out.println("Subject with ein " + k + " is " + l.size() + " times in ho " + getObjectDescription(next) );
		}
		
		//check if subject was removed from parts
		for(String k: ho1p.keySet()) {
			if(!ho2p.containsKey(k))  return false; //{System.out.println("Subject with ein " + k +  " was removed from object " + getObjectDescription(ho));}
		}
		
		//check if subject was added to parts 
		for(String k: ho2p.keySet()){
			if(!ho1p.containsKey(k))     return false;//  {System.out.println("Subject with ein " + k  + "  was added to object " + getObjectDescription(next));}
		}
		
		for( String k: ho1p.keySet()) {
			XmlMapperDecl14HomePart ho1 =  ho1p.get(k).get(0);
			XmlMapperDecl14HomePart ho2 =  ho2p.get(k).get(0);
			
			String s1 = toS(ho1);
			String s2 = toS(ho2);
			//System.out.println("Comparing " + s1 + " to " + s2);
			if(!s1.equals(s2)) return false;
		}
		
		return true;
	}
	
	
	static String toS(XmlMapperDecl14HomePart p) {
		String pStr =  p.getIdn() + ","  + p.getDivident() + "/" + p.getDivisor() + "," + p.getPart();
		//System.out.println(pStr);
		return pStr;
	}
	
	void fill() {
		//get new buildings
		int sm = XmlMapperDecl14Manager.smallerSize(prevbuild, thisbuild);
		for(; sm < thisbuild.size(); sm++) {
			newBuildings.add(thisbuild.get(sm));
		}
		
		//compare  home objects in the same building
		for(int i=0; i< prevbuild.size(); i++) {
			List<XmlMapperDecl14HomeObject> hobprev = XmlMapperDecl14Manager.getHomeObjectsForBuilding(prevbuild.get(i));
			List<XmlMapperDecl14HomeObject> hothisbuild = XmlMapperDecl14Manager.getHomeObjectsForBuilding(thisbuild.get(i));
			
			//same home objects in the same building
			for(int k=0; k<hobprev.size();k++) {
				XmlMapperDecl14HomeObject prev = hobprev.get(k);
				XmlMapperDecl14HomeObject mod = hothisbuild.get(k);
				
				//if false modified parts
				if(!cmpHomeObjects(prev, mod)) {
					if(!buildingHomesChanges.containsKey(i)) buildingHomesChanges.put(i, new XmlBuildingHomeObjectChanges());
					XmlBuildingHomeObjectChanges ch =   buildingHomesChanges.get(i);
					ch.changedParts.add(mod);
					ch.orgParts.add(prev);
				}
			}
			
			//new home objects in same building
			for(int j = hobprev.size(); j < hothisbuild.size();j++) {
				if(!newHomeObjInExistingBuildings.containsKey(i)) newHomeObjInExistingBuildings.put(i, new ArrayList<>());
				newHomeObjInExistingBuildings.get(i).add(hothisbuild.get(j));
			}
			//same buildings
		}
	}
	 
	
}