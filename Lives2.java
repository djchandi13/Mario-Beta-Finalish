import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lives2 extends JPanel{
	
	JLabel scoreLabel;
	JLabel worldLabel;
	JLabel timeLabel;
	JLabel mario;
	JLabel livesLabel;
	public int score = 0;
	public int time = 300;
	public int numLives = 3;
	
	public Lives2()
	{
		setBackground(Color.BLACK);
		setLayout(null);
		
		scoreLabel = new JLabel("<html>Mario<br/><html>" + (String.valueOf(score)));
		scoreLabel.setBounds(new Rectangle(80,80));
		scoreLabel.setFont(new Font(String.valueOf(score), Font.BOLD, 20));
		scoreLabel.setForeground(Color.WHITE);
		scoreLabel.setLocation(200, 20);
		add(scoreLabel);
		
		worldLabel = new JLabel("<html>World<br/><html>" + "1-1");
		worldLabel.setBounds(new Rectangle(80,80));
		worldLabel.setFont(new Font("Default", Font.BOLD, 20));
		worldLabel.setForeground(Color.WHITE);
		worldLabel.setLocation(450, 20);
		add(worldLabel);
		
//		java.net.URL img = MainFrame.class.getResource("Super Mario.gif");
//		ImageIcon i = new ImageIcon(img);
//		mario = new JLabel(i);
//		mario.setBounds(new Rectangle(300,200,200,80));
//		add(mario);
		
		timeLabel = new JLabel("<html>Time<br/><html>" + (String.valueOf(time)));
		timeLabel.setBounds(new Rectangle(80,80));
		timeLabel.setFont(new Font(String.valueOf(time), Font.BOLD, 20));
		timeLabel.setForeground(Color.WHITE);
		timeLabel.setLocation(700, 20);
		add(timeLabel);
		
		livesLabel = new JLabel("X" + " " + (String.valueOf(numLives)));
		livesLabel.setBounds(new Rectangle(80,80));
		livesLabel.setFont(new Font(String.valueOf(numLives), Font.BOLD, 20));
		livesLabel.setForeground(Color.WHITE);
		livesLabel.setLocation(500,200);
		add(livesLabel);
	}
}