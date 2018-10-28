import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.border.Border;
public class TubeLight extends JPanel{
	ImageIcon icon;
	ImageIcon icon2;
	ImageIcon icon3;
	int x;
	public int flag=0;
	ArrayList<String> Product=GetNames();
	public int i=Integer.parseInt(Product.get(6));
	JTextField NotificationInfo=new JTextField(Product.get(5));

	public JTextField Timer=new JTextField(Product.get(6)+ " Seconds");
	public JTextField Cost=new JTextField(Float.toString((i*Float.parseFloat(Product.get(2))*3)/360000)+ " RS");
	Timer timer2 = new Timer("MyTimer");//create a new Timer;
	TubeLight(final String IP)
	{
	
        final TimerTask timerTask2 = new TimerTask() {

            int flag2=0;
            @Override
            public void run() {
              //  System.out.println("TimerTask executing counter is: " + i);
                i=i+x;
                try {
					Thread.sleep(1000);
					Timer.setText(Integer.toString(i)+" Seconds");
					Cost.setText(Float.toString((i*Float.parseFloat(Product.get(2))*3)/360000)+ " RS");
					float lb=i*Float.parseFloat(Product.get(2))*3/360000;
					float sb=Float.parseFloat(NotificationInfo.getText());
					if(lb>=sb&&flag2==0)
					{
						EmailFrame f1=new EmailFrame();
						f1.setVisible(true);
						Thread.sleep(1000);
						f1.dispose();
							Email();
							flag2=1;
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        };

    
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
		x=0;
		timer2.scheduleAtFixedRate(timerTask2, 30, 1200);
			
		ActionListener al=new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				if(flag==0)
				{
					x=1;
					oo.setIcon(new ImageIcon("images/SwitchON.png"));
				oo.setRolloverIcon(new ImageIcon("images/SwitchON.png"));
				oo.setPressedIcon(new ImageIcon("images/SwitchON.png"));
				oo.setDisabledIcon(new ImageIcon("images/SwitchON.png"));
				flag=1;
				
				
				 
						
				try{      
					Socket s=new Socket(IP,6666);  
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
					dout.writeUTF("0");  
					dout.writeUTF("1");  
					dout.flush();  
					dout.close();  
					s.close();  
					}catch(Exception e){System.out.println(e);}  
				System.out.println(flag);
 				
				}
				else
				{
					  x=0;
					oo.setIcon(new ImageIcon("images/SwitchOFF.png"));
				oo.setRolloverIcon(new ImageIcon("images/SwitchOFF.png"));
				oo.setPressedIcon(new ImageIcon("images/SwitchOFF.png"));
				oo.setDisabledIcon(new ImageIcon("images/SwitchOFF.png"));
				flag=0;try{      
					Socket s=new Socket(IP,6666);  
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
				
					dout.writeUTF("0");  
					dout.writeUTF("0");

					dout.flush();  
					dout.close();  
					s.close();  
					}catch(Exception e){System.out.println(e);}  
				System.out.println(flag);}
			}
		};
		
		oo.addActionListener(al);
		
	setBounds(0, 0, 630, 450);
	setLayout(null);
	Button b1=new Button();
	add(oo);
	setBackground(new Color(246, 246, 246));
	JPanel info=new JPanel();
	JLabel Title =new JLabel("Light Control And Management");
	Title.setFont(new Font("Serif", Font.PLAIN, 25));
	Title.setBounds(155, 10, 340, 35);
	add(Title);
	Border blackline = BorderFactory.createLineBorder(Color.black);
	info.setBounds(40, 180, 270, 260);
	JPanel Current=new JPanel();
	Current.setBounds(330, 180, 270, 260);
	
	JPanel Notify=new JPanel();
	Notify.setBounds(250, 80, 350, 75);

	Notify.setBorder(blackline);
	Current.setBorder(blackline);
	info.setBorder(blackline);
	JLabel titleCurrent=new JLabel("Current Status");
	titleCurrent.setFont(new Font("Serif", Font.PLAIN, 15));
	
	JLabel titleNotify=new JLabel("Notification Options");
	titleNotify.setFont(new Font("Serif", Font.PLAIN, 15));
	titleNotify.setBounds(100, 0, 200, 25);
	JLabel jst=new JLabel("BIll Exceeds");
	jst.setBounds(10, 45, 200, 25);
	Notify.add(jst);
	JLabel titleinfo=new JLabel("Device Information");
	titleinfo.setBounds(75, 0, 200, 25);
	info.setLayout(null);
	titleinfo.setFont(new Font("Serif", Font.PLAIN, 15));
	JLabel ProductName=new JLabel(Product.get(0));
	JLabel ProductName2=new JLabel(Product.get(1));
	JLabel ProductName3=new JLabel("Power Rating : "+Product.get(2)+" Watts");
	JLabel ProductName4=new JLabel(Product.get(3));
	JLabel ProductName5=new JLabel(Product.get(4));
	Notify.setLayout(null);
	NotificationInfo.setBounds(120, 40,100, 30);
	ProductName.setBounds(10, 30, 200, 25);
	ProductName2.setBounds(10, 60, 200, 25);
	ProductName3.setBounds(10, 90, 200, 25);
	ProductName4.setBounds(10, 120, 200, 25);
	ProductName5.setBounds(10,150, 200, 25);
	info.add(ProductName);
	info.add(ProductName2);
	info.add(ProductName3);
	info.add(ProductName4);
	info.add(ProductName5);
	info.add(titleinfo);
	Notify.add(titleNotify);
	Notify.add(NotificationInfo);
	titleCurrent.setBounds(65, 0, 200, 30);
	Current.setLayout(null);
	Current.add(Timer);
	JLabel ttitle=new JLabel("Total Time : ");
	ttitle.setBounds(10, 39, 100, 30);
	Timer.setBounds(95, 39, 100, 30);
	Current.add(Cost);
	JLabel CostTitle=new JLabel("Current Cost : ");
	CostTitle.setBounds(10, 75, 100, 25);
	Cost.setBounds(95, 75, 100, 25);
	Current.add(titleCurrent);
	Current.add(CostTitle);
	Current.add(ttitle);
	add(Notify);
	add(Current);
	add(info);
	
	
	}public static ArrayList<String> GetNames()
	{
		int flag=0;
		ArrayList<String> Names=new ArrayList<String>();
		try
		{
			FileReader fr=new FileReader("Files/Tube.txt");
			int i;
			String s="";
			while((i=fr.read())!=-1)
			{
				if(i==13)
				{
				Names.add(s);
				s="";
				flag=1;
					}
			else{
				if(flag==1){
					flag=0;
					continue;}
				s=s+(char)i;
				}
			}
		}
		catch(Exception e){}
		return Names;
	}
	public void Email()
	{
		SendMailSSL obj=new SendMailSSL();
		obj.send("tnarain5@gmail.com", "NICHEbabysotahai", "kainths.2206@gmail.com","Alert Electricity Limit Reached" ,"Your Limitations for the Device Fan Has crossed the limits"+ Cost.getText());
	
	}
}
