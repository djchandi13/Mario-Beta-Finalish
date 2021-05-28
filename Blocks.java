import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

 
public class Blocks extends JLabel
{
	int dx,dy;

	public Blocks()
	{
		dx = 0;
		dy = 0;
	}

	public void setDx(int x)
	{
		dx = x;
	}

	public int getDx()
	{
		return dx;
	}

	public void setDy(int y)
	{
		dy = y;
	}

	public int getDy()
	{
		return dy;
	}
}