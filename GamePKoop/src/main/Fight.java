package main;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Fight extends JFrame implements ActionListener{
	public JLabel Level,HP,Name,NameE,HPE,LevelE;
	public JButton Fight,PokemonDex;
    public JButton blaziken,charizard,deoxys,meganium,scizor,arceus;
	public JButton skill1,skill2,skill3,skill4;
	int clicks,clicks1,HPe;
	public JLabel PK1,PK2;
	Pokemon Poke;
	Attack att;
	String input1,input2,input3,input4,input5,input6;
	ImageIcon icon;
	ImageIcon icon1;
	Formrun run;
	int random,atk;
	public Fight() {
		try{
		run = new Formrun();	
		atk = (int) (Math.random()*10+70);
		Poke = new Pokemon();
		att = new Attack();		 					
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);	
	
		
		arceus = new JButton("arceus");
		arceus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 arceus();					
			}
		});
		arceus.setBounds(350, 139, 89, 23);
		getContentPane().add(arceus);
		arceus.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(482, 473, 312, 98);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Fight = new JButton("Fight");
		Fight.setBounds(10, 11, 140, 39);
		Fight.addActionListener(this);
		panel.add(Fight);
		Fight.setEnabled(false);
		
		PokemonDex = new JButton("PokemonDex'");
		PokemonDex.setBounds(10, 50, 140, 39);
		panel.add(PokemonDex);
		PokemonDex.addActionListener(this);
		
		JButton Bag = new JButton("Bag");
		Bag.setBounds(150, 11, 140, 39);
		panel.add(Bag);
		
		JButton Run = new JButton("Run");
		Run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Formrun Run = new Formrun();
				Run.setVisible(true);
			    setVisible(false);
			}
		});
		Run.setBounds(150, 50, 140, 39);
		panel.add(Run);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(482, 372, 312, 104);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	    Name = new JLabel("Name");
		Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Name.setBounds(33, 11, 162, 31);
		panel_1.add(Name);
		
		Level = new JLabel("Lv.0");
		Level.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Level.setBounds(198, 11, 114, 31);
		panel_1.add(Level);
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHp.setBounds(33, 70, 46, 14);
		panel_1.add(lblHp);
		
		HP = new JLabel("0/0");
		HP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HP.setBounds(92, 63, 133, 31);
		panel_1.add(HP);
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 11, 312, 104);
		getContentPane().add(panel_2);
		
		NameE = new JLabel();
		NameE.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NameE.setBounds(16, 11, 162, 31);
		panel_2.add(NameE);
		NameE.setText("Blaziken");
		
	    LevelE = new JLabel();
		LevelE.setFont(new Font("Tahoma", Font.PLAIN, 17));
		LevelE.setBounds(188, 11, 114, 31);
		panel_2.add(LevelE);
		LevelE.setText("Lv.50");
		
		JLabel lblHPE = new JLabel("HP:");
		lblHPE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHPE.setBounds(33, 70, 46, 14);
		panel_2.add(lblHPE);
		
		
		HPE = new JLabel("390");
		HPE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HPE.setBounds(89, 63, 133, 31);
		panel_2.add(HPE);
		
		blaziken = new JButton("blaziken");
		blaziken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blaziken();
				
			}
		});
		blaziken.setBounds(350, 173, 89, 23);
		getContentPane().add(blaziken);
		blaziken.setVisible(false);
		
		charizard = new JButton("charizard");
		charizard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				charizard();
			}
		});
		charizard.setBounds(350, 207, 89, 23);
		getContentPane().add(charizard);
		charizard.setVisible(false);
		
		deoxys = new JButton("deoxys-normal");
		deoxys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deoxy();
			}
		});
		deoxys.setBounds(337, 241, 120, 23);
		getContentPane().add(deoxys);
		deoxys.setVisible(false);
		
	    meganium = new JButton("meganium");
	    meganium.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Meganium();
	    	}
	    });
		meganium.setBounds(350, 275, 89, 23);
		getContentPane().add(meganium);
		meganium.setVisible(false);
		
		scizor = new JButton("scizor");
		scizor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scizor();
			}
		});
		scizor.setBounds(350, 309, 89, 23);
		getContentPane().add(scizor);
		scizor.setVisible(false);
		
	    skill1 = new JButton("");
	    skill1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) { 		    
	    		skill();
		    			    
	    	}
	    });
		skill1.setBounds(53, 455, 136, 46);
		getContentPane().add(skill1);
		skill1.setVisible(false);
		
		skill2 = new JButton("");
		skill2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			skill();
			}
		});
		skill2.setBounds(199, 455, 136, 43);
		getContentPane().add(skill2);
		skill2.setVisible(false);
		
		skill3 = new JButton("");
		skill3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			skill();
			}
		});
		skill3.setBounds(53, 514, 136, 46);
		getContentPane().add(skill3);
		skill3.setVisible(false);
		
		skill4 = new JButton("");
		skill4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			skill();
			}
		});
		skill4.setBounds(199, 514, 136, 46);
		getContentPane().add(skill4);
		skill4.setVisible(false);
		
		PK1 = new JLabel("");
		PK1.setBounds(38, 143, 284, 316);
		getContentPane().add(PK1);			  
		
		PK2 = new JLabel("");
		PK2.setBounds(482, 11, 302, 350);
		getContentPane().add(PK2);	   
		
		icon1 = new ImageIcon(getClass().getResource("/blaziken1.jpg"));
	    icon1.getImage().flush();
	    PK2.setIcon(icon1);	  	   
	    
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}


	public void actionPerformed(ActionEvent e) {
		 try{
		Object source = e.getSource();
		 Object source2 = e.getSource();
         if(source == Fight){
             if(clicks%2 == 0){
           	skill1.setVisible(true);
           	skill2.setVisible(true);
           	skill3.setVisible(true);
           	skill4.setVisible(true);
             }
             if(clicks%2 == 1){
           	  skill1.setVisible(false);
           	  skill2.setVisible(false);
           	  skill3.setVisible(false);
           	  skill4.setVisible(false);
             }     
             clicks++;         
         }
         if(source == PokemonDex){
        	 if(clicks1%2 == 0){
        		 blaziken.setVisible(true);
        		 arceus.setVisible(true);
        		 charizard.setVisible(true);
        		 deoxys.setVisible(true);
        		 meganium.setVisible(true);
                 scizor.setVisible(true);
                }
                if(clicks1%2 == 1){
                 blaziken.setVisible(false);
                 arceus.setVisible(false);
        		 charizard.setVisible(false);
        		 deoxys.setVisible(false);
        		 meganium.setVisible(false);
                 scizor.setVisible(false);
                }           
                clicks1++;
         }
		 }catch(Exception e1){
			 
		 }
       }
	
	public void arceus(){
		icon = new ImageIcon(getClass().getResource("/arceus.jpg"));
	    icon.getImage().flush();
		PK1.setIcon(icon);
		skill1.setText((String)Poke.ar.get(0));
		skill2.setText((String)Poke.ar.get(1));
		skill3.setText((String)Poke.ar.get(2));
		skill4.setText((String)Poke.ar.get(3));
		Poke.heal = 360;		
		Name.setText((String)Poke.name.get(0));
		Level.setText((String)Poke.lv);		
		Fight.setEnabled(true);
	    input1	= "Arceus";
	    random = (int)(Math.random()*10+50);
	}
	public void blaziken(){
		icon = new ImageIcon(getClass().getResource("/blaziken.jpg"));
	    icon.getImage().flush();
		PK1.setIcon(icon);		
		skill1.setText((String)Poke.bl.get(0));
		skill2.setText((String)Poke.bl.get(1));
		skill3.setText((String)Poke.bl.get(2));
		skill4.setText((String)Poke.bl.get(3));
		Poke.heal1 = 380;				
		Name.setText((String)Poke.name.get(1));
		Level.setText((String)Poke.lv);	
		Fight.setEnabled(true);
		 input2	= "Blaziken";
		 random = (int)(Math.random()*10+60);
	}
	public void charizard(){
		icon = new ImageIcon(getClass().getResource("/charizard.jpg"));
	    icon.getImage().flush();
		PK1.setIcon(icon);		
		skill1.setText((String)Poke.ch.get(0));
		skill2.setText((String)Poke.ch.get(1));
		skill3.setText((String)Poke.ch.get(2));
		skill4.setText((String)Poke.ch.get(3));
		Poke.heal2 = 350;
		Name.setText((String)Poke.name.get(2));
		Level.setText((String)Poke.lv);
		Fight.setEnabled(true);
		input3	= "Charizard";
		random = (int)(Math.random()*10+40);
	}
	public void Deoxy(){
		icon = new ImageIcon(getClass().getResource("/deoxys-normal.jpg"));
	    icon.getImage().flush();
		PK1.setIcon(icon);		
		skill1.setText((String)Poke.de.get(0));
		skill2.setText((String)Poke.de.get(1));
		skill3.setText((String)Poke.de.get(2));
		skill4.setText((String)Poke.de.get(3));
		Poke.heal3 = 370;		
		Name.setText((String)Poke.name.get(3));
		Level.setText((String)Poke.lv);
		Fight.setEnabled(true);
		input4 = "Deoxys-normal";
		random = (int)(Math.random()*10+80);
	}
	public void Meganium(){
		icon = new ImageIcon(getClass().getResource("/meganium.jpg"));
	    icon.getImage().flush();
		PK1.setIcon(icon);		
		skill1.setText((String)Poke.me.get(0));
		skill2.setText((String)Poke.me.get(1));
		skill3.setText((String)Poke.me.get(2));
		skill4.setText((String)Poke.me.get(3));
		Poke.heal4 = 360;
		Name.setText((String)Poke.name.get(4));
		Level.setText((String)Poke.lv);
		Fight.setEnabled(true);
		input5 = "Meganium";
		random = (int)(Math.random()*10+70);
	}
	public void Scizor(){
		icon = new ImageIcon(getClass().getResource("/scizor.jpg"));
	    icon.getImage().flush();
		PK1.setIcon(icon);		
		skill1.setText((String)Poke.sc.get(0));
		skill2.setText((String)Poke.sc.get(1));
		skill3.setText((String)Poke.sc.get(2));
		skill4.setText((String)Poke.sc.get(3));
		Poke.heal5 = 320;
		Name.setText((String)Poke.name.get(5));
		Level.setText((String)Poke.lv);
		Fight.setEnabled(true);
		input6 = "Scizor";
		random = (int)(Math.random()*10+50);
	}
    
    public void skill(){
    	try{
    	if(Poke.name.get(0).equals(input1)){		        	 		          
    		HPE.setText(String.valueOf(att.heal1 - Poke.atk));
    		Poke.atk += random;
    	    HP.setText(String.valueOf(Poke.heal -att.atk1));	    	   	   
    		att.atk1 += atk;	
    		if(att.atk1 >= att.heal1){	 
    				    Poke.atk = 0;	    				    
    				    att.atk1 = 0;	    					
    		     		HP.setText("0");	
    		         	arceus.setEnabled(false);
    		         	JOptionPane.showMessageDialog(null,"You Change Pokemon");
    		      }
         	else if(Poke.atk >= Poke.heal){	    	        		
    		     		Poke.atk = 0;
    		 	    	att.atk1 = 0;
    		 	    	att.heal1 = 0;
    		     		HPE.setText("0");	        		      	
    		     		JOptionPane.showMessageDialog(null,"You WIN");	 
    		     		run.setVisible(true);
    		     		dispose();
             	}
    		}	    
    		if(Poke.name.get(1).equals(input2)){		        	 		          
	    		HPE.setText(String.valueOf(att.heal1 - Poke.atk2));
	    		Poke.atk2 += random;
	    	    HP.setText(String.valueOf(Poke.heal1 -att.atk2));	    	   	   
	    		att.atk2 += atk;	
	    		if(att.atk2 >= att.heal1){	 
	    				    Poke.atk2 = 0;	    				    
	    				    att.atk2 = 0;	    					
	    		     		HP.setText("0");			     		
	    		     	    blaziken.setEnabled(false);
	    		     	   JOptionPane.showMessageDialog(null,"You Change Pokemon");
	    		     	
	    		}
	         	else if(Poke.atk2 >= Poke.heal1){	    	        		
	    		     		Poke.atk2 = 0;
	    		 	    	att.atk2 = 0;
	    		     		HPE.setText("0");	
	    		     		att.heal1 = 0;
	    		     		JOptionPane.showMessageDialog(null,"You WIN");	 
	    		     		run.setVisible(true);
	    		     		dispose();
	         	}
	    		}	    
    		if(Poke.name.get(2).equals(input3)){		        	 		          
	    		HPE.setText(String.valueOf(att.heal1 - Poke.atk3));
	    		Poke.atk3 += random;
	    	    HP.setText(String.valueOf(Poke.heal2 -att.atk3));	    	   	   
	    		att.atk3 += atk;	
	    		if(att.atk3 >= att.heal1){	 
	    				    Poke.atk3 = 0;	    				    
	    				    att.atk3 = 0;	    					
	    		     		HP.setText("0");		
	    		         	charizard.setEnabled(false);
	    		         	JOptionPane.showMessageDialog(null,"You Change Pokemon");
	    		      }
	         	else if(Poke.atk3 >= Poke.heal2){	    	        		
	    		     		Poke.atk3 = 0;
	    		 	    	att.atk3 = 0;
	    		     		HPE.setText("0");	 
	    		     		att.heal1 = 0;
	    		     		JOptionPane.showMessageDialog(null,"You WIN");	 
	    		     		run.setVisible(true);
	    		     		dispose();
	         	}
	    		}	    
    		if(Poke.name.get(3).equals(input4)){		        	 		          
	    		HPE.setText(String.valueOf(att.heal1 - Poke.atk4));
	    		Poke.atk4 += random;
	    	    HP.setText(String.valueOf(Poke.heal3 -att.atk4));	    	   	   
	    		att.atk4 += atk;	
	    		if(att.atk4 >= att.heal1){	 
	    				    Poke.atk4 = 0;	    				    
	    				    att.atk4 = 0;	    					
	    		     		HP.setText("0");		
	    		         	deoxys.setEnabled(false);
	    		         	JOptionPane.showMessageDialog(null,"You Change Pokemon");
	    		      }
	         	else if(Poke.atk4 >= Poke.heal3){	    	        		
	    		     		Poke.atk4 = 0;
	    		 	    	att.atk4 = 0;
	    		     		HPE.setText("0");	 
	    		     		att.heal1 = 0;
	    		     		JOptionPane.showMessageDialog(null,"You WIN");	 
	    		     		run.setVisible(true);
	    		     		dispose();
	         	}
	    		}	    
    		if(Poke.name.get(4).equals(input5)){		        	 		          
	    		HPE.setText(String.valueOf(att.heal1 - Poke.atk5));
	    		Poke.atk5 += random;
	    	    HP.setText(String.valueOf(Poke.heal4 -att.atk5));	    	   	   
	    		att.atk5 += atk;	
	    		if(att.atk5 >= att.heal1){	 
	    				    Poke.atk5 = 0;	    				    
	    				    att.atk5 = 0;	    					
	    		     		HP.setText("0");	
	    		         	meganium.setEnabled(false);
	    		         	JOptionPane.showMessageDialog(null,"You Change Pokemon");
	    		      }
	         	else if(Poke.atk5 >= Poke.heal4){	    	        		
	    		     		Poke.atk5 = 0;
	    		 	    	att.atk5 = 0;
	    		 	    	att.heal1 = 0;
	    		     		HPE.setText("0");	        		      	
	    		     		JOptionPane.showMessageDialog(null,"You WIN");	 
	    		     		run.setVisible(true);
	    		     		dispose();
	         	}
	    		if(Poke.name.get(5).equals(input6)){		        	 		          
		    		HPE.setText(String.valueOf(att.heal1 - Poke.atk6));
		    		Poke.atk6 += random;
		    	    HP.setText(String.valueOf(Poke.heal5 -att.atk6));	    	   	   
		    		att.atk6 += atk;	
		    		if(att.atk6 >= att.heal1){	 
		    				    Poke.atk6 = 0;	    				    
		    				    att.atk6 = 0;	    					
		    		     		HP.setText("0");	
		    		         	scizor.setEnabled(false);
		    		         	JOptionPane.showMessageDialog(null,"You Change Pokemon");
		    		      }
		         	else if(Poke.atk6 >= Poke.heal5){	    	        		
		    		     		Poke.atk6 = 0;
		    		 	    	att.atk6 = 0;
		    		 	    	att.heal1 = 0;
		    		     		HPE.setText("0");	        		      	
		    		     		JOptionPane.showMessageDialog(null,"You WIN");	 
		    		     		run.setVisible(true);
		    		     		dispose();
		         	}		    		     		
		    		}	
    		}
	    		}catch(Exception e2){
	    			
	    		}
    
    }
}
