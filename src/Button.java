
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Button {
	public static JButton CielingFan=new JButton();
	public static JButton TubeLight=new JButton();
	public static JButton Charger=new JButton();
	public static JButton ViewRecords=new JButton();
	public static JButton AddNewDevice=new JButton();
	public static JButton Home=new JButton();
	ImageIcon icon;
	ImageIcon icon2;
	ImageIcon icon3;
	public int flag=0;
	
	public JButton GetFan()
	{
		icon=new ImageIcon("images/CielingFan.png");
		icon2=new ImageIcon("images/CielingFan2.png");
		icon3=new ImageIcon("images/CielingFan3.png");
		
			CielingFan.setBounds(0, 170, 200, 50);
			CielingFan.setBorderPainted(false);
			CielingFan.setBorder(null);
			CielingFan.setMargin(new Insets(0, 0, 0, 0));
			CielingFan.setContentAreaFilled(false);
			CielingFan.setIcon(icon);
			CielingFan.setRolloverIcon(icon2);
			CielingFan.setPressedIcon(icon3);
			CielingFan.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				CielingFan.setIcon(new ImageIcon("images/CielingFan3.png"));
				CielingFan.setRolloverIcon(new ImageIcon("images/CielingFan3.png"));
			}
		};
		
		CielingFan.addActionListener(al);
		return CielingFan;
	}
	public JButton GetCharger()
	{
		icon=new ImageIcon("images/charger.png");
		icon2=new ImageIcon("images/charger2.png");
		icon3=new ImageIcon("images/charger3.png");
		
			Charger.setBounds(0, 270, 200, 50);
			Charger.setBorderPainted(false);
			Charger.setBorder(null);
			Charger.setMargin(new Insets(0, 0, 0, 0));
			Charger.setContentAreaFilled(false);
			Charger.setIcon(icon);
			Charger.setRolloverIcon(icon2);
			Charger.setPressedIcon(icon3);
			Charger.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				Charger.setIcon(new ImageIcon("images/charger3.png"));
				Charger.setRolloverIcon(new ImageIcon("images/charger3.png"));
			}
		};
		
		Charger.addActionListener(al);
		return Charger;
	}
	
	public JButton GetViewR()
	{
		icon=new ImageIcon("images/ViewRecords.png");
		icon2=new ImageIcon("images/ViewRecords2.png");
		icon3=new ImageIcon("images/ViewRecords3.png");
		
		ViewRecords.setBounds(0, 370, 200, 50);
		ViewRecords.setBorderPainted(false);
		ViewRecords.setBorder(null);
		ViewRecords.setMargin(new Insets(0, 0, 0, 0));
		ViewRecords.setContentAreaFilled(false);
		ViewRecords.setIcon(icon);
		ViewRecords.setRolloverIcon(icon2);
		ViewRecords.setPressedIcon(icon3);
		ViewRecords.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				ViewRecords.setIcon(new ImageIcon("images/ViewRecords3.png"));
				ViewRecords.setRolloverIcon(new ImageIcon("images/ViewRecords3.png"));
			}
		};
		
		ViewRecords.addActionListener(al);
		return ViewRecords;
	}
	
	
	
	public JButton GetHome()
	{
		icon=new ImageIcon("images/Home.png");
		icon2=new ImageIcon("images/Home2.png");
		icon3=new ImageIcon("images/Home3.png");
		
			Home.setBounds(0, 120, 200, 50);
			Home.setBorderPainted(false);
			Home.setBorder(null);
			Home.setMargin(new Insets(0, 0, 0, 0));
			Home.setContentAreaFilled(false);
			Home.setIcon(icon);
			Home.setRolloverIcon(icon2);
			Home.setPressedIcon(icon3);
		Home.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
			ResetAll();
				System.out.println("PressedHome");
				Home.setIcon(new ImageIcon("images/Home3.png"));
			Home.setRolloverIcon(new ImageIcon("images/Home3.png"));
			}
		};
		
		Home.addActionListener(al);
		return Home;
	}
	
	public JButton GetAdd()
	{
		icon=new ImageIcon("images/AddNewDevice.png");
		icon2=new ImageIcon("images/AddNewDevice2.png");
		icon3=new ImageIcon("images/AddNewDevice3.png");
		
		AddNewDevice.setBounds(0, 320, 200, 50);
		AddNewDevice.setBorderPainted(false);
		AddNewDevice.setBorder(null);
		AddNewDevice.setMargin(new Insets(0, 0, 0, 0));
		AddNewDevice.setContentAreaFilled(false);
		AddNewDevice.setIcon(icon);
		AddNewDevice.setRolloverIcon(icon2);
		AddNewDevice.setPressedIcon(icon3);
		AddNewDevice.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				AddNewDevice.setIcon(new ImageIcon("images/AddNewDevice3.png"));
				AddNewDevice.setRolloverIcon(new ImageIcon("images/AddNewDevice3.png"));
			}
		};
		
		AddNewDevice.addActionListener(al);
		return AddNewDevice;
	}
	public JButton GetTube()
	{
		icon=new ImageIcon("images/TubeLight.png");
		icon2=new ImageIcon("images/TubeLight2.png");
		icon3=new ImageIcon("images/TubeLight3.png");
		
		TubeLight.setBounds(0, 220, 200, 50);
		TubeLight.setBorderPainted(false);
		TubeLight.setBorder(null);
		TubeLight.setMargin(new Insets(0, 0, 0, 0));
		TubeLight.setContentAreaFilled(false);
		TubeLight.setIcon(icon);
		TubeLight.setRolloverIcon(icon2);
		TubeLight.setPressedIcon(icon3);
		TubeLight.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				TubeLight.setIcon(new ImageIcon("images/TubeLight3.png"));
				TubeLight.setRolloverIcon(new ImageIcon("images/TubeLight3.png"));
			}
		};
		
		TubeLight.addActionListener(al);
		return TubeLight;
	}
	public JButton GetClose()
	{
		icon=new ImageIcon("images/cross2.png");
		icon2=new ImageIcon("images/cross.png");
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon2);
		log.setRolloverIcon(icon);
		log.setPressedIcon(icon);
		log.setDisabledIcon(icon);
		
		return log;
	}
	
	public JButton GetBack()
	{
		icon=new ImageIcon("images/back2.png");
		icon2=new ImageIcon("images/back.png");
		icon3=new ImageIcon("images/back3.png");
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon2);
		log.setRolloverIcon(icon);
		log.setPressedIcon(icon);
		log.setDisabledIcon(icon);
		return log;
	}
	
	public JButton GetLogin()
	{
		 icon=new ImageIcon("images/login1.jpg");
		 icon2=new ImageIcon("images/login2.jpg");
	 icon3=new ImageIcon("images/login3.jpg");
		
		
		JButton log3=new JButton();
		log3.setBorderPainted(false);
		log3.setBorder(null);
		log3.setMargin(new Insets(0, 0, 0, 0));
		log3.setContentAreaFilled(false);
		log3.setIcon(icon);
		log3.setOpaque(false);
		log3.setRolloverIcon(icon2);
		log3.setPressedIcon(icon3);
		log3.setDisabledIcon(icon);
		return log3;
	}
	
	public JButton GetSave()
	{
		 icon=new ImageIcon("images/save1.jpg");
		 icon2=new ImageIcon("images/save2.jpg");
	 icon3=new ImageIcon("images/save3.jpg");
		
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon);
		log.setOpaque(false);
		log.setRolloverIcon(icon2);
		log.setPressedIcon(icon3);
		log.setDisabledIcon(icon);
		return log;
	}
	public JButton GetSet()
	{
		icon=new ImageIcon("images/sup1.jpg");
		 icon2=new ImageIcon("images/sup2.jpg");
	 icon3=new ImageIcon("images/sup3.jpg");
		
		
		JButton log2=new JButton();
		log2.setBorderPainted(false);
		log2.setBorder(null);
		log2.setMargin(new Insets(0, 0, 0, 0));
		log2.setContentAreaFilled(false);
		log2.setIcon(icon);
		log2.setOpaque(false);
		log2.setRolloverIcon(icon2);
		log2.setPressedIcon(icon3);
		log2.setDisabledIcon(icon);
		return log2;
	}
	public JButton GetONOFF()
	{
	 final JButton oo=new JButton();
	 icon=new ImageIcon("images/SwitchOFF.png");
	 icon2=new ImageIcon("images/SwitchON.png");
 icon3=new ImageIcon("images/SwitchOFF.png");
	
	oo.setBounds(35, 75, 195, 95);
	oo.setBorderPainted(false);
	oo.setMargin(new Insets(0, 0, 0, 0));
	oo.setContentAreaFilled(false);
	oo.setIcon(icon);
	oo.setOpaque(false);
	oo.setRolloverIcon(icon);
	oo.setPressedIcon(icon);
	oo.setDisabledIcon(icon);
	oo.setBorder(null);
	
	ActionListener al=new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0) {
			if(flag==0)
			{
				oo.setIcon(new ImageIcon("images/SwitchON.png"));
			oo.setRolloverIcon(new ImageIcon("images/SwitchON.png"));
			oo.setPressedIcon(new ImageIcon("images/SwitchON.png"));
			oo.setDisabledIcon(new ImageIcon("images/SwitchON.png"));
			flag=1;
			System.out.println(flag);
			
			}
			else
			{oo.setIcon(new ImageIcon("images/SwitchOFF.png"));
			oo.setRolloverIcon(new ImageIcon("images/SwitchOFF.png"));
			oo.setPressedIcon(new ImageIcon("images/SwitchOFF.png"));
			oo.setDisabledIcon(new ImageIcon("images/SwitchOFF.png"));
			flag=0;
			System.out.println(flag);}
		}
	};
	
	oo.addActionListener(al);
		return oo;
	}
	public void ResetAll()
	{
		CielingFan.setIcon(new ImageIcon("images/CielingFan.png"));
		CielingFan.setRolloverIcon(new ImageIcon("images/CielingFan2.png"));
		TubeLight.setIcon(new ImageIcon("images/TubeLight.png"));
		TubeLight.setRolloverIcon(new ImageIcon("images/TubeLight2.png"));
		Charger.setIcon(new ImageIcon("images/Charger.png"));
		Charger.setRolloverIcon(new ImageIcon("images/Charger2.png"));
		ViewRecords.setIcon(new ImageIcon("images/ViewRecords.png"));
		ViewRecords.setRolloverIcon(new ImageIcon("images/ViewRecords2.png"));
		AddNewDevice.setIcon(new ImageIcon("images/AddNewDevice.png"));
		AddNewDevice.setRolloverIcon(new ImageIcon("images/AddNewDevice2.png"));
		Home.setIcon(new ImageIcon("images/Home.png"));
		Home.setRolloverIcon(new ImageIcon("images/Home2.png"));
		}
}
