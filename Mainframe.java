import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Mainframe{

	private JFrame main;
	private boolean start; 
	private Timer t; 
	public int count = 0;
	TitleScreenHandler h = new TitleScreenHandler();
	
	
	public Mainframe()
	{
		main = new JFrame("Super Mario Bros");
		main.addKeyListener(h);
		JPanel titlePanel = new Title();
		main.getContentPane().add(titlePanel);
		
		main.setSize(950,650);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		start = false; 
	}
	
	public void createLivesScreen()
	{
		main.getContentPane().removeAll();
		JPanel livesPanel = new Lives2();
		main.getContentPane().add(livesPanel);
		main.setVisible(true);
	}
	
	public void startGame()
	{
		main.getContentPane().removeAll();
		new Final(); 
		//main.getContentPane().add(test);
		main.setVisible(true);
	}
//	
//	public void endGame()
//	{
//		main.getContentPane().removeAll();
//		JPanel end = new EndGame();
//		main.getContentPane().add(end);
//		main.setVisible(true);
//	}

	public static void main(String[] args) {
		
		new Mainframe();
	}
	
	public class TitleScreenHandler implements KeyListener { 

		@Override
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyCode() == e.VK_SPACE && count == 0)
			{
				start =  true; 
				//Sounds.playStart();
				createLivesScreen();
				
				int delay = 3000; 
				t =  new Timer(delay, new ActionListener() {
				public void actionPerformed
				(ActionEvent e) {
					//Sounds.playSoundTrack();
					startGame();} 
					
				
				});
				t.start();
				
			}
			count++;
			//t.stop(); 
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	}
}