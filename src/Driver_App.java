import java.util.ArrayList;
import java.util.Iterator;

import skill_reporting_classes .*;

public class Driver_App {
	
	Employee e = new Employee();
	
	
	
	static ArrayList<String> string1 = new ArrayList();
	
	Skill skill = new Skill("C", null, null, null);
	
	
	public Driver_App() {
		
	}

	public static void main(String[] args) {
		
		Iterator<String> it = string1.iterator();
		SkillDB db = new SkillDB();
		db.create_database(skildb,"four","123");
		
		
		
		
	}

}
