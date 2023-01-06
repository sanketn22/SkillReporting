package skill_reporting_classes;

import java.util.EnumMap;
import java.util.HashSet;

public class Domain {
	
	
	EnumMap<domain, HashSet<Skill> > domainList;
	
	enum domain{
	TECH,
	BUSINESS,
	LEADERSHIP;
}
	
	public Domain(EnumMap<domain, HashSet<Skill>> domainList) {
		super();
		this.domainList = domainList;
	}


	
	
	
}
