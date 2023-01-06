import java.util.ArrayList;
import java.util.Iterator;

import skill_reporting_classes .*;

public class Driver_App {
	
	Employee e = new Employee();	
	
	
	Skill skill = new Skill("C", null, null, null);

	
	
	public Driver_App() {
		
	}

	public static void main(String[] args) {
		
	

		SkillDB db = new SkillDB();
		db.create_database("skills","four","123");	
		db.createTable("CREATE TABLE IF NOT EXISTS Domain (\r\n"
				+ "	\"Skill_ID\"	INTEGER NOT NULL UNIQUE,\r\n"
				+ "	\"Skill\"	TEXT NOT NULL UNIQUE,\r\n"
				+ "	\"Domain\"	TEXT NOT NULL,\r\n"
				+ "	PRIMARY KEY(\"Skill_ID\" AUTOINCREMENT)\r\n"
				+ ");");
		db.insert_in_skills("c","tech", "1234");
		
		
		
	}

}
