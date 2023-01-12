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
		
		db.createTable("CREATE TABLE IF NOT EXISTS Details (\n"
				+ "	UID integer PRIMARY KEY, \n"
                + "	Name text NOT NULL\n"
                + " );");
		

		new Panel();
		
		
	}

}
