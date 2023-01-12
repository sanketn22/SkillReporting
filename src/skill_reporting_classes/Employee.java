package skill_reporting_classes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Employee {
	
	private Set<Skill>skillList;
	private String name;
	private Integer empID;

	
	
	public Employee(Integer x, Skill skill, String name) {
		this.empID = x;
		this.skillList = new HashSet<Skill>();		
		this.skillList.add(skill);
		this.name = name;
	}


	public Set<Skill> getSkillList() {
		return skillList;
	}


	public void setSkillList(Set<Skill> skillList) {
		this.skillList = skillList;
	}


	public Integer getEmpID() {
		return empID;
	}


	public void setEmpID(Integer empID) {
		this.empID = empID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
		
}
