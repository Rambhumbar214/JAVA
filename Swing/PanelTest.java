package Swing;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	public class PanelTest extends JFrame
	{
	// JButton
	private JButton b, b1, b2;
	// Label to display text
	private JLabel l;
	public PanelTest()
	{
	// Creating a label to display text
	l = new JLabel("panel label");
	// Creating a new buttons
	b = new JButton("button1");
	b1 = new JButton("button2");
	b2 = new JButton("button3");
	// Creating a panel to add buttons
	JPanel p = new JPanel();
	// Adding buttons and textfield to panel
	// using add() method
	p.add(b);
	p.add(b1);
	p.add(b2);
	p.add(l);
	// setbackground of panel
	p.setBackground(Color.red);
	// Adding panel to frame
	add(p);
	// Setting the size of frame
	setSize(300, 300);
	show();
	}
	public static void main(String[] args)
	{

	PanelTest p = new PanelTest();
	}
}
