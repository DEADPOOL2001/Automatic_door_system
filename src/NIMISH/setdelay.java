package NIMISH;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class setdelay extends JFrame {

	setdelay(){
		setTitle("SET DELAY");
		this.getContentPane().setBackground(Color.yellow);
		setLayout(new FlowLayout());
		JLabel j = new JLabel("DELAY");
		JTextField t= new JTextField("(in seconds)");
		JButton b=new JButton("set delay");
		add(j);
		add(t);
		add(b);
		 setSize(300,90);  
		setVisible(true);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					main.delay=Integer.parseInt(t.getText()); 
					JOptionPane.showMessageDialog(null, "delay updated");
					dispose();
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "invalid delay");
				}
			}
		});
	}
}
