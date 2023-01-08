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
	        JFrame f1 = new JFrame("Deleting Skill");
	        JPanel panel=new JPanel();
	        JPanel panel1 =new JPanel();	        
	        
	        panel.setBounds(0,0,720,720);    
	        panel.setBackground(Color.BLUE);
	        
	        panel1.setBounds(0,0,480,480);    
	        panel1.setBackground(Color.DARK_GRAY);
	        
	       
	        JButton b1=new JButton("Add User Details");     
	        b1.setBounds(540,200,80,30);    
	        b1.setBackground(Color.yellow);
	        b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					db.insert_in_Domain("TEST", "tech", "12343");
					
				}
			});
	        
	        JButton b2=new JButton("Update User Details");   
	        b2.setBounds(540,400,80,30);    
	        b2.setBackground(Color.magenta);
	        
	        b2.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					db.delete(null);
				}
			});
	        
	        
	        
	        
	        JButton b3=new JButton("Remove User Details");
	        b3.setBounds(540,600,80,30);    
	        b3.setBackground(Color.red);
	        
	        b3.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					 final TextField tf1=new TextField();
					 tf1.setBounds(50,50, 150,20);
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
					
					 panel1.add(tf1);
					 panel1.add(but1);
					 f1.add(panel1);
					 f1.setSize(720,720);    
		             f1.setLayout(null);    
		             f1.setVisible(true);	
				}
			});
	        
	        
	        panel.add(b1); panel.add(b2); panel.add(b3);
	        f.add(panel);  
	                f.setSize(720,720);    
	                f.setLayout(null);    
	                f.setVisible(true);    
	        }
}