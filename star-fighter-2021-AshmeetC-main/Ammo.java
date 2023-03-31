//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   speed =s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.blue);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move( String direction )
	{
		if(direction.equals("UP")){
			setY(getY()-speed);
		}
		else if(direction.equals("DOWN")){
			setY(getY()+speed);
		}
		else if(direction.equals("LEFT")){
			setX(getX()-speed);
		}
		else if(direction.equals("RIGHT")){
			setX(getX()+speed);
		}
	}

	public String toString()
	{
		return "";
	}
}
