package net.is_bg.ltf.xmlmapper.decl14;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

import net.is_bg.ltf.db.common.SelectSqlStatement;

class SelectTdids14_2 extends SelectSqlStatement {
	Set<Long> ids = new TreeSet<>();

	@Override
	protected String getSqlString() {
		String s = " select td.taxdoc_id  from taxdoc  td \r\n" + 
				"where td.documenttype_id = 50\r\n" + 
				//"--and municipality_id = 2027\r\n" + 
				"order by td.begintaxdate asc";
		 s=  "select td.taxdoc_id from taxdocarx ar\r\n" + 
				"join taxdoc td on td.taxdoc_id = ar.taxdoc_id\r\n" + 
				"where ar.doc_date = current_date\r\n" + 
				"and td.documenttype_id = 50";
		 return s;
				
	}
	
	@Override
	protected void retrieveResult(ResultSet rs) throws SQLException {
		while(rs.next()) {
			ids.add(rs.getLong("taxdoc_id"));
		}
	}
   
	
	public Set<Long> getIds() {
		return ids;
	}
	
}
