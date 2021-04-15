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

public class main extends JFrame{
	public static boolean bool1=false,bool2=false,bool3=false,bool4=false;
	public static boolean bol1=false,bol2=false,bol3=false,bol4=false;
	public static int delay =2;
	private JButton b1 = new JButton("");
	private JButton b2 = new JButton("");
	private JButton b3 = new JButton("");
	private JButton b4 = new JButton("");
	private JButton b5 = new JButton("");
	private JButton b6 = new JButton("");
	private JButton b7 = new JButton("");
	private JLabel c1=new JLabel("");
	private JLabel c2=new JLabel("");
	private JLabel c3=new JLabel("");
	private JLabel c4=new JLabel("");
	private JLabel d1=new JLabel("DOOR1");
	private JLabel d2=new JLabel("DOOR2");
	private JLabel d3=new JLabel("DOOR3");
	private JLabel d4=new JLabel("DOOR4");
	private JLabel d5=new JLabel("FEEDBACK");
	private JLabel d6=new JLabel("CONTACT US");
	private JLabel d7=new JLabel("SET DELAY");
	public void check(boolean k1,boolean k2) {
		if(k1==true&&k2==true)
			c1.setText("ON AND OPEN");
		else if((k1==false)&&k2==true)
			c1.setText("CLOSE AND ON");
		else if((k1==true)&&(k2==false))
			c1.setText("OPEN AND OFF");
		else
			c1.setText("OFF AND CLOSE");
	}
	public void check1(boolean k1,boolean k2) {
		if(k1==true&&k2==true)
			c2.setText("ON AND OPEN");
		else if((k1==false)&&k2==true)
			c2.setText("CLOSE AND ON");
		else if((k1==true)&&(k2==false))
			c2.setText("OPEN AND OFF");
		else
			c2.setText("OFF AND CLOSE");
	}
	public void check2(boolean k1,boolean k2) {
		if(k1==true&&k2==true)
			c3.setText("ON AND OPEN");
		else if((k1==false)&&k2==true)
			c3.setText("CLOSE AND ON");
		else if((k1==true)&&(k2==false))
			c3.setText("OPEN AND OFF");
		else
			c3.setText("OFF AND CLOSE");
	}
	public void check3(boolean k1,boolean k2) {
		if(k1==true&&k2==true)
			c4.setText("ON AND OPEN");
		else if((k1==false)&&k2==true)
			c4.setText("CLOSE AND ON");
		else if((k1==true)&&(k2==false))
			c4.setText("OPEN AND OFF");
		else
			c4.setText("OFF AND CLOSE");
	}
	main(){
		JLabel a1,a2,background;
		setSize(900, 500);
		setLayout(null);
		ImageIcon img2=new ImageIcon("src/4.jpg");
		ImageIcon img=new ImageIcon("src/1.jpg");
		ImageIcon img1=new ImageIcon("src/2.PNG");
		a1=new JLabel("",img,JLabel.CENTER);
		a1.setBounds(25, 10, 118, 124);
		a2=new JLabel("",img1,JLabel.CENTER);
		a2.setBounds(681, 11, 118, 124);
		background=new JLabel("",img2,JLabel.CENTER);
		background.setBounds(0,0, 900, 500);
		JLabel main = new JLabel("WELCOME ADMIN");
		Font FF = new Font("Roboto",Font.BOLD,48);
		main.setFont(FF);
		main.setForeground(Color.white);
		Font FF1 = new Font("Roboto",Font.BOLD,14);
		c1.setFont(FF1);
		c1.setForeground(Color.yellow.brighter());
		c2.setFont(FF1);
	    c2.setForeground(Color.yellow.brighter());
		c3.setFont(FF1);
		c3.setForeground(Color.yellow.brighter());
		c4.setFont(FF1);
		c4.setForeground(Color.yellow.brighter());
		Font FF2 = new Font("Roboto",Font.BOLD,18);
		d1.setFont(FF2);
		d1.setForeground(Color.GREEN);
		d2.setFont(FF2);
	    d2.setForeground(Color.GREEN);
		d3.setFont(FF2);
		d3.setForeground(Color.GREEN);
		d4.setFont(FF2);
		d4.setForeground((Color.GREEN));
		d5.setFont(FF2);
		d5.setForeground((Color.GREEN));
		d6.setFont(FF2);
		d6.setForeground((Color.GREEN));
		d7.setFont(FF2);
		d7.setForeground((Color.GREEN));
		main.setBounds(200, 51, 613, 80);
		c1.setBounds(79, 231, 146, 17);
		c2.setBounds(396, 231, 146, 17);
		c3.setBounds(79, 382, 146, 17);
		c4.setBounds(396, 382, 146, 17);
		b1.setBounds(66, 190,27, 27);
		b2.setBounds(396, 190,27, 27);
		b3.setBounds(66, 338,27, 27);
		b4.setBounds(396, 338,27, 27);
		b5.setBounds(696, 190,27, 27);
		b6.setBounds(696, 260,27, 27);
		b7.setBounds(696, 338,27, 27);
		b1.setBackground(Color.ORANGE);
		b2.setBackground(Color.ORANGE);
		b3.setBackground(Color.ORANGE);
		b4.setBackground(Color.ORANGE);
		b5.setBackground(Color.ORANGE);
		b6.setBackground(Color.ORANGE);
		b7.setBackground(Color.ORANGE);
		d1.setBounds(104, 190,113, 34);
		d2.setBounds(440, 190,113, 34);
		d3.setBounds(104, 338,113, 34);
		d4.setBounds(440, 338,113, 34);
		d5.setBounds(740, 190,130, 34);
		d6.setBounds(740, 260,113, 34);
		d7.setBounds(740, 338,113, 34);
		add(background);
		background.add(a1);
		background.add(a2);
		background.add(b1);
		background.add(b2);
		background.add(b3);
		background.add(b4);
		background.add(b5);
		background.add(b7);
		background.add(d1);
		background.add(d2);
		background.add(d3);
		background.add(d4);
		background.add(d5);
		background.add(d7);
		background.add(c1);
		background.add(c2);
		background.add(c3);
		background.add(c4);
		background.add(main);
		check(bool1,bol1);
		check1(bool2,bol2);
		check2(bool3,bol3);
		check3(bool4,bol4);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new config(1);
				dispose();
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new config(2);
				dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new config(3);
				dispose();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new config(4);
				dispose();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new feedback();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new setdelay();
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new main();
	}


}
