import javax.swing.*;
public class HomePanel extends JPanel{

ImageIcon j1=new ImageIcon("images/main.png");
JLabel img=new JLabel(j1);
		HomePanel()
		{
			setBounds(0, 0, 630, 450);
			img.setBounds(0, 0,630, 450);
			add(img);
			
		}
}
