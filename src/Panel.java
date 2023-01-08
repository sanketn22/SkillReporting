import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import skill_reporting_classes.SkillDB;

public class Panel { 
	
	SkillDB db = new SkillDB();	
	
	     Panel()  
	      {    	
	    		
	        JFrame f= new JFrame("Skill Reporting");	        
	        JPanel panel=new JPanel();
	        
	        
	       //Button to add User details
	        JButton b1=new JButton("Add User Details");     
	        b1.setBounds(540,200,80,30);    
	        b1.setBackground(Color.yellow);
	        b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame f1 = new JFrame("Adding User Details");
					f1.setSize(720,720);    
			        f1.setLayout(null);    
			        f1.setVisible(true);
					
					JPanel panel1 =new JPanel();			        
			        panel1.setBounds(0,0,480,480);    
			        panel1.setBackground(Color.DARK_GRAY);
					
					final TextField tf1=new TextField();					
					tf1.setBounds(50,50, 300,30);						 
					tf1.setName("Enter User Name");
					
					final TextField tf2=new TextField();
					tf2.setBounds(100,100, 300,30);		 
					tf2.setName("Enter User ID");
				
					JButton but1 = new JButton("OK");
					but1.setBounds(540,200,80,30);    
					but1.setBackground(Color.yellow);					     
					but1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							db.insert_in_Details(Integer.parseInt(tf2.getText()), tf1.getText());
							f1.dispose();
							}
						});
					
					JButton but2 = new JButton("Cancel");
					but2.setBounds(540,200,80,30);    
					but2.setBackground(Color.yellow);					     
					but2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							f1.dispose();
							}
						});						
					panel1.add(tf1);
					panel1.add(tf2);
					panel1.add(but1);
					panel1.add(but2);
					f1.add(panel1);
					
				}
			});
	        
	        
	        
	        
		    /*Button for updating the domain*/    
					
	        JButton b2=new JButton("Update Domain Details");   
	        b2.setBounds(540,400,80,30);    
	        b2.setBackground(Color.magenta);	        
	        b2.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame f1 = new JFrame("Adding User Details");
					f1.setSize(720,720);    
			        f1.setLayout(null);    
			        f1.setVisible(true);
					
					JPanel panel1 =new JPanel();			        
			        panel1.setBounds(0,0,480,480);    
			        panel1.setBackground(Color.DARK_GRAY);
			        final TextField tf1=new TextField();
					tf1.setBounds(50,50, 150,20);
					tf1.setName("Enter Skill ID");
					
					
					JButton but1 = new JButton("OK");
					but1.setBounds(540,200,80,30);    
				    but1.setBackground(Color.yellow);
				     
				    but1.addActionListener(new ActionListener() {					
						@Override
						public void actionPerformed(ActionEvent e) {
							
							db.delete(tf1.getText());
							f1.dispose();
						}
					});
				    
				    JButton but2 = new JButton("Cancel");
					but2.setBounds(540,200,80,30);    
					but2.setBackground(Color.yellow);					     
					but2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							f1.dispose();
							}
						});
					
					 panel1.add(tf1);
					 panel1.add(but1);
					 f1.add(panel1);
					
				}
			});
	        
	        
	        
	        
	        //Button to remove user details
	        
	        JButton b3=new JButton("Remove User Details");
	        b3.setBounds(540,600,80,30);    
	        b3.setBackground(Color.red);	        
	        b3.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame f1 = new JFrame("Adding User Details");
					f1.setSize(720,720);    
		            f1.setLayout(null);    
		            f1.setVisible(true);
					
					JPanel panel1 =new JPanel();			        
			        panel1.setBounds(0,0,480,480);    
			        panel1.setBackground(Color.DARK_GRAY);
			        
			        
					final TextField tf1=new TextField();
					tf1.setBounds(50,50, 150,20);
					tf1.setName("Enter Skill ID");
					
					
					JButton but1 = new JButton("OK");
					but1.setBounds(540,200,80,30);    
				    but1.setBackground(Color.yellow);
				     
				    but1.addActionListener(new ActionListener() {					
						@Override
						public void actionPerformed(ActionEvent e) {
							
							db.delete(tf1.getText());
							f1.dispose();
						}
					});
				    
				    JButton but2 = new JButton("Cancel");
					but2.setBounds(540,200,80,30);    
					but2.setBackground(Color.yellow);					     
					but2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							f1.dispose();
							}
						});
					
					 panel1.add(tf1);
					 panel1.add(but1);
					 f1.add(panel1);
					 
				}
			});
	        
	        
	        panel.add(b1); panel.add(b2); panel.add(b3);
	        f.add(panel);  
	                f.setSize(720,720);    
	                f.setLayout(null);    
	                f.setVisible(true);    
	        }
}