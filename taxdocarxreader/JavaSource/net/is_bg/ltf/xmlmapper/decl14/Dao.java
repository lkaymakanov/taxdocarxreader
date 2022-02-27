package net.is_bg.ltf.xmlmapper.decl14;

import java.util.ArrayList;
import java.util.List;

import net.is_bg.ltf.db.common.AbstractMainDao;
import net.is_bg.ltf.db.common.interfaces.IConnectionFactory;

class Dao extends AbstractMainDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8350271285425137123L;

	public Dao(IConnectionFactory connectionFactory) {
		super(connectionFactory);
	}
	
	public List<byte[]> getXmlDocData(long taxdocId){
		SelectDocData sel = new SelectDocData(taxdocId);
		execute(sel);
		return sel.getXml();
	}
	
	
	public List<String> getXmlDocDataStr(long taxdocId){
		SelectDocData sel = new SelectDocData(taxdocId);
		execute(sel);
		List<String> s = new ArrayList<String>(); 
		for(byte [] b :sel.getXml()) {
			s.add(new String(b));
		}
		return s;
	}
	

}
