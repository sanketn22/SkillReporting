# SkillReporting

Program enables user to add their skills to a database along with their skill level and years of expertise.  
Skills can belong to different domains.  
The driver_app will contain the main class that will be used to carry out all the functions like adding, deleting, updating the entries in the database.  
The Domain1 and Level Enums contain the entries for Domain of the skill, and the level of expertise respectively.  
The Domain class contains an EnumMap<Domain1, HashSet<Skills>>, this is to hold all skills associated with the domain.  
The Employee class has a set of Skill objects and an Integer empID to uniquely identify each user.  
