import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BackGround extends JPanel
{

	private int dx;
	//private BufferedImage img;
	private Image img; 
	private Timer time;
	private Mario mario;
	private Flag f; 
	private Flagpole fp; 
	private Bricks b; 
	
	public BackGround()
	{
		
//		try{
//			img = ImageIO.read(Board.class.getResource("BkgrdShort1.png")); 
//		}
//		catch(IOException e){
//			e.printStackTrace(); 
//		}
//		this.setIcon(new ImageIcon(img));
		
		ImageIcon i = new ImageIcon("src/BkgrdShort1.png");
		img = i.getImage();
		dx = 0;
		mario = new Mario();
		f = new Flag();
		fp = new Flagpole(); 
		b = new Bricks(); 
		//this.add(mario);
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g; 
		
		g2d.drawImage(img, 485 - mario.getnx2(), 0, this); //Background
		g2d.drawImage(mario.marioImg(), mario.getleft(), mario.getY(), this); //Mario
		g2d.drawImage(fp.fpImg(), 2085 - mario.getfpx(), 10, this); //Flagpole
		g2d.drawImage(f.fImg(), 2040 - mario.getfpx(), 30, this); //Flag
		
		int x0 = 500; 
		int x1 = 660;
		int x2 = 1200;
		int x3 = 1360;
		int x4 = 1500; 
		
		for(int i = 0; i<3; i++) 
		{ 
			g2d.drawImage(b.brickImg(), x0 - mario.getfpx(), 90, this);
			x0+= b.brickImg().getWidth()-1;
		}

		for(int i = 0; i<5; i++) 
		{ 
			g2d.drawImage(b.brickImg(), x1 - mario.getfpx(), 90, this);
			x1+= b.brickImg().getWidth()-1;
		}
		
		for(int i = 0; i<4; i++) 
		{ 
			g2d.drawImage(b.brickImg(), x2 - mario.getfpx(), 90, this);
			x2+= b.brickImg().getWidth()-1;
		}
		for(int i = 0; i<2; i++) 
		{ 
			g2d.drawImage(b.brickImg(), x3 - mario.getfpx(), 90, this);
			x3+= b.brickImg().getWidth()-1;
		}
		for(int i = 0; i<2; i++) 
		{ 
			g2d.drawImage(b.brickImg(), x4 - mario.getfpx(), 90, this);
			x4+= b.brickImg().getWidth()-1;
		}
		
		g2d.drawImage(b.brickImg(), 1700 - mario.getfpx(), 90, this);
		g2d.drawImage(b.brickImg(), 1800 - mario.getfpx(), 90, this);
		g2d.drawImage(b.brickImg(), 1900 - mario.getfpx(), 90, this);
		g2d.drawImage(b.brickImg(), 2000 - mario.getfpx(), 90, this);
	}
	
	public void setDx(int x)
	{
		dx = x;
	}

	public void update()
	{
		setLocation(getX()+dx, getY());
		
		
	}
	
	public Mario mario()
	{
		return mario;
	}
	public void setFlagH(int a)
	{
		f.setFlagHeight(a);
	}
	public Flag getFlag()
	{
		return f;
	}
	public Flagpole getFlagpole()
	{
		return fp;
	}
}