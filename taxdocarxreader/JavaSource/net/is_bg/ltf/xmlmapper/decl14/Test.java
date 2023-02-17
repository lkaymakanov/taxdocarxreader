package net.is_bg.ltf.xmlmapper.decl14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import net.is_bg.ltf.db.common.DBConfig;

public class Test {
	
	

	
	private static void saveToFile(long taxdocId) throws UnsupportedEncodingException, IOException, ClassNotFoundException, JAXBException {
		//774685
		//761270
		long taxdocArxId =  -1; //1320454;
		List<String> xml = new Dao(DBConfig.getConnectionFactory()).getXmlDocDataStr(taxdocId, taxdocArxId);
		List<XmlMapperDecl14> decl14 = new ArrayList<XmlMapperDecl14>();
		
		String ss = "";
		
		for(String s:xml) {
			XmlMapperDecl14 d14 = XmlSerialize.xmlToObject(s, XmlMapperDecl14.class);
			//dump homeobjects parts for each builldging
			//String bdDump = DumpBuildings.dumpBuildingsHomeObjectParts(d14);
			//System.out.println(bdDump);
			decl14.add(d14);
		}
		//String bdDump = DumpBuildings.dumpBuildingsHomeObjectParts(d14);
		//if(decl14.size() <=0) return;
		
		//compare histories one another.
		ss = XmlMapperDecl14Manager.cmpHistories(decl14);
		
		String partidaNo = decl14.size() == 0 ? "No_partida_for_taxdoc_id" + taxdocId :  decl14.get(0).getPartidano();
		System.out.println(partidaNo);
		//System.out.println("partidano " + decl14.get(0).getPartidano());
		
		//System.out.println(ss);
		FileOutputStream fos= new FileOutputStream(new File(partidaNo+".html"));
		fos.write(ss.getBytes("UTF-8"));
		fos.flush();
		fos.close();
	}
	
	
	/***
	 * Vsi4ki deklaracii po chlen 50
	 * @throws FileNotFoundException
	 */
	private static void extractAllDeclarations50() throws FileNotFoundException {
		Dao dao  = new  Dao(DBConfig.getConnectionFactory());
		for(long tdId : dao.getDecl14_2TaxdocIds()) {
			try {
				saveToFile(tdId);
			}catch (Exception e) {
				PrintStream ps = new PrintStream(new File("excetptionForTd_" +tdId  +".html"));
				e.printStackTrace(ps);
				ps.close();
			}
		}
	}
	
	public static void main(String [] args) throws ClassNotFoundException, JAXBException, UnsupportedEncodingException, IOException{
		DBinit.initByIndex(15);
		saveToFile(843474);
		//saveToFile(842603);
		//761270
		//761272
		//760231
		//774685
		//756458
		//saveToFile(6648031);
		//extractAllDeclarations50();
		//saveToFile(6456411);
		/*
		saveToFile(761270);
		saveToFile(761272);
		saveToFile(760231);
		saveToFile(756458);
		*/
		/***/
		
		
		System.out.println("End....");
	}
}
;