package net.is_bg.ltf.xmlmapper.decl14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.is_bg.ltf.db.common.AbstractMainDao;
import net.is_bg.ltf.db.common.interfaces.IConnectionFactory;

public class Dao extends AbstractMainDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8350271285425137123L;

	public Dao(IConnectionFactory connectionFactory) {
		super(connectionFactory);
	}
	
	public List<byte[]> getXmlDocData(long taxdocId, long taxdocArxId){
		SelectDocData sel = new SelectDocData(taxdocId, taxdocArxId);
		execute(sel);
		return sel.getXml();
	}
	
	
	public List<String> getXmlDocDataStr(long taxdocId, long taxdocArxId){
		SelectDocData sel = new SelectDocData(taxdocId, taxdocArxId);
		execute(sel);
		List<String> s = new ArrayList<String>(); 
		for(byte [] b :sel.getXml()) {
			s.add(new String(b));
		}
		return s;
	}
	
	public Set<Long> getDecl14_2TaxdocIds(){
		SelectTdids14_2 sel = new SelectTdids14_2();
		execute(sel);
		return sel.ids;
	}
	
}
