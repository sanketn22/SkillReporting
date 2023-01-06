package skill_reporting_classes;
import java.util.ArrayList;
import java.util.Set;

public class Employee {
	
	private Set<Skill>skillList;
	private Integer empID;

	
	
	public Employee(Integer x, Skill skill) {
		this.empID = x;
		this.skillList.add(skill);		
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


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
		
}
