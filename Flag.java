import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Flag extends Blocks
{
	private BufferedImage flag;
	private int x, y;
	
	public Flag()
	{
		super();
		try 
		 {
			flag = ImageIO.read(Flagpole.class.getResource("flag.png"));
		 }
		 catch(IOException e) 
		 {
			 e.printStackTrace();
		 }
		try
		 {
			flag = ResizeImage.resize(flag, .3);
		 }
		 catch(IOException e)
		 {
			 System.out.println("error with resize");
			 e.printStackTrace();
		 }
		this.setSize(flag.getWidth(),flag.getWidth());
		this.setIcon(new ImageIcon(flag));
		
		y = 0; 
	}
	
	public void setFlagHeight(int a)
	{
		y+=4;
		setLocation(x, y);
		
		
	}
	
//	public static void main(String[] args)
//	{
//		
//	}
	public int getY()
	{
		return y;
	}
//	public void setDy()
//	{
//		return dy;
//	}
	 public BufferedImage fImg()
	 {
		 return flag;
	 }

}