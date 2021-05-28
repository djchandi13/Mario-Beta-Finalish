import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Final extends JFrame implements ActionListener
{

	private Mario mario;
	private BackGround img;
	private Timer time; 
	private Flag f; 

//	private Flagpole fp; 
//	private int flaggy; 
	
	public Final()
	{
		
		img = new BackGround();
		this.add(img);
		
//		mario = new Mario(150,200);
//		this.add(mario);
		
		time = new Timer(20,this);
		time.start();
		mario = img.mario();
		
		this.setSize(500, 260);
		this.setLocationRelativeTo(null);
		
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) 
			{
				
				
			}

			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_RIGHT)
				{
					if(!mario.getEnd()) {
						mario.setDx(4);
						mario.changeDirect("right");
						mario.running(true);
						mario.standing(false);
						}
						else {
							mario.changeMario("mario1end.png");
							
						}
				} 
				if(e.getKeyCode() == e.VK_LEFT)
				{
					if(!mario.getEnd()) {
						mario.setDx(-4);
						mario.changeDirect("left");
						mario.running(true);
						mario.standing(false);
						}
						else {
							mario.changeMario("mario1end.png");
							
						}
					
					
				}
				if(e.getKeyCode() == e.VK_UP)
				{
					Sounds.playJump();
					if(mario.getY() == 132)/*|| mario.getY() == 90 - mario.getH())  && !mario.getEnd())*/
					{
						mario.setDy(-15);
						mario.jumping(true);
						mario.standing(false);
						mario.running(false);
					}
					else {
						mario.changeMario("mario1end.png");
						
					}			
				}
				
				
			}

			@Override
			public void keyReleased(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_RIGHT)
				{
					
					img.mario().setDx(0);
					if(img.mario().getY()==132)
					{
						img.mario().standing(true);
						img.mario().running(false);
					}
					else {
						mario.changeMario("mario1end.png");
						
					}
					
				}
				if(e.getKeyCode() == e.VK_LEFT)
				{
					
					img.mario().setDx(0);
					if(img.mario().getY()==132)
					{
						img.mario().standing(true);
						img.mario().running(false);
					}
					else {
						mario.changeMario("mario1end.png");
						
					}		
				}
				
			}
			
		});
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		new Final();
		
	}




	@Override
	public void actionPerformed(ActionEvent e) 
	{
		img.mario().update();
		img.update();
		img.repaint();
		
		if(mario.getX() /*+ mario.getWidth()*/ >= 3655)
		{
			mario.end(true);
			mario.setDx(0);
			if(mario.getY() + mario.getHeight() > 250) 
			{
				mario.setDy(0);
;
				if (img.getFlag().getY() < 200)
				{
					f.setDy(4);
					img.setFlagH(4);
					//System.out.println("hi");
					img.repaint();
					img.update();
				}
			}
			else {
				mario.setDy(4);
			}
			mario.changeMario("mario1end.png");
			repaint();
			
		}
	}
	
	

}