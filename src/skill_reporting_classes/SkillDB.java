package skill_reporting_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SkillDB {

	public SkillDB() {
		
	}
	
	
	
	public void create_database(String name,String USER,String PASS) {
		String DB_URL="jdbc:sqlite:C:\\Users\\sandh\\OneDrive\\Desktop\\Mca_opp_practical\\"+name+".db";
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
	public static Connection connect() {
		Connection con = null;
		 try {
			 String url = "jdbc:sqlite:C:\\\\Users\\\\sandh\\\\OneDrive\\\\Desktop\\\\Mca_opp_practical\\skills.db";
			 con = DriverManager.getConnection(url);
			 			 
		 }
		 catch(SQLException e ) {
			 System.out.println(e.getMessage());
		 }finally {
//			 try
//			 {
//				 if(con!=null) {
//					 con.close();
//				 }
//			 }catch(SQLException f) {
//				 System.out.println(f.getMessage());
//			 }
		 }
		 return con;
	}
	
	
public void createTable(String s1) {
		
		String sql = s1;  
		try{  
            Connection conn = this.connect();  
            Statement stmt = conn.createStatement();            
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
    }


public void insert_in_skills(String skill,String Domain,String skillId) {
	String sql ="INSERT INTO Domain(Skill_ID,Skill,Domain) VALUES(?,?,?)";
	try {
		Connection conn =this.connect();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,skillId);
		pstmt.setString(2,skill);
		pstmt.setString(3,Domain);
		pstmt.executeUpdate();
		System.out.println("insertion sucessful");
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
}




	
	

}
