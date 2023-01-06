import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {  
	     Panel()  
	      {  
	        JFrame f= new JFrame("Skill Reporting");    
	        JPanel panel=new JPanel();  
	        panel.setBounds(0,0,720,720);    
	        panel.setBackground(Color.BLUE);
	        
	       
	        JButton b1=new JButton("Add User Details");     
	        b1.setBounds(540,200,80,30);    
	        b1.setBackground(Color.yellow);
	        b1.addActionListener(null);
	        
	        JButton b2=new JButton("Update User Details");   
	        b2.setBounds(540,400,80,30);    
	        b2.setBackground(Color.magenta);
	        
	        JButton b3=new JButton("Remove User Details");   
	        b2.setBounds(540,600,80,30);    
	        b2.setBackground(Color.red);
	        
	        panel.add(b1); panel.add(b2); panel.add(b3);
	        f.add(panel);  
	                f.setSize(720,720);    
	                f.setLayout(null);    
	                f.setVisible(true);    
	        }
}