import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Bricks extends Blocks
{
	private BufferedImage brick;
	public Bricks()
	{
		super();
		try 
		 {
			  brick = ImageIO.read(Bricks.class.getResource("Brick.png"));
		 }
		 catch(IOException e) 
		 {
			 e.printStackTrace();
		 }
		try
		 {
			  brick = ResizeImage.resize(brick, .2);
		 }
		 catch(IOException e)
		 {
			 System.out.println("error with resize");
			 e.printStackTrace();
		 }
		//this.setBounds(x,y,brick.getWidth()+1,brick.getHeight()+1);
		this.setSize(brick.getWidth()+1,brick.getHeight()+1);
		this.setIcon(new ImageIcon(brick));
	}
	 
	public BufferedImage brickImg()
	 {
		 return brick;
	 }
	public int getHeight()
	{
		return brick.getHeight();
	}
}