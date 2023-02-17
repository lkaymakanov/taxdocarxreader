package net.is_bg.ltf.xmlmapper.decl14;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.is_bg.ltf.db.common.SelectSqlStatement;

class SelectDocData extends SelectSqlStatement{
	
	private long taxdocId, taxdocArxId =-1;
	private List<byte[]> xml = new ArrayList<byte[]>();
	
	SelectDocData(long taxdocId, long taxdocArxId ){
		this.taxdocId = taxdocId;
		this.taxdocArxId = taxdocArxId;
	}

	@Override
	protected String getSqlString() {
		String sql= " select docdata from taxdocarx where taxdoc_id = ? ";
		if(taxdocArxId > 0) sql+=" and taxdocarx_id =  " + taxdocArxId;
		return sql+ "  order by taxdocarx_id ";
	}
	
	@Override
	protected void setParameters(PreparedStatement prStmt) throws SQLException {
		bindVarData.setLong(taxdocId);
		bindVarData.setParameters(prStmt);
	}

	@Override
	protected void retrieveResult(ResultSet rs) throws SQLException {
		while(rs.next()){
			xml.add( rs.getBytes(1));
		}
	}

	public List<byte[]> getXml() {
		return xml;
	}
	
}
