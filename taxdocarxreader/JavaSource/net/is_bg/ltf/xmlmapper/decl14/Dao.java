package net.is_bg.ltf.xmlmapper.decl14;

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
	
	public byte[] getXmlDocData(long taxdocId){
		SelectDocData sel = new SelectDocData(taxdocId);
		execute(sel);
		return sel.getXml();
	}
	
	
	public String getXmlDocDataStr(long taxdocId){
		SelectDocData sel = new SelectDocData(taxdocId);
		execute(sel);
		return new String(sel.getXml());
	}
	

}
