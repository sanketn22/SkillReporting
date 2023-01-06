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
		db.create_database("skildb","four","123");	
		
		
	}

}
