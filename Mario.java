import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Mario extends JLabel
{

	 private int x, y, dx, dy, nx2, left, fy, fpx;
	 private BufferedImage mario;
//	 private Timer t;
	 private int count;
	 private boolean jump;
	 private boolean run;
	 private boolean stand;
	 private boolean a; 
	 private boolean end; 
	 private boolean top; 
	 private String direct;
	 private int grav;
	
	 
	 
	 public Mario()
	 {
		 
		 try 
		 {
			  mario = ImageIO.read(Mario.class.getResource("mario1.png"));
		 }
		 catch(IOException e) 
		 {
			 e.printStackTrace();
		 }
//		 try
//		 {
//			 mario = ResizeImage.resize(mario, .3);
//		 }
//		 catch(IOException e)
//		 {
//			 System.out.println("error with resize");
//			 e.printStackTrace();
//		 }
		 
		 this.setSize(mario.getWidth()+1,mario.getHeight()+1);
		 this.setIcon(new ImageIcon(mario));
		 
		 dx = 0;
		 dy = 0;
		 count = 0;
		 jump = false;
		 run = false;
		 stand = true;
		 a = true; 
		 end = false; 
		 top = false; 
		 direct = "right";
		 grav = 1;
		 x = 75;
		 y = 132;
		 nx2 = 685;
		 left = 150; 
		 fpx = 60;
		 fy = 30; 
		 
		 
	 }
	 
	 public void setDx(int num)
	 {
		 dx = num;
	 }
		
	 public void setDy(int num)
	 {
		 dy = num;
	 }
		
	 public void update()
	 {
		 y = y + dy;
		 x = x + dx;
		 if(x >= 3600)
			 a = false; 
		 
		 if(getY() > 132)
		 {
			 y = 132;
			 dy = 0;
			 jumping(false);
			 if(dx != 0)
			 {
				 running(true);
				 standing(false);
			 }
			 else
			 {
				 running(false);
				 standing(true);
			 }
		 }
		 
		 if(dx != -4 && x <= 3600 && a)
		 {
			 if(left + dx <= 240)
				 left = left + dx;
			 else 
			 {
				 x = x + dx;
				 nx2 = nx2+ dx; 
				 fpx = fpx + dx;
			 }
		 }
		 else 
		 {
		 if(left + dx > 0)
			 left = left + dx; 
		 }
		 /*if(getX() >= 680 && getX() <= 743 && getY()<90)
		 {
			 y = 90 - getH();
			 dy = 0;
			 jumping(false);
			 if(dx != 0)
			 {
				 running(true);
				 standing(false);
			 }
			 else
			 {
				 running(false);
				 standing(true);
			 }
			 
		 }*/
		 
		//System.out.println(getX() + " " + dx + " " + count + " " + getY());
		 if(stand && direct.equals("right"))
		 {
			 try 
			 {
				  mario = ImageIO.read(Mario.class.getResource("mario1.png"));
			 }
			 catch(IOException e) 
			 {
				 e.printStackTrace();
			 }
			 this.setIcon(new ImageIcon(mario)); 
		 }
		 else if(stand && direct.equals("left"))
		 {
			 try 
			 {
				  mario = ImageIO.read(Mario.class.getResource("mario1_left.png"));
			 }
			 catch(IOException e) 
			 {
				 e.printStackTrace();
			 }
			 this.setIcon(new ImageIcon(mario));
		 }
		 else if(jump && direct.equals("right"))
		 {
			 try 
			 {
				  mario = ImageIO.read(Mario.class.getResource("mario1_jump_right.png"));
			 }
			 catch(IOException e) 
			 {
				 e.printStackTrace();
			 }
//			 try
//			 {
//				 mario = ResizeImage.resize(mario, .3);
//			 }
//			 catch(IOException e)
//			 {
//				 System.out.println("error with resize");
//				 e.printStackTrace();
//			 }
			 this.setIcon(new ImageIcon(mario));
			 dy = dy + grav;
			 
		 }
		 else if(jump && direct.equals("left"))
		 {
			 try 
			 {
				  mario = ImageIO.read(Mario.class.getResource("mario1_jump_left.png"));
			 }
			 catch(IOException e) 
			 {
				 e.printStackTrace();
			 }
//			 try
//			 {
//				 mario = ResizeImage.resize(mario, .3);
//			 }
//			 catch(IOException e)
//			 {
//				 System.out.println("error with resize");
//				 e.printStackTrace();
//			 }
			 this.setIcon(new ImageIcon(mario));
			 dy = dy + grav;
		 }
		 else if(run && direct.equals("right"))
		 {
//			 try
//			 {
//				 mario = ResizeImage.resize(mario, .3);
//			 }
//			 catch(IOException e)
//			 {
//				 System.out.println("error with resize");
//				 e.printStackTrace();
//			 }
			 if(count % 11 == 0)
			 {
				 try 
				 {
					  mario = ImageIO.read(Mario.class.getResource("mario1_move0_right.png"));
				 }
				 catch(IOException ex) 
				 {
					 ex.printStackTrace();
				 }
				 
			 }
			 else if(count % 11 == 4)
			 {
				 try 
				 {
					  mario = ImageIO.read(Mario.class.getResource("mario1_move1_right.png"));
				 }
				 catch(IOException ex) 
				 {
					 ex.printStackTrace();
				 }
				 
			 }
			 else if(count % 11 == 8)
			 {
				 try 
				 {
					  mario = ImageIO.read(Mario.class.getResource("mario1_move2_right.png"));
				 }
				 catch(IOException ex) 
				 {
					 ex.printStackTrace();
				 }
				 
			 }
			 count++;

			 this.setIcon(new ImageIcon(mario));
		 }
		 else if(run && direct.equals("left"))
		 {
//			 try
//			 {
//				 mario = ResizeImage.resize(mario, .3);
//			 }
//			 catch(IOException e)
//			 {
//				 System.out.println("error with resize");
//				 e.printStackTrace();
//			 }
			 if(count % 11 == 0)
			 {
				 try 
				 {
					  mario = ImageIO.read(Mario.class.getResource("mario1_move0_left.png"));
				 }
				 catch(IOException ex) 
				 {
					 ex.printStackTrace();
				 }
				 
			 }
			 else if(count % 11 == 4)
			 {
				 try 
				 {
					  mario = ImageIO.read(Mario.class.getResource("mario1_move1_left.png"));
				 }
				 catch(IOException ex) 
				 {
					 ex.printStackTrace();
				 }
				 
			 }
			 else if(count % 11 == 8)
			 {
				 try 
				 {
					  mario = ImageIO.read(Mario.class.getResource("mario1_move2_left.png"));
				 }
				 catch(IOException ex) 
				 {
					 ex.printStackTrace();
				 }
				 
			 }
			 count++;
			 this.setIcon(new ImageIcon(mario));
			 
		 }
	 }
	 
	 
	 public void jumping(boolean b)
	 {
		 jump = b;
	 }
	 
	 public void standing(boolean b)
	 {
		 stand = b;
	 }
	 
	 public void running(boolean b)
	 {
		 run = b;
	 }
	 public void end(boolean b)
	 {
		 end = b;
	 }
	 public boolean getEnd()
	 {
		 return end; 
	 }
	 public void changeDirect(String str)
	 {
		 direct = str;
	 }	
	
	 public BufferedImage marioImg()
	 {
		 return mario;
	 }
	 public void changeMario(String type)
	 {
		 try 
		 {
			  mario = ImageIO.read(Mario.class.getResource(type));
		 }
		 catch(IOException e) 
		 {
			 e.printStackTrace();
		 }
		 this.setIcon(new ImageIcon(mario));
	 }
	 public int getX()
	 {
		 return x;
	 }
		
	 public int getY()
	 {
		 return y;
	 }
	 public int getH()
	 {
		 return mario.getHeight();
	 }
	 public int getnx2()
	 {
		 return nx2;
	 }
	 public int getleft()
	 {
		 return left;
	 }
	 public int getfpx()
	 {
		 return fpx;
	 }
	 public int getfy()
	 {
		 
		 return fy;
	 }
}