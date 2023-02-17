package net.is_bg.ltf.partproperty;

import java.util.ArrayList;
import java.util.List;

import net.is_bg.ltf.db.common.DBConfig;
import net.is_bg.ltf.db.common.DBStatement;
import net.is_bg.ltf.xmlmapper.decl14.DBinit;
import net.is_bg.ltf.xmlmapper.decl14.Dao;

public class TestPP {

	public static void main(String [] ar) {
		DBinit.initByIndex(15);
		
		Dao d = new Dao(DBConfig.getConnectionFactory());
	    List<DBStatement> l = new ArrayList<DBStatement>();
	    l.add(new UpdatePP(656406, 183));
	    l.add(new UpdatePP(656406, 184));
	    //l.add(new PartPropCrc(843474));
	    d.execute(l);
	    System.out.println("OK");
		//d.execute(new PartPropCrc(843474));
		//(dBases[15]);
	}
}
