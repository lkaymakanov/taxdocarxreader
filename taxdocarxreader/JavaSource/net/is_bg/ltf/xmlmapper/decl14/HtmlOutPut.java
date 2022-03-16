package net.is_bg.ltf.xmlmapper.decl14;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import net.is_bg.ltf.xmlmapper.decl14.HtmlOutPut.HtmlElementProp.HtmlElementPropBuilder;
import net.is_bg.ltf.xmlmapper.decl14.XmlBuildingDelta.XmlBuildingHomeObjectChanges;

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
		 P("p"),
		 HEAD("head"),
		 STYLE("style"),
		 BODY("body"),
		 TABLE("table"),
		 HR("hr"),
		 TR("tr"),
		 TD("td"), 
		 SCRIPT("script"), DIV("div");
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
	
	/**
	 * Object to String & then adds it to td cell!
	 * @param o
	 * @return
	 */
	private static String asCell(Object o) {
		if(o == null) o = "";
		StringBuilder res = new StringBuilder();
	    res.append(HTML_KEYWORDS.TD.begin());
		res.append(o.toString());
		res.append(HTML_KEYWORDS.TD.end());
		return res.toString();
	}
	
	
	private static String asDiv(HtmlElementPropBuilder p, Object o) {
		if(o == null) o = "";
		StringBuilder res = new StringBuilder();
	    if(p!=null) res.append(HTML_KEYWORDS.DIV.begin(p.build()));
	    else res.append(HTML_KEYWORDS.DIV.begin());
		res.append(o.toString());
		res.append(HTML_KEYWORDS.DIV.end());
		return res.toString();
	}
	
	
	private static String asDiv(Object o) {
		return asDiv(null, o);
	}
	
	
	
	//greater than zero divider / divident 
	private static String getPartToShow(XmlMapperDecl14HomePart p) {
		if(!"0".equals(p.getDivident())  &&  !"0".equals(p.getDivisor())) 
			return p.getDivident() + "/" + p.getDivisor();// +  "   " +p.getPart() ;
		return    p.getPart();
	}
	
	/**
	 * Used to sort the keys of Maps!
	 * @param s
	 * @return
	 */
	private static <T> Set<T> sortSet(Set<T> s) {
		return new TreeSet<>(s);
	}
	
	private static String asHtmlTable(XmlDelta delta, XmlMapperDecl14 d14) {
		if(delta == null) return "";
		StringBuilder res = new StringBuilder();
		
		HtmlElementPropBuilder b = new HtmlElementPropBuilder();
		//b.setClazz("myclass"); 
		b.setStyle("color:red;");
		
		if(delta.wrongSubjectsSeqno.size() > 0) {
			res.append(HTML_KEYWORDS.H3.begin());
			res.append("Wrong seq No:");
			res.append(HTML_KEYWORDS.H3.end());
			for(Integer k :sortSet(delta.wrongSubjectsSeqno.keySet())) {
				XmlMapperDecl14Owner o = delta.wrongSubjectsSeqno.get(k);
				res.append(HTML_KEYWORDS.P.begin(b.build()));
				res.append(o.getSeqNots() + " " +  o.getIdn() + " " +  o.getName() + "  Expected  ====> " + k );
				res.append(HTML_KEYWORDS.P.end());
			}
		    //res.append(asHtmlTableOwners(delta.wrongSubjectsSeqno));
		}
		
		b.setStyle("color:green;");
		//new owners
		if(delta.newOwners.size() > 0) {
			res.append(HTML_KEYWORDS.H3.begin(b.build()));
			res.append("New owners");
			res.append(HTML_KEYWORDS.H3.end());
		    res.append(asHtmlTableOwners(b,delta.newOwners));
		}
	    
		
		b.setStyle("color:red;");
	    //changed owners
	    if(delta.changeOwners.size() > 0) {
			res.append(HTML_KEYWORDS.H3.begin());
			res.append("Changed owners");
			res.append(HTML_KEYWORDS.H3.end());
		    res.append(asHtmlTableOwners(b,delta.changeOwners));
	    }
	    
	    //changed home objects
	    res.append(asHtmlTable(delta.bDelta.buildingHomesChanges, d14));
	    //res.append("================================================================================");
		return res.toString();
	}
	
	
	private static String asHtmlTable( List<XmlMapperDecl14HomeObject> homeobj, XmlMapperDecl14 d14) {
		return asHtmlTable(null,homeobj, d14);
	}
	
	
	private static String asHtmlTable(HtmlElementPropBuilder bd, List<XmlMapperDecl14HomeObject> homeobj, XmlMapperDecl14 d14) {
		StringBuilder res = new StringBuilder();
		if(bd!=null) res.append(HTML_KEYWORDS.TABLE.begin(bd.build()));
		else res.append(HTML_KEYWORDS.TABLE.begin());
		for(XmlMapperDecl14HomeObject ho:  homeobj) {
		   		 //res.append("<br />");
		   		 //home object info
		   		 res.append(HTML_KEYWORDS.TR.begin());
		   		 res.append(asCell("N  " +  ho.getSeqNoObj()));
		   		 res.append(asCell("   " +  ho.getFunctionho()));
		   		 res.append(asCell("   " +  ho.getKindHomeObj()));
		   		 res.append(HTML_KEYWORDS.TR.end());
		   		 
		   		 //parts 
		   		 List<XmlMapperDecl14HomePart> homeParts =  ho.gethPart().getHomeparts();
		   		 
		   		 res.append(HTML_KEYWORDS.TR.begin());
		   		 res.append(asHtmlTable(homeParts, XmlMapperDecl14Manager.getSubjectsEinSeqnoMap(XmlMapperDecl14Manager.getOwners(d14)))); //as html
		   		 res.append(HTML_KEYWORDS.TR.end());
		   		 
		   		 res.append("-------------------------");
		   		 res.append("<br />");
		   		 //for(XmlMapperDecl14HomePart part :  homeParts) {
		   			  //List<XmlMapperDecl14OwnerHomePart> ownerHomeParst =  part.getPartHomeUsers().getOwnerHomePart();
		   		 //}
		 }
		res.append(HTML_KEYWORDS.TABLE.end());
		res.append("-------------------------------------------------------");
		return res.toString();
	}
	
	/***
	 * Changed homeObjects to HtmlTable
	 * @param bDelta
	 * @param d14
	 * @return
	 */
	private static String asHtmlTable(Map<Integer, XmlBuildingHomeObjectChanges> bDelta, XmlMapperDecl14 d14) {
		StringBuilder res = new StringBuilder();
		//HtmlElementPropBuilder bd = new HtmlElementPropBuilder();
		//bd.setStyle("color:red; border:solid;");
		
		HtmlElementPropBuilder displayInline = new HtmlElementPropBuilder();
		displayInline.setStyle("float:left; padding-right:150px;");
		if(bDelta.size() > 0) {
		    	for(Integer k : sortSet(bDelta.keySet())) {
		    		res.append(HTML_KEYWORDS.H3.begin());
					res.append("Changed HomeObjects in building N:" + (k+1));
					res.append(HTML_KEYWORDS.H3.end());
					
					List<XmlMapperDecl14HomeObject>  homeobjOrg = bDelta.get(k).orgParts; //original home objects 
					List<XmlMapperDecl14HomeObject>  homeobj = bDelta.get(k).changedParts; //modified Objects
					
					//print home objects & parts
					String orgTbl = asHtmlTable(homeobjOrg, d14);
					String modTbl =  asHtmlTable(homeobj, d14) ;
					
					res.append(asDiv(displayInline, orgTbl));
					res.append(asDiv(modTbl));
		    	}
		}
		String r = res.toString();
		//System.out.println(r);
		return r;
	}
	
	/**
	 * Create Html table for building!!
	 * @param bb
	 * @param d14
	 * @return
	 */
	private static String asHtmlTable(XmlMapperDecl14Building bb, XmlMapperDecl14 d14) {
		StringBuilder res = new StringBuilder();
		res.append(HTML_KEYWORDS.TABLE.begin());
    	res.append(HTML_KEYWORDS.TR.begin());
		res.append(asCell("Building N: " + bb.getSeqBuilding()));
		res.append(asCell("Kind function: " + bb.getKindFunction()));
		res.append(asCell("Floor: " + bb.getFloorNumber()));
		res.append(HTML_KEYWORDS.TR.end());
    	
    	//home objects & parts in home obj
		res.append(asHtmlTable(bb.getHomes().getHomeObjects(), d14));
    	res.append(HTML_KEYWORDS.TABLE.end());
    	return res.toString();
	}
	
	/***
	 * Current history & the delta with previuos history!!!
	 * @param d14
	 * @param delta
	 * @param index
	 * @return
	 */
	static String asHtmlTable(XmlMapperDecl14 d14, XmlDelta delta, int index) {
		HtmlElementPropBuilder b = new HtmlElementPropBuilder();
		b.setClazz("myclass"); b.setStyle("color:green;");
		
		StringBuilder res = new StringBuilder();
		res.append(HTML_KEYWORDS.H2.begin(b.build()));
		res.append("HISTORY N " + (index+1) + " from " + d14.getDocDate());
		res.append(HTML_KEYWORDS.H2.end());
		res.append(HTML_KEYWORDS.TABLE.begin());
		
		b.setStyle("");
		
		//if delta is null print only delta................... & return immediately
		if(delta!=null) {
			//print delta to html output
			res.append(asHtmlTable(delta, d14));
			if(d14.getAdditionalNote()!=null) {
				res.append(HTML_KEYWORDS.H1.begin());
				res.append("Note:<br/>");
				res.append(d14.getAdditionalNote());
				res.append(HTML_KEYWORDS.H1.end());
			}
			return res.toString() ;
		}
		
		XmlMapperDecl14Property property =   d14.getProperty();
		XmlMapperDecl14EdiFice edifice =  property.getEdifice();
		//XmlMapperDecl14PartProperty partProperty =  property.getPartProperty();
		
		
		//========= owners to html ==============
		res.append(HTML_KEYWORDS.TR.begin());
		res.append(asHtmlTableOwners(b, XmlMapperDecl14Manager.getOwners(d14)));
		res.append(HTML_KEYWORDS.TR.end());
		
		res.append(HTML_KEYWORDS.HR.begin());
		
	    List<XmlMapperDecl14Building> buildings =	edifice.buildings;
	    
	    //=============== buildings  to html============================
	    for(XmlMapperDecl14Building bb :buildings) {
	    	String bhtml =  asHtmlTable(bb, d14);
	    	res.append(bhtml);
	    }
		
		res.append(HTML_KEYWORDS.TABLE.end());
		
		if(d14.getAdditionalNote()!=null) {
			res.append(HTML_KEYWORDS.H2.begin());
			res.append("Note:<br/>");
			res.append(d14.getAdditionalNote());
			res.append(HTML_KEYWORDS.H2.end());
		}
		
		res.append(HTML_KEYWORDS.H4.begin());
		res.append(HTML_KEYWORDS.H4.end());
		return res.toString();
	}
	
	
	private static String asHtmlTableOwners(HtmlElementPropBuilder b, List<XmlMapperDecl14Owner> owners) {
		//HtmlElementPropBuilder b = new HtmlElementPropBuilder();
		//b.setClazz("myclass"); b.setStyle("mystyle");
		
		StringBuilder res = new StringBuilder();
		res.append(HTML_KEYWORDS.TABLE.begin(b.build()));
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
	
	//parts to html table
	private static String asHtmlTable(List<XmlMapperDecl14HomePart> parts, Map<String, List<XmlMapperDecl14Owner>> ownersByIdn) {
		
		StringBuilder res = new StringBuilder();
		res.append(HTML_KEYWORDS.TABLE.begin());

		//rows for parts
		for(XmlMapperDecl14HomePart p:parts) {
			res.append(HTML_KEYWORDS.TR.begin());
			XmlMapperTaxSubject ts =  p.getSubject();
			res.append(asCell(ownersByIdn.get(p.getSubject().getIdn()).get(0).getSeqNots()));
			res.append(asCell(ts.getIdn()));
			res.append(asCell(ts.getSubjectName()));
			res.append(asCell(getPartToShow(p)));
			res.append(HTML_KEYWORDS.TR.end());
		}
		res.append(HTML_KEYWORDS.TABLE.end());
		return res.toString();
	}

}
