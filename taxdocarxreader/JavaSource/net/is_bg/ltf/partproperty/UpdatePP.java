package net.is_bg.ltf.partproperty;

import net.is_bg.ltf.db.common.UpdateSqlStatement;

public class UpdatePP extends UpdateSqlStatement{
	
	public long partproperyId;
	private int seqno;
	
	UpdatePP(long partproperyId, int seqno){
		this.partproperyId = partproperyId;
		this.seqno = seqno;
	}

	@Override
	protected String getSqlString() {
		return " update partproperty set seqnots = '" +seqno+ "' where partproperty_id = " + partproperyId;
	}

}
