package net.is_bg.ltf.xmlmapper.decl14;

import java.sql.Connection;

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
import net.is_bg.ltf.xmlmapper.decl14.XmlMapperDecl14;

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
			new ConnectionProperties(PGR_DRIVER,"jdbc:postgresql://10.240.110.70:5432/pdv", "pdv", "pdv", "")  //11
	};
	
	public static class CF extends  DataSourceConnectionFactoryDrManager implements IConnectionFactoryX {
		public CF(ConnectionProperties pr) {
			super(pr);
		}

		@Override
		public Connection getConnection(String arg0) {
			// TODO Auto-generated method stub
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
				// TODO Auto-generated method stub
				return new VisitEmpty();
			}
		}, new CF(pr), new IElaplsedTimerFactory() {
			public IElaplsedTimer getElapsedTimer() {
				// TODO Auto-generated method stub
				return new ElapsedTimer();
			}
		});
		 
		System.out.println("=========================== Data base connection initialized from cennection properties ============================= ");
	 }

	public static void main(String [] args) throws ClassNotFoundException, JAXBException{
		init(dBases[11]);
		
		Object xml = new Dao(DBConfig.getConnectionFactory()).getXmlDocData(108981l);
		byte [] b = (byte []) xml;
		String s = new String(b);
		XmlMapperDecl14 decl14=XmlSerialize.xmlToObject(s, XmlMapperDecl14.class);
		System.out.println(s);
	}
}
