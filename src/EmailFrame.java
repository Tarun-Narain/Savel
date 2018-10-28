import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;
public class EmailFrame extends JFrame{
	
	EmailFrame()
	{
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
	this.setBounds(600, 200, 300,280);
	this.setUndecorated(true);
	this.getRootPane().setBorder(blackline);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel l1=new JLabel("Sending Email Notification");
this.add(l1);
	}

}
