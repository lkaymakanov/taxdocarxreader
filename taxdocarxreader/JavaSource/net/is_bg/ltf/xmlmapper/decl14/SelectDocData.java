package net.is_bg.ltf.xmlmapper.decl14;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.is_bg.ltf.db.common.SelectSqlStatement;

class SelectDocData extends SelectSqlStatement{
	
	private long taxdocId =-1;
	private List<byte[]> xml = new ArrayList<byte[]>();
	
	SelectDocData(long taxdocId ){
		this.taxdocId = taxdocId;
	}

	@Override
	protected String getSqlString() {
		return " select docdata from taxdocarx where taxdoc_id = ? order by taxdocarx_id ";
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
			xml.add( rs.getBytes(1));
		}
	}

	public List<byte[]> getXml() {
		return xml;
	}
	
	
}
