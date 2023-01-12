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
		String DB_URL="jdbc:sqlite:D:\\Java workspace\\skill_reporting_test"+name+".db";
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
			String url = "jdbc:sqlite:D:\\Java workspace\\skill_reporting_test\\skills.db";
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
			Connection conn = SkillDB.connect();
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


	public void insert_in_Domain(String skill,String Domain,String skillId) {
		String sql ="INSERT INTO Domain(Skill_ID,Skill,Domain) VALUES(?,?,?)";
		try {
			Connection conn =SkillDB.connect();
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



	public void update_Domain_Table(String skillid, String skillname, String Domain) {
		String sql = "UPDATE Domain SET Domain = ? , "
				+ "Skill = ? "
				+ "WHERE Skill_ID = ?";

		try (Connection conn = SkillDB.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, Domain);
			pstmt.setString(2, skillname);
			pstmt.setString(3, skillid);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}



	public void delete(String id) {
		String sql = "DELETE FROM Domain WHERE Skill_ID = ?";

		try (Connection conn = SkillDB.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, id);
			// execute the delete statement
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


	public void insert_in_has(Integer UID,Integer skillID, Level level, Integer yox ) {
		String sql ="INSERT INTO has(UID,SkillID,Level_of_experties,Years_of_experience) VALUES(?,?,?,?)";
		try {
			Connection conn =this.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,UID.toString());
			pstmt.setString(2,skillID.toString());
			pstmt.setString(3,level.toString());
			pstmt.setString(4,yox.toString());

			pstmt.executeUpdate();
			System.out.println("insertion sucessful");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void insert_in_Details(Integer UID,String name ) {
		String sql ="INSERT INTO Details(UID,Name) VALUES(?,?)";
		try {
			Connection conn =this.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,UID.toString());
			pstmt.setString(2,name);

			pstmt.executeUpdate();
			System.out.println("insertion sucessful");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}






}
