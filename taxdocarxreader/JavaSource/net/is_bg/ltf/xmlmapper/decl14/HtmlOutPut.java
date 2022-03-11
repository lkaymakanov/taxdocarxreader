package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import net.is_bg.ltf.xmlmapper.decl14.HtmlOutPut.HtmlElementProp.HtmlElementPropBuilder;

class HtmlOutPut {
	
	static class HtmlElementProp{
		private String style;
		private String clazz;
		
		static class HtmlElementPropBuilder{
			private String style;
			private String clazz;
			
			HtmlElementPropBuilder setStyle(String style) {
				this.style = style;
				return this;
			}
			public HtmlElementPropBuilder setClazz(String clazz) {
				this.clazz = clazz;
				return this;
			}
			
			public HtmlElementProp build(){
				HtmlElementProp el =  new HtmlElementProp();
				el.clazz = clazz;
				el.style = style;
				return el;
			}
		}
		
		public String getStyle() {
			return style;
		}
		
		public String getClazz() {
			return clazz;
		}
	}
	
	
	private enum HTML_KEYWORDS {
		 HTML("html"),
		 H1("h1"),
		 H2("h2"),
		 H3("h3"),
		 H4("h4"),
		 HEAD("head"),
		 STYLE("style"),
		 BODY("body"),
		 TABLE("table"),
		 HR("hr"),
		 TR("tr"),
		 TD("td"), 
		 SCRIPT("script");
		 private String word;
		 
		 HTML_KEYWORDS(String key) {
			this.word = key;
		 }
		 
		 public  String begin() {
			 return "<" + word+ ">";
		 }
		 public  String begin(HtmlElementProp p) {
			 String style = " style=\"" + (p.getStyle() != null ? p.getStyle() + "\"" : "\"");
			 String clazzz = " class=\"" + (p.getClazz() != null ? p.getClazz() + "\"" : "\"");
			 return "<" + word+  style +  clazzz + ">";
		 }
		 public String end() {
			 return "</" + word+ ">";
		 }
	}
	
	
	private static String asCell(Object o) {
		if(o == null) o = "";
		StringBuilder res = new StringBuilder();
	    res.append(HTML_KEYWORDS.TD.begin());
		res.append(o.toString());
		res.append(HTML_KEYWORDS.TD.end());
		return res.toString();
	}
	
