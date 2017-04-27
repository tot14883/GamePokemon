package main;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Formrun extends JFrame{
   
	public Formrun(){//this is Class sent to run main 
		try{
		//setting value another
		setSize(784, 561);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		//Button Clikc go to GitHub
		JButton Github = new JButton("Guthub");
		Github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/tot14883/GamePokemon").toURI());
				} catch (IOException | URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Github.setBounds(342, 352, 115, 31);
		getContentPane().add(Github);
		
		//Button Click go to Start Fighting Pokemon
		JButton Start = new JButton("Start");
		Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fight fight = new Fight();
				setVisible(false);
				fight.setVisible(true);
			}
		});
		Start.setBounds(342, 310, 115, 31);
		getContentPane().add(Start);
		
		//Exit to Main Start
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		Exit.setBounds(343, 391, 113, 31);
		getContentPane().add(Exit);
		
		//setting image Pokemon 
		JLabel lblNewLabel = new JLabel("Pokemon OOP");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 67));
		lblNewLabel.setBounds(144, 106, 491, 96);
		getContentPane().add(lblNewLabel);
		JLabel Background = new JLabel("");
		Background.setBounds(0, -13, 784, 561);
		getContentPane().add(Background);
		String imagePath = "/Pokemon.jpeg";
		ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
	    icon.getImage().flush();
	    Background.setIcon( icon );
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Dowload JSON in GITHUB to Drive D Only !!!!");
		}
	}
   
}
