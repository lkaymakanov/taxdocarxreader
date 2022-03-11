package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class XmlMapperDecl14Manager {
	
	
	
	
	//get home objects in building
	static List<XmlMapperDecl14HomeObject> getHomeObjectsForBuilding(XmlMapperDecl14Building b){
		List<XmlMapperDecl14HomeObject> homeobj =  b.getHomes().getHomeObjects();
		return homeobj;
	}
	
	//get buildings in property
	static List<XmlMapperDecl14Building> getBuildings(XmlMapperDecl14Property p) {
		return p.getEdifice().getBuildings();
	}
	
	//get buildings in d14
	static List<XmlMapperDecl14Building> getBuildings(XmlMapperDecl14 d14) {
		return d14.getProperty().getEdifice().getBuildings();
	}

	
	//parts in home object
	static List<XmlMapperDecl14HomePart> getParts(XmlMapperDecl14HomeObject ho){
		return  ho.gethPart().getHomeparts();
	}

	
	
	
	static int smallerSize(List b, List next) {
		int size = b.size() < next.size() ? b.size():next.size();
		return size;
	}
	
	static int cmpSize(List b, List next) {
		if(b.size() == next.size()) return 0;
		if(b.size() < next.size()) return -1;
		return 1;
	}
	
    private static void cmpBuildings(List<XmlMapperDecl14Building> b, List<XmlMapperDecl14Building> next) {
		int size = smallerSize(b, next);
    	for(int i=0; i<size;i++) {
    		cmpBuildings(b.get(i), next.get(i));
    	}
	}
	
	private static void cmpBuildings(XmlMapperDecl14Building b, XmlMapperDecl14Building next) {
     	cmpHomeObjects(getHomeObjectsForBuilding(b), getHomeObjectsForBuilding(next));
	}
	
	static void cmpHistories(List<XmlMapperDecl14> h) {
		for(int i =0; i < h.size()-1; i++) {
			cmpHistories(h.get(i), h.get(i+1));
		}
	}
	
	static void cmpHistories(XmlMapperDecl14 h, XmlMapperDecl14 next) {
		List<XmlMapperDecl14Owner>  owners =  getOwners(h);
		List<XmlMapperDecl14Owner>  ownersNext =  getOwners(next);
		
		//check if owners size changed......
		if(owners.size() != ownersNext.size()) {
	     	System.out.println("Owners changed from " + owners.size() + " to " + ownersNext.size());
		}
	}
	
    static void cmpHomeObjects(List<XmlMapperDecl14HomeObject> ho,  List<XmlMapperDecl14HomeObject> next) {
    	int size = smallerSize(ho, next);
    	for(int i=0; i<size;i++) {
    		cmpHomeObjects(ho.get(i), next.get(i));
    	}
	}
	
    static String getObjectDescription(XmlMapperDecl14HomeObject next) {
    	return   next.getSeqNoObj() +   ":" + next.getFunctionho();
    }
    
    //compare home objects 
	static void cmpHomeObjects(XmlMapperDecl14HomeObject ho,  XmlMapperDecl14HomeObject next) {
		List<XmlMapperDecl14HomePart> ho1parts = ho.gethPart().getHomeparts();
		List<XmlMapperDecl14HomePart> ho2parts = next.gethPart().getHomeparts();
		
		Map<String, List<XmlMapperDecl14HomePart>> ho1p = groupByPartsBySubjects(ho1parts);
		Map<String, List<XmlMapperDecl14HomePart>> ho2p =  groupByPartsBySubjects(ho2parts);
		
		//check if one record for each taxsubject
		for( String k: ho1p.keySet()) {
			List<XmlMapperDecl14HomePart> l =  ho1p.get(k);
			if(l.size() > 1) System.out.println("Subject with ein " + k + " is " + l.size() + " times in ho " + getObjectDescription(ho));
		}
		
		for(String k: ho2p.keySet()) {
			List<XmlMapperDecl14HomePart> l =  ho2p.get(k);
			if(l.size() > 1) System.out.println("Subject with ein " + k + " is " + l.size() + " times in ho " + getObjectDescription(next) );
		}
		
		//check if subject was removed from parts
		for(String k: ho1p.keySet()) {
			if(!ho2p.containsKey(k)) {System.out.println("Subject with ein " + k +  " was removed from object " + getObjectDescription(ho));}
		}
		
		//check if subject was added to parts 
		for(String k: ho2p.keySet()){
			if(!ho1p.containsKey(k)) {System.out.println("Subject with ein " + k  + "  was added to object " + getObjectDescription(next));}
		}
		
		
	}
	
	//group by owners and users
	static Map <String, List<XmlMapperDecl14Owner>> getOwnersUsersProperty(XmlMapperDecl14 d){
		Map<String, List<XmlMapperDecl14Owner>> owners =  d.getProperty().getPartProperty().getOwners().stream().collect(Collectors.groupingBy(XmlMapperDecl14Owner::getTypeDeclar));
		return owners;
	}
	
	//get owners
	static List<XmlMapperDecl14Owner>  getOwners(XmlMapperDecl14 d){
		return getOwnersUsersProperty(d).get("собственик");
	}
	
	//get owners or users
	static List<XmlMapperDecl14Owner>  getOwners(XmlMapperDecl14 d, String key){
		return getOwnersUsersProperty(d).get(key);
	}
	
	//groupirane po 
	static Map<String, List<XmlMapperDecl14HomePart>> groupByPartsBySubjects(List<XmlMapperDecl14HomePart>  p){
		return  p.stream().collect(Collectors.groupingBy(XmlMapperDecl14HomePart::getIdn));
	}
	
/*	static List<XmlMapperDecl14HomePart>> groupByPartsBySubjects(List<XmlMapperDecl14HomePart>  p){
		return  p.stream().collect(Collectors.groupingBy(XmlMapperDecl14HomePart::getIdn));
	}*/
	
	static void cmpParts(XmlMapperDecl14HomePart p, XmlMapperDecl14HomePart next) {
		
	}
	
	
	
	
	
	
	static void manage(XmlMapperDecl14 d14) {
		String docDate = d14.getDocDate();
		XmlMapperDecl14Property property =   d14.getProperty();
		XmlMapperDecl14EdiFice edifice =  property.getEdifice();
		XmlMapperDecl14PartProperty partProperty =  property.getPartProperty();
		
		//group by owners an users
		Map<String, List<XmlMapperDecl14Owner>> owners =  partProperty.getOwners().stream().collect(Collectors.groupingBy(XmlMapperDecl14Owner::getTypeDeclar));
		
	    List<XmlMapperDecl14Building> buildings =	edifice.buildings;
	    for(XmlMapperDecl14Building b :buildings) {
	    	
	    	//home objects
	    	List<XmlMapperDecl14HomeObject> homeobj =  b.getHomes().getHomeObjects();
	    	
	    	for(XmlMapperDecl14HomeObject ho:  homeobj) {
	    		 
	    	     //parts 
	    		 List<XmlMapperDecl14HomePart> homeParts =  ho.gethPart().getHomeparts();
	    		 for(XmlMapperDecl14HomePart part :  homeParts) {
	    			 
	    			  //List<XmlMapperDecl14OwnerHomePart> ownerHomeParst =  part.getPartHomeUsers().getOwnerHomePart();
	    		 }
	    	}
	    }
	}
	
}