	private static String getPartToShow(XmlMapperDecl14HomePart p) {
		if(!"0".equals(p.getDivident())  &&  !"0".equals(p.getDivisor())) return p.getDivident() + "/" + p.getDivisor();
		return    p.getPart();
	}
	
	
	static String asHtmlTable(XmlMapperDecl14 d14) {
		HtmlElementPropBuilder b = new HtmlElementPropBuilder();
		b.setClazz("myclass"); b.setStyle("mystyle");
		
		StringBuilder res = new StringBuilder();
		res.append(HTML_KEYWORDS.TABLE.begin());
		
		
		String docDate = d14.getDocDate();
		XmlMapperDecl14Property property =   d14.getProperty();
		XmlMapperDecl14EdiFice edifice =  property.getEdifice();
		XmlMapperDecl14PartProperty partProperty =  property.getPartProperty();
		
		//group by owners an users
		Map<String, List<XmlMapperDecl14Owner>> owners =  partProperty.getOwners().stream().collect(Collectors.groupingBy(XmlMapperDecl14Owner::getTypeDeclar));
		
		//owners to html
		res.append(HTML_KEYWORDS.TR.begin());
		res.append(asHtmlTableOwners(XmlMapperDecl14Manager.getOwners(d14)));
		res.append(HTML_KEYWORDS.TR.end());
		
		res.append(HTML_KEYWORDS.HR.begin());
		
	    List<XmlMapperDecl14Building> buildings =	edifice.buildings;
	    for(XmlMapperDecl14Building bb :buildings) {
	    	
	    	res.append(HTML_KEYWORDS.TABLE.begin());
	    	/*
	    	res.append(HTML_KEYWORDS.TR.begin());
    		res.append(asCell("Seq NO"));
    		res.append(asCell("Year"));
    		res.append(asCell("Floor"));
   		    res.append(HTML_KEYWORDS.TR.end());
	    	*/
	    	res.append(HTML_KEYWORDS.TR.begin());
    		res.append(asCell("Building N: " + bb.getSeqBuilding()));
    		res.append(asCell("Build Year " + bb.getBuildYear()));
    		res.append(asCell("Floor: " + bb.getFloorNumber()));
   		    res.append(HTML_KEYWORDS.TR.end());
	    	
	    	//home objects
	    	List<XmlMapperDecl14HomeObject> homeobj =  bb.getHomes().getHomeObjects();
	    	
	    	for(XmlMapperDecl14HomeObject ho:  homeobj) {
	    		 res.append("<br />");
	    		 //home object info
	    		 res.append(HTML_KEYWORDS.TR.begin());
	    		 res.append(asCell("N " +  ho.getSeqNoObj()));
	    		 res.append(asCell("   " +  ho.getFunctionho()));
	    		 res.append(asCell("    " +  ho.getKindHomeObj()));
	    		 res.append(HTML_KEYWORDS.TR.end());
	    		 
	    		 //parts 
	    		 List<XmlMapperDecl14HomePart> homeParts =  ho.gethPart().getHomeparts();
	    		 
	    		 res.append(HTML_KEYWORDS.TR.begin());
	    		 res.append(asHtmlTable(homeParts)); //as html
	    		 res.append(HTML_KEYWORDS.TR.end());
	    		 
	    		 for(XmlMapperDecl14HomePart part :  homeParts) {
	    			  //List<XmlMapperDecl14OwnerHomePart> ownerHomeParst =  part.getPartHomeUsers().getOwnerHomePart();
	    		 }
	    	}
	    	
	    	res.append(HTML_KEYWORDS.TABLE.end());
	    }
		
		res.append(HTML_KEYWORDS.TABLE.end());
		return res.toString();
	}
	
	
	static String asHtmlTableOwners(List<XmlMapperDecl14Owner> owners) {
		HtmlElementPropBuilder b = new HtmlElementPropBuilder();
		b.setClazz("myclass"); b.setStyle("mystyle");
		
		StringBuilder res = new StringBuilder();
		res.append(HTML_KEYWORDS.TABLE.begin());
		res.append(HTML_KEYWORDS.TR.begin());
		res.append(asCell("seqNo"));
		res.append(asCell("Idn"));
		res.append(asCell("Name"));
		res.append(HTML_KEYWORDS.TR.end());
		
		for(XmlMapperDecl14Owner own:owners) {
			res.append(HTML_KEYWORDS.TR.end());
			res.append(asCell(own.getSeqNots()));
			res.append(asCell(own.getIdn()));
			res.append(asCell(own.getName()));
			res.append(HTML_KEYWORDS.TR.end());
		}
		
		res.append(HTML_KEYWORDS.TABLE.end());
		return res.toString();
	}
	
	static String asHtmlTable(List<XmlMapperDecl14HomePart> parts) {
		HtmlElementPropBuilder b = new HtmlElementPropBuilder();
		b.setClazz("myclass"); b.setStyle("mystyle");
		
		StringBuilder res = new StringBuilder();
		res.append(HTML_KEYWORDS.TABLE.begin());
		//res.append(HTML_KEYWORDS.TR.begin());
		//res.append(asCell("Idn"));
		//res.append(asCell("Name"));
		//res.append(asCell("Part"));
		//res.append(HTML_KEYWORDS.TR.end());
		
		for(XmlMapperDecl14HomePart p:parts) {
			res.append(HTML_KEYWORDS.TR.begin());
			XmlMapperTaxSubject ts =  p.getSubject();
			res.append(asCell(ts.getIdn()));
			res.append(asCell(ts.getSubjectName()));
			res.append(asCell(getPartToShow(p)));
			res.append(HTML_KEYWORDS.TR.end());
		}
		res.append(HTML_KEYWORDS.TABLE.end());
		return res.toString();
	}
	
	

}
