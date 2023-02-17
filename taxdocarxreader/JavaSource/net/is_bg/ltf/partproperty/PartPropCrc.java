package net.is_bg.ltf.partproperty;

import java.sql.CallableStatement;
import java.sql.SQLException;

import net.is_bg.ltf.db.common.StoredProcedure;

public class PartPropCrc extends StoredProcedure{
	
	private long taxdocid;

	PartPropCrc(long taxdocId){
		this.taxdocid = taxdocId;
	}
	@Override
	protected String getProcedureName() {
		return "{call taxdoc_crc("+taxdocid+")}";
	}

	@Override
	protected void setParameters(CallableStatement arg0) throws SQLException {
		
	}

}
