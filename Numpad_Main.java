import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JButton;;

public class Numpad_Main extends JFrame implements ActionListener
{
	static Numpad_Main gui;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,minus,plus,div,mul;
	public  Numpad_Main(){
		
		super("Col.PK's Numpad");
		setLayout(new FlowLayout());
		b1 = new JButton("1");
		b1.setPreferredSize(new Dimension(100,70));
		add(b1);
		
		b2 = new JButton("2");
		b2.setPreferredSize(new Dimension(100,70));
		add(b2);
		
		b3 = new JButton("3");
		b3.setPreferredSize(new Dimension(100,70));
		add(b3);
		
		b4 = new JButton("4");
		b4.setPreferredSize(new Dimension(100,70));
		add(b4);
		
		b5 = new JButton("5");
		b5.setPreferredSize(new Dimension(100,70));
		add(b5);
		
		b6 = new JButton("6");
		b6.setPreferredSize(new Dimension(100,70));
		add(b6);
		
		b7 = new JButton("7");
		b7.setPreferredSize(new Dimension(100,70));
		add(b7);
		
		b8 = new JButton("8");
		b8.setPreferredSize(new Dimension(100,70));
		add(b8);
		
		b9 = new JButton("9");
		b9.setPreferredSize(new Dimension(100,70));
		add(b9);
		
		b0 = new JButton("0");
		b0.setPreferredSize(new Dimension(100,70));
		add(b0);
		//
		minus = new JButton("-");
		minus.setPreferredSize(new Dimension(100,70));
		add(minus);
		plus = new JButton("+");
		plus.setPreferredSize(new Dimension(100,70));
		add(plus);
		
		div = new JButton("/");
		div.setPreferredSize(new Dimension(100,70));
		add(div);
		
		mul = new JButton("X");
		mul.setPreferredSize(new Dimension(100,70));
		add(mul);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		b9.addActionListener(this);
		
	}
	
	public static void main(String args[]){
		
		gui = new Numpad_Main();
		gui.setSize(350, 410);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setAlwaysOnTop(true);
		gui.setFocusableWindowState(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			
		if(e.getSource()==b0){
		java.awt.Robot r = new java.awt.Robot();
		gui.setFocusableWindowState(false);
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
			
		}
		
		if(e.getSource()==b1){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_1);
			r.keyRelease(KeyEvent.VK_1);
				
			}
		if(e.getSource()==b2){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
				
			}
		if(e.getSource()==b3){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
				
			}
		if(e.getSource()==b4){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_4);
			r.keyRelease(KeyEvent.VK_4);
				
			}
		if(e.getSource()==b5){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_5);
			r.keyRelease(KeyEvent.VK_5);
				
			}
		if(e.getSource()==b6){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_6);
			r.keyRelease(KeyEvent.VK_6);
				
			}
		if(e.getSource()==b7){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_7);
			r.keyRelease(KeyEvent.VK_7);
				
			}
		if(e.getSource()==b8){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_8);
			r.keyRelease(KeyEvent.VK_8);
				
			}
		if(e.getSource()==b9){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
				
			}
		if(e.getSource()==plus){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_ADD);
			r.keyRelease(KeyEvent.VK_ADD);
				
			}
		if(e.getSource()==minus){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_MINUS);
				
			}
		if(e.getSource()==div){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_DIVIDE);
			r.keyRelease(KeyEvent.VK_DIVIDE);
				
			}
		if(e.getSource()==mul){
			java.awt.Robot r = new java.awt.Robot();
			gui.setFocusableWindowState(false);
			r.keyPress(KeyEvent.VK_MULTIPLY);
			r.keyRelease(KeyEvent.VK_MULTIPLY);
				
			}
		
		}
		catch(Exception ea){ea.printStackTrace();}
}
}
