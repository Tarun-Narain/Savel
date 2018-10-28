import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PanelBuilder3 {
	JPanel panel=new JPanel();
	Button Buttons=new Button();
	public static JPanel MainPanel=new JPanel();
	final JButton Fan=Buttons.GetFan();
	final JButton ViewRecords=Buttons.GetViewR();
	final JButton TubeLight=Buttons.GetTube();
	final JButton AddNewDevice=Buttons.GetAdd();
	final JButton Home=Buttons.GetHome();
	final JButton Charger=Buttons.GetCharger();
	
	final HomePanel hp=new HomePanel();
	String IP="192.168.43.67";
	final CPanel cp=new CPanel(IP);
	final FanPanel Fp=new FanPanel(IP);
	final TubeLight Tl=new TubeLight(IP);
	final Record rc=new Record();
	public JPanel GetMain()
	{
		MainPanel.setBounds(210, 60,630, 450);
		MainPanel.add(Fp);
		MainPanel.add(Tl);
		MainPanel.add(rc);
		MainPanel.add(cp);
		CleanAll();
		MainPanel.add(hp);
		
		hp.setVisible(true);
		MainPanel.setLayout(null);
		
		ActionListener FanAppear=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				Fp.setVisible(true);
			}
		};
		Fan.addActionListener(FanAppear);
		
		ActionListener Charge=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				cp.setVisible(true);
			}
		};
		Charger.addActionListener(Charge);
			
		ActionListener TubeAppear=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				Tl.setVisible(true);
			}
		};
		TubeLight.addActionListener(TubeAppear);

		ActionListener GHome=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				hp.setVisible(true);
			}
		};
		Home.addActionListener(GHome);
		
			
		ActionListener recorder=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				System.out.println("Pressed");
				rc.setVisible(true);
			}
		};
		ViewRecords.addActionListener(recorder);
		/*
		ActionListener Smail=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				SMail.setVisible(true);
			}
		};
		SendEmail.addActionListener(Smail);
		
		
		ActionListener Smessage=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				SendMessagePanel.setVisible(true);
			}
		};
		SendMessage.addActionListener(Smessage);
		ActionListener AddingTest=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				ATest.setVisible(true);
			}
		};
		AddTest.addActionListener(AddingTest);
		*/
		return MainPanel;
	}	
	
	public JPanel GetSide()
	{
		panel.setBounds(0, 0, 200, 600);
		panel.setBackground(new Color(0.2f, 0.2f, 0.2f,1.0f));
		panel.add(Fan);
	panel.add(TubeLight);
		//panel.add(Charger);
		panel.add(AddNewDevice);
		panel.add(Home);
		panel.add(Charger);
		panel.add(ViewRecords);
		
		panel.setLayout(null);
		return panel;
	}
	
	public JPanel GetTop()
	{
		JPanel TopPanel=new JPanel();
		TopPanel.setBounds(0,0,850, 50);
		TopPanel.setBackground(new Color(0.2f, 0.2f, 0.2f,1.0f));
		return TopPanel;
	}
	
	public JPanel GetBottom()
	{
		JPanel BottomPanel=new JPanel();
		BottomPanel.setBounds(0,520, 850, 40 );
		BottomPanel.setBackground(new Color(0.2f, 0.2f, 0.2f,1.0f));
		return BottomPanel;
	}
	public void CleanAll()
	{
		Fp.setVisible(false);
		Tl.setVisible(false);
		hp.setVisible(false);
		rc.setVisible(false);
		cp.setVisible(false);
	}
}
