package skill_reporting_classes;

public class Skill {
	private String name;
	private Integer SkillID;
	private Domain domain;
	private Float experience;
	private Level level_of_expertise;
	
	public Skill(String Name,Domain domain, Level level_of_expertise, Float experience) {
		this.name = Name;
		this.domain = domain;
		this.level_of_expertise = level_of_expertise;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSkillID() {
		return SkillID;
	}

	public void setSkillID(Integer skillID) {
		SkillID = skillID;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Float getExperience() {
		return experience;
	}

	public void setExperience(Float experience) {
		this.experience = experience;
	}

	public Level getLevel_of_expertise() {
		return level_of_expertise;
	}

	public void setLevel_of_expertise(Level level_of_expertise) {
		this.level_of_expertise = level_of_expertise;
	}

	
	
}
