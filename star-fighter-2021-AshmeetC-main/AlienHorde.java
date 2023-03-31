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

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for(int i =0; i<size/2; i++){
			for(int j =0; j<2; j++){
				aliens.add(new Alien(i*100, 30*j));
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i =0; i<aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i=shots.size()-1; i>=0; i--){
			for(int j = aliens.size()-1; j>=0; j--){
				Ammo a = shots.get(i);
				Alien b = aliens.get(j);
				boolean xCollide = b.getX() >= a.getX() - b.getWidth() && b.getX() <= a.getX() + a.getWidth();
				boolean yCollide = b.getY() >= a.getY() - b.getHeight() && b.getY() <= a.getY() + a.getHeight();
				if(xCollide && yCollide){
					shots.remove(i);
					aliens.remove(j);
					break;
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
