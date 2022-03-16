package net.is_bg.ltf.xmlmapper.decl14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import net.is_bg.ltf.db.common.ConnectionProperties;
import net.is_bg.ltf.db.common.DBConfig;
import net.is_bg.ltf.db.common.impl.DataSourceConnectionFactoryDrManager;
import net.is_bg.ltf.db.common.impl.logging.LogFactorySystemOut;
import net.is_bg.ltf.db.common.impl.timer.ElapsedTimer;
import net.is_bg.ltf.db.common.impl.visit.VisitEmpty;
import net.is_bg.ltf.db.common.interfaces.IConnectionFactoryX;
import net.is_bg.ltf.db.common.interfaces.timer.IElaplsedTimer;
import net.is_bg.ltf.db.common.interfaces.timer.IElaplsedTimerFactory;
import net.is_bg.ltf.db.common.interfaces.visit.IVisit;
import net.is_bg.ltf.db.common.interfaces.visit.IVisitFactory;

class Test {
	
	/** drivers. */
	private final static String ORCL_DRIVER = "oracle.jdbc.OracleDriver"; 
	
	/** The Constant PGR_DRIVER. */
	private final static String PGR_DRIVER = "org.postgresql.Driver"; 
	
	/** The Constant PGR_DRIVER_DIGEST. */
	private final static String PGR_DRIVER_DIGEST = "com.is.util.db.driver.digestdriver.DigestDriver";
	
	/** data bases url's. */
	public final static String URL_PGR_BRC = "digest:jdbc:postgresql://10.240.110.120:5432/brc";
	
	/** The Constant URL_PGR_MDT. */
	public final static String URL_PGR_MDT = "digest:jdbc:postgresql://10.240.44.129:5432/mdt";
	
	/** The Constant URL_ORC_SF_129. */
	public final static String URL_ORC_SF_129 = "jdbc:oracle:thin:@10.240.44.129:1521:ORCL";
	
	/** The Constant URL_ORC_SF_146. */
	public final static String URL_ORC_SF_146 = "jdbc:oracle:thin:@10.240.44.146:1521:orcl";
	
	/** The Constant URL_LOCAL. */
	public final static String URL_LOCAL = "jdbc:oracle:thin:@localhost:5432:ltf";
	
	/** УРЛ. */
	public final static String URL_PGR_149 = /*digest:*/ "jdbc:postgresql://10.240.44.149:5432/bnk11";
	
	/** The Constant URL_PGR_LOCLHOST. */
	public final static String URL_PGR_LOCLHOST = "jdbc:postgresql://localhost:5432/pdv";
	
	/** The Constant URL_PGR_PDV_7. */
	public final static String URL_PGR_PDV_7 = "digestdebug:jdbc:postgresql://10.240.110.7:5432/pdv";
	
	
	public final static String URL_SOFIA_MERGE3 = "jdbc:postgresql://10.240.44.184:5432/sofiamerge3";
	
	
	
	public static  ConnectionProperties [] dBases = {
			new ConnectionProperties(ORCL_DRIVER, URL_ORC_SF_129, "brc", "brc", "orlc_brc_129"),  //0
			new ConnectionProperties(ORCL_DRIVER, URL_ORC_SF_129, "krp", "krp", "orlc_krp_129"),  //1
			new ConnectionProperties(ORCL_DRIVER, URL_ORC_SF_146, "brc", "brc", "orlc_brc_146"),  //2
			new ConnectionProperties(ORCL_DRIVER, URL_ORC_SF_146, "sdk", "sdk", "orlc_sdk_146"),  //3
			new ConnectionProperties(PGR_DRIVER, URL_PGR_BRC, "mdt", "mdt", "pgr_brc_129"),       //4
			new ConnectionProperties(ORCL_DRIVER, URL_LOCAL, "brc", "brc", "pgr_brc_129") ,       //5
			new ConnectionProperties(ORCL_DRIVER, URL_PGR_MDT, "mdt", "mdt", "pgr_mdt_129"),      //6
			
			new ConnectionProperties(PGR_DRIVER_DIGEST, URL_PGR_149, "bnk", "Bnk12345", "pgr_bnk_149") , //7  bankq 149 postgre
			new ConnectionProperties(PGR_DRIVER, URL_PGR_LOCLHOST, "pdv1", "pdv1", "localhost_pgr"),  //8   postgre  localhost
			new ConnectionProperties(PGR_DRIVER_DIGEST, URL_LOCAL, "pdv1", "pdv1", "pdv10.240.110.7") , //9   postgre  localhost
			
			new ConnectionProperties(PGR_DRIVER, URL_SOFIA_MERGE3, "sofiamerge3", "12345", "sofiamerge3"),  //10
			new ConnectionProperties(PGR_DRIVER,"jdbc:postgresql://192.168.50.33:5432/pdv_test", "pdv", "pdv", ""),  //11
			new ConnectionProperties(PGR_DRIVER,"jdbc:postgresql://10.240.44.244:5433/burgas", "prod", "12345", "")  //12
	};
	
	public static class CF extends  DataSourceConnectionFactoryDrManager implements IConnectionFactoryX {
		public CF(ConnectionProperties pr) {
			super(pr);
		}

		@Override
		public Connection getConnection(String arg0) {
			return getConnection();
		}
	}
	
	/***
	 * Initialize database configuration from Connection properties!!!
	 * @param pr
	 */
	public static void init(ConnectionProperties pr){
		 DBConfig.initDBConfig(new LogFactorySystemOut(), new IVisitFactory() {
			public IVisit getVist() {
				return new VisitEmpty();
			}
		}, new CF(pr), new IElaplsedTimerFactory() {
			public IElaplsedTimer getElapsedTimer() {
				return new ElapsedTimer();
			}
		}, null);
		 
		System.out.println("=========================== Data base connection initialized from cennection properties ============================= ");
	 }

	
	private static void saveToFile(long taxdocId) throws UnsupportedEncodingException, IOException, ClassNotFoundException, JAXBException {
		//774685
		//761270
		List<String> xml = new Dao(DBConfig.getConnectionFactory()).getXmlDocDataStr(taxdocId);
		List<XmlMapperDecl14> decl14 = new ArrayList<XmlMapperDecl14>();
		
		String ss = "";
		
		for(String s:xml) {
			XmlMapperDecl14 d = XmlSerialize.xmlToObject(s, XmlMapperDecl14.class);
			decl14.add(d);
		}
		//if(decl14.size() <=0) return;
		
		//compare histories one another.
		ss = XmlMapperDecl14Manager.cmpHistories(decl14);
		
		String partidaNo = decl14.get(0).getPartidano();
		System.out.println(partidaNo);
		//System.out.println("partidano " + decl14.get(0).getPartidano());
		
		//System.out.println(ss);
		FileOutputStream fos= new FileOutputStream(new File(partidaNo+".html"));
		fos.write(ss.getBytes("UTF-8"));
		fos.flush();
		fos.close();
	}
	
	
	public static void main(String [] args) throws ClassNotFoundException, JAXBException, UnsupportedEncodingException, IOException{
		init(dBases[12]);
		
		//761270
		//761272
		//760231
		//774685
		//756458
		saveToFile(774685);
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
