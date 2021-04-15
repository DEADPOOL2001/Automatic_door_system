package NIMISH;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class feedback extends JFrame {

	feedback(){
		ImageIcon img2=new ImageIcon("src/3.jpg");
		setLayout(null);
		JLabel background=new JLabel("",img2,JLabel.CENTER);
		setSize(560,400);
		background.setBounds(0,0, 560, 400);
		Font FF = new Font("Roboto",Font.BOLD,30);
		JLabel main = new JLabel("FEEDBACK FORM");
		JLabel name = new JLabel("NAME *");
		JLabel feed = new JLabel("FEEDBACK *");
		JButton sub= new JButton ("SUBMIT");
		main.setFont(FF);
		main.setForeground(Color.BLUE);
		main.setBounds(107, 13, 308, 38);
		FF = new Font("Roboto",Font.BOLD,18);
		name.setFont(FF);
		name.setBounds(25, 83, 73, 29);
		feed.setFont(FF);
		feed.setBounds(15, 178, 130, 29);
		feed.setForeground(Color.red);
		name.setForeground(Color.red);
		JTextField m1=new JTextField("");
		JTextField m2=new JTextField("");
		m1.setBounds(139, 82, 367, 25);
		m2.setBounds(139, 139, 367, 128);
		sub.setBounds(171, 288, 111, 29);
		add(background);
		background.add(m1);
		background.add(m2);
		background.add(sub);
		background.add(main);
		background.add(name);
		background.add(feed);
		setVisible(true);
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=m1.getText();
				String s1=m2.getText();
				if(s.equals("") || s1.equals("")) {
					JOptionPane.showMessageDialog(null, "no field can be left empty");
				}
				else {
					new mail(s,s1);
					dispose();
					JOptionPane.showMessageDialog(null, "thanks for your feedback 😊");
				}
			}
		});
	}
}
