//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;
	static int delay;
	public Bullets()
	{
		ammo = new ArrayList<Ammo>();

	}

	public void add(Ammo al)
	{
		if(delay%30==0)
			ammo.add(al);
		delay+=1;
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(int i =0; i<ammo.size(); i++){
			ammo.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i =0; i<ammo.size(); i++){
			ammo.get(i).move("UP");
		}
	}

	public void cleanEmUp()
	{
		for(int i =ammo.size()-1; i>=0; i--){
			if(ammo.get(i).getY()<0){
				ammo.remove(i);
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
