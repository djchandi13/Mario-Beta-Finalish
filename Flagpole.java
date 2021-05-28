import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Flagpole extends Blocks
{
	private BufferedImage flagpole;
	public Flagpole()
	{
		super();
		try 
		 {
			flagpole = ImageIO.read(Flagpole.class.getResource("flagpole.png"));
		 }
		 catch(IOException e) 
		 {
			 e.printStackTrace();
		 }
		try
		 {
			flagpole = ResizeImage.resize(flagpole, .3);
		 }
		 catch(IOException e)
		 {
			 System.out.println("error with resize");
			 e.printStackTrace();
		 }
		this.setSize(flagpole.getWidth(),flagpole.getHeight());
		this.setIcon(new ImageIcon(flagpole));
		
		//If contact with Mario
		
		
	}
	 public BufferedImage fpImg()
	 {
		 return flagpole;
	 }
}