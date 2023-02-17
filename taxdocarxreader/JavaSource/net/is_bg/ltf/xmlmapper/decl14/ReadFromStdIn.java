package net.is_bg.ltf.xmlmapper.decl14;

import java.util.ArrayList;
import java.util.List;

import net.is_bg.ltf.db.common.ConnectionProperties;

public class ReadFromStdIn {
	public static void main(String [] args) {
		String ipDb = args[0];
		String user = args[1];
		String pass = args[2];
		String  tdId = args[3];
		String  db_name = "burgas";
		List<String> s= new ArrayList<>();
		ConnectionProperties cp = new ConnectionProperties(s);
		
		
		
	}
}
