package net.is_bg.ltf.xmlmapper.decl14;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.is_bg.ltf.db.common.SelectSqlStatement;

class SelectDocData extends SelectSqlStatement{
	
	private long taxdocId =-1;
	private Object xml;
	
	SelectDocData(long taxdocId ){
		this.taxdocId = taxdocId;
	}

	@Override
	protected String getSqlString() {
		// TODO Auto-generated method stub
		return " select docdata from taxdocarx where taxdoc_id = ?  ";
	}
	
	@Override
	protected void setParameters(PreparedStatement prStmt) throws SQLException {
		// TODO Auto-generated method stub
		
		bindVarData.setLong(taxdocId);
		bindVarData.setParameters(prStmt);
	}

	@Override
	protected void retrieveResult(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		while(rs.next()){
			xml = rs.getBytes(1);
		}
	}

	public Object getXml() {
		return xml;
	}
	
	
}
