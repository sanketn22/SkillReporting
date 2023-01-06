package skill_reporting_classes;

public class Skill {
	private String name;
	private Domain domain;
	private Integer experience;
	private Level level_of_expertise;
	
	public Skill(String Name,Domain domain, Level level_of_expertise, Integer experience) {
		this.name = Name;
		this.domain = domain;
		this.level_of_expertise = level_of_expertise;
		this.experience = experience;
	}

}
