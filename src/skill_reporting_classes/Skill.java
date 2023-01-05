package skill_reporting_classes;

public class Skill {
	String name;
	Domain domain;
	Integer experience;
	Level level_of_expertise;
	
	public Skill(String Name,Domain domain, Level level_of_expertise, Integer experience) {
		super();
		this.name = Name;
		this.domain = domain;
		this.level_of_expertise = level_of_expertise;
		this.experience = experience;
	}

}
