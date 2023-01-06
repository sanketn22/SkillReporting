package skill_reporting_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SkillDB {

	public SkillDB() {
		
	}
	
	
	
	public void create_database(String name,String USER,String PASS) {
		String DB_URL="jdbc:sqlite:C:\\Users\\sandh\\OneDrive\\Desktop\\opp_project\\"+name+".db";
		//open a connection
		try(	
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				)
		{
			System.out.println("\n database created succesfully ...\n");
		}
		catch(SQLException e) {
			System.out.println("\ncould not create database\n");
			e.printStackTrace();
			
		}

	}
	
	
	

}
