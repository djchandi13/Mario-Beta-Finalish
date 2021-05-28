import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Title extends JPanel {
	
	private JLabel titleLabel;
	
	public Title()
	{
		java.net.URL imageURL2 = Mainframe.class.getResource("Title Screen.PNG");
		ImageIcon l = new ImageIcon(imageURL2);
		titleLabel = new JLabel(l, JLabel.CENTER);
		
		add(titleLabel);
	}
}