package net.is_bg.ltf.xmlmapper.decl14;

/***
 * <FIRMPROPNO>72031501</FIRMPROPNO>
<KINDPROPERTY>fwerfwerf</KINDPROPERTY>
<LOCATIONPROPERTY>2203</LOCATIONPROPERTY>
<LOCATION_MUNICIPALITY>fwerf</LOCATION_MUNICIPALITY>
+<PROPERTY_ADDRESS>
<EARNWAY>ferf</EARNWAY>
<PROPERTYDOC>ferfwef</PROPERTYDOC>
<PROPERTYDOCNO>fwerfgwer</PROPERTYDOCNO>
<PROPERTYDOC_DATE>22.01.2004</PROPERTYDOC_DATE>
<OLDPROPERTYNOTE> * </OLDPROPERTYNOTE>
<ZRPNO_DISTRICT>219</ZRPNO_DISTRICT>
<ZRPNO_PARCEL>5-16</ZRPNO_PARCEL>
<STATUS> ÎÊ</STATUS>
<TAXPROPERTY>0</TAXPROPERTY>
<ISFALSE_TAXPROPERTY>0</ISFALSE_TAXPROPERTY>
<TAXPROP_DECL>180.97</TAXPROP_DECL>
<TAXPROP_CALC>180.97</TAXPROP_CALC>
<ISFALSE_TAXPROP>0</ISFALSE_TAXPROP>
<TAXGARB_DECL>666.58</TAXGARB_DECL>
<TAXGARB_CALC>666.58</TAXGARB_CALC>
<ISFALSE_TAXGARB>0</ISFALSE_TAXGARB>
<USER_ID>2</USER_ID>
<USER_DATE>17.03.2011</USER_DATE>
<ISHOME>0</ISHOME>
+<TAXOBJECT>
+<FIRMOBJNODE>
 * @author lubo
 *
 */
public class XmlDecl14Property {
	
	

	private String firmPropNo;
	private String kindPorperty;
	private String locationProperty;
	private String locationMunicipality;
	private String earnWay;
	private String propertyDoc;
	private String propertyDocNo;
	private String propertyDocDate;
	private String oldPropertyNote;
	private String zrpNoDisctrict;
	private String zrpNoparcels;
	private String status;
	private String taxproperty;
	private String isFalseTaxProperty;
	private String taxPropDecl;
	private String taxPropCalc;
	private String isFalseTaxProp;
	private String taxGarbDecl;
	private String taxGarbCalc;
	private String isFalseTaxGarb;
	private String userId;
	private String userDate;
	
	private XmlMapperDecl14Address propertyAddress;
	private XmlMapperDecl14TaxObject taxobject;
	private XmlMapperDecl14FirmObjNode   firmobjNode;
	
	
	
}
