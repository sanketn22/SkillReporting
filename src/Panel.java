import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import skill_reporting_classes.Domain1;
import skill_reporting_classes.SkillDB;

public class Panel { 

	SkillDB db = new SkillDB();	

	Panel()  
	{    	

		JFrame f= new JFrame("Skill Reporting");		
		f.setBackground(Color.BLUE);
		f.setSize(720,720);
		f.setLayout(null);
		
		JPanel panel=new JPanel();		
		panel.setBackground(Color.DARK_GRAY);	
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.setLayout(null);




		//Button to add User details
		JButton b1=new JButton("Add User Details");     
		   
		b1.setBackground(Color.yellow);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame("Adding User Details");
				f1.setSize(720,720);    
				f1.setLayout(null);   
				

				JPanel panel1 =new JPanel();			    
				panel1.setBackground(Color.BLACK);
				panel1.setLayout(null);
				
				JLabel j1 = new JLabel("Name");
				JLabel j2 = new JLabel("UID");
				JLabel j3 = new JLabel("Domain");
				JLabel j4 = new JLabel("Skill");
				

				TextField tf1=new TextField();									 
				tf1.setName("Enter User Name");

				TextField tf2=new TextField();					 
				tf2.setName("Enter User ID");
				
				TextField tf3=new TextField();					 
				tf2.setName("Enter Skill");
				
				
				JComboBox<Domain1> cb1 = new JComboBox<Domain1>();
				cb1.addItem(Domain1.BUSINESS);
				cb1.addItem(Domain1.TECH);
				cb1.addItem(Domain1.LEADERSHIP);				
				
				
				
				JButton but1 = new JButton("OK");				   
				but1.setBackground(Color.yellow);					     
				but1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						db.insert_in_Details(Integer.parseInt(tf2.getText()), tf1.getText());
						tf1.setText(null);
						tf2.setText(null);
					}
				});

				JButton but2 = new JButton("Cancel");				   
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
				panel1.add(cb1);
				panel1.add(tf3);
				panel1.add(j1);
				panel1.add(j2);
				panel1.add(j3);
				panel1.add(j4);
				
				
				but1.setBounds(200,300,80,30);
				but2.setBounds(440,300,80,30);
				
				j1.setBounds(40,160,100,30);
				j1.setLabelFor(tf1);
				j1.setForeground(Color.cyan);
				
				j2.setBounds(220,160,100,30);
				j2.setLabelFor(tf2);
				j2.setForeground(Color.cyan);
				
				j3.setBounds(400,160,100, 30);
				j3.setLabelFor(cb1);
				j3.setForeground(Color.cyan);
				
				j4.setBounds(580,160, 100, 30);
				j4.setLabelFor(tf3);
				j4.setForeground(Color.cyan);
				
				
				tf1.setBounds(40,200,100,30);
				tf2.setBounds(220,200,100,30);
				cb1.setBounds(400,200,100, 30);
				tf3.setBounds(580, 200, 100, 30);
				
				f1.add(panel1);
				panel1.setBounds(0,0,720,720);
				
				panel1.validate();
				
				f1.validate();
				f1.setVisible(true);

			}
		});




		/*Button for updating the domain*/    

		JButton b2=new JButton("Update Domain Details");   
		   
		b2.setBackground(Color.magenta);	        
		b2.addActionListener(new ActionListener() {				
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame("Adding User Details");
				f1.setSize(720,720);    
				f1.setLayout(null);    


				JPanel panel1 =new JPanel();			        
				panel1.setBounds(0,0,480,480);    
				panel1.setBackground(Color.DARK_GRAY);


				final TextField tf1=new TextField();
				tf1.setBounds(50,50, 300,300);
				tf1.setName("Enter Skill ID");


				JButton but1 = new JButton("OK");
				but1.setBounds(400,200,80,30);    
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
				panel1.add(but2);
				f1.add(panel1);
				f1.setVisible(true);

			}
		});


		//Button to remove user details

		JButton b3=new JButton("Remove User Details");
		   
		b3.setBackground(Color.red);	        
		b3.addActionListener(new ActionListener() {				
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame("Adding User Details");
				f1.setSize(720,720);
				f1.setLayout(null);


				JPanel panel1 =new JPanel();				
				
				panel1.setSize(720, 720);
				
				panel1.setBackground(Color.cyan);


				TextField tf1=new TextField();
				tf1.setBounds(100,500, 100,50);
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
				but2.setBounds(540,200,200,30);    
				but2.setBackground(Color.yellow);					     
				but2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						f1.dispose();
					}
				});


				panel1.add(tf1);
				panel1.add(but1);
				panel1.add(but2);

				f1.add(panel1);
				f1.setVisible(true);


			}
		});


		
		f.add(panel);
		
		panel.setBounds(0,0,720,720);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		b1.setBounds(210,150,300,50);
		b2.setBounds(210,300,300,50); 
		b3.setBounds(210,450,300,50);
		
		panel.validate();
		f.validate();
		f.setVisible(true);


	}
}