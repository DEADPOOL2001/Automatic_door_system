package NIMISH;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class config {
	private JFrame f = new JFrame("CONFIG");
	public JLabel background;
	public JButton b1 = new JButton("start");
	public JButton b2 = new JButton("off");
	public JButton b3 = new JButton("emergency open");
	public JButton b4 = new JButton("emergency close");
	public JButton df = new JButton("save");
	public JLabel text= new JLabel("");
	public JLabel t= new JLabel("");
	public boolean k1,k2;
	public void check(boolean c1,boolean c2) {
		if(c1==true&&c2==true)
			text.setText("ON AND OPEN");
		else if((c1==false)&&c2==true)
			text.setText("CLOSE AND ON");
		else if((c1==true)&&(c2==false))
			text.setText("OPEN AND OFF");
		else
			text.setText("OFF AND CLOSE");
	}
	
	synchronized void demo(int val) {
		if(val==0 &&k1==false)
		{
			System.out.println("open hoga");
		text.setText("CURRENTLY OPENING");
		try {
			Thread.sleep(1000*main.delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		background.add(text);
		f.add(background);
		f.setVisible(true);
		k1=true;
		check(k1,k2);
		}
		else if(k1==true)
		{
			System.out.println("close hoga");
		text.setText("CURRENTLY CLOSING");
		try {
			Thread.sleep(1000*main.delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		f.add(background);
		background.add(text);
		f.setVisible(true);
		k1=false;
		check(k1,k2);
		}
	}
	public void rdom() {
		Random rand = new Random(); 
		int n = rand.nextInt(3); 
		System.out.println(n);
		if(k2==true) {
			if(n==1) {
				if(k1==false) {
					Thread tempThread = new Thread(new Runnable() {

						@Override
						public void run() {
{
								demo(0);
								
						}
}
						
					});
					tempThread.start();
					//try {
					//  tempThread.join();
					//} catch (InterruptedException e) {
				    //  TODO Auto-generated catch block
					//	e.printStackTrace();
					//}
				}
			}
			if(n==2 || n==0) {
				if(k1==true) {
					Thread tempThread = new Thread(new Runnable() {

						@Override
						public void run() {
							demo(1);

						}
					});
					tempThread.start();
					//try {
						//tempThread.join();
					//} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					//}
				}
			}
		}
	}
	
	public config(int i) {
		Font FF = new Font("Roboto",Font.BOLD,28);
		Font ff = new Font("Roboto",Font.BOLD,18);
		ImageIcon img1=new ImageIcon("src/4.jpg");
		background=new JLabel("",img1,JLabel.CENTER);
		background.setBounds(0,0, 900, 500);
		t.setFont(FF);
		f.add(background);
		t.setForeground(Color.GREEN);
		text.setForeground(Color.yellow);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		background.add(b1);
		text.setFont(ff);
		b1.setFont(ff);
		background.add(b2);
		b2.setFont(ff);
		background.add(b3);
		b3.setFont(ff);
		background.add(b4);
		b4.setFont(ff);
		background.add(df);
		background.add(t);
		df.setFont(ff);
		f.setSize(300,400);
		f.setLayout(null);
		if(i==1) {
			t.setText("DOOR 1");
		}
		if(i==2) {
			t.setText("DOOR 2");
		}
		if(i==3) {
			t.setText("DOOR 3");
		}
		if(i==4) {
			t.setText("DOOR 4");
		}
		t.setBounds(10, 10, 140, 90);
		text.setBounds(10, 80, 300, 30);
		b1.setBounds(10, 120, 190, 30);
		b2.setBounds(10, 160, 190, 30);
		b3.setBounds(10, 200, 190, 30);
		b4.setBounds(10, 240, 190, 30);
		df.setBounds(10, 280, 190, 30);
		background.add(text);
		background.add(t);
		if(i==1) {
			k1=main.bool1;
			k2=main.bol1;
		}
		if(i==2) {
			k1=main.bool2;
			k2=main.bol2;
		}
		if(i==3) {
			k1=main.bool3;
			k2=main.bol3;
		}
		if(i==4) {
			k1=main.bool4;
			k2=main.bol4;
		}
		check(k1,k2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(k2==true)
					JOptionPane.showMessageDialog(null, "door system is already on");
				if(k2==false) {
					k2=true;
					for(int j=0;j<10;j++) {
						rdom();
						
					}
					
				}
				check(k1,k2);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(k2==false)
					JOptionPane.showMessageDialog(null, "door system is already off");
				
				k2=false;
				check(k1,k2);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread tempThread = new Thread(new Runnable() {

					@Override
					public void run() {
						if(k2==false) {
							JOptionPane.showMessageDialog(null, "first start the automatic door system");
						}
						if(k2==true ) {
							if(k1==false)
							text.setText("CURRENTLY OPENING");
							else
								JOptionPane.showMessageDialog(null,"it is already open");
							f.setVisible(true);
							try {
								Thread.sleep(1000*main.delay);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							boolean m=k1;
							k1=true;
							k2=false;
							if(m==false) {
							     text.setText("EMERGENCY OPEN");
							     new Mail1(i);
							     JOptionPane.showMessageDialog(null, "mail sent to faculty");
							}
							
							
						}
					}
					
				});
				tempThread.start();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread tempThread = new Thread(new Runnable() {

					@Override
					public void run() {
						if(k2==false) {
							JOptionPane.showMessageDialog(null, "first start the automatic door system");
						}
						if(k2==true) {
							if(k1==true)
							text.setText("CURRENTLY CLOSING");
							else
								JOptionPane.showMessageDialog(null,"it is already close");
							f.setVisible(true);
							try {
								Thread.sleep(1000*main.delay);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							boolean m=k1;
							k1=false;
							k2=false;
							if(m==true) {
							     text.setText("EMERGENCY CLOSE");
							     new Mail1(i);
							     JOptionPane.showMessageDialog(null, "mail sent to faculty");
							}
						}
					}
					
				});
				tempThread.start();
			}
		});
		df.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i==1) {
					main.bool1=k1;
					main.bol1=k2;
				}
				if(i==2) {
					main.bool2=k1;
					main.bol2=k2;
				}
				if(i==3) {
					main.bool3=k1;
					main.bol3=k2;
				}
				if(i==4) {
					main.bool4=k1;
					main.bol4=k2;
				}
				new main();
				f.dispose();
			}
		});
		f.setVisible(true);
	}
}