import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResizeImage //help from https://www.codejava.net/java-se/graphics/how-to-resize-images-in-java
{

	public static BufferedImage resize(BufferedImage image, int imageWidth, int imageHeight) throws IOException
	{

		BufferedImage outputImage = new BufferedImage(imageWidth, imageHeight, image.getType());
		Graphics2D g2d = outputImage.createGraphics();
		g2d.drawImage(image, 0, 0, imageWidth, imageHeight, null);
		g2d.dispose();
		
//		String formatName = newImageName.substring(newImageName.lastIndexOf(".")+1);
//		ImageIO.write(outputImage, formatName, new File(newImageName));
//		BufferedImage b = ImageIO.read(ResizeImage.class.getResource(newImageName));
		return outputImage;
		
	} 
	
	public static BufferedImage resize(BufferedImage image, double percent) throws IOException
	{
		
		int width = (int)(image.getWidth() * percent);
		int height = (int)(image.getHeight() * percent);
		return resize(image, width, height);
				
	}
	
	
}