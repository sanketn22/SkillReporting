import skill_reporting_classes .*;

public class Driver_App {	
	
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
		
		db.insert_in_Domain("c","tech", "1234");
		db.insert_in_Domain("python","tech", "5678");
		db.insert_in_Domain("java", "tech", "9101");
		db.update_Domain_Table("9678", "public speaking", "leadership");
		db.delete("9101");

		new Panel();		
		
		
		
	}

}
