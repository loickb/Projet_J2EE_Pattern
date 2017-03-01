package tp1;

import java.util.ArrayList;
import java.util.List;

public class Graphe {
	
	private List<Point> points;
	
	public Graphe()
	{
		points = new ArrayList<Point>();
	}
	
	public void setPoints(List<Point> points)
	{
		this.points = points;
		
		for(int i=0;i<points.size();i++)
		{
			points.get(i).setGraph(this);
		}
	}
	
	public List<Point> getPoints()
	{
		return points;
	}
	
	public void ajouterPoint(Point point)
	{
		points.add(point);
	}
	
	public void supprimerPoint(Point point)
	{
		points.remove(point);
	}
	
	public void modifierPoint(int indice, int x, int y)
	{
		for(int i=0; i<points.size();i++)
		{
			if(i==indice)
			{
				Point p = points.get(i);
				p.setX(x);
				p.setY(y);
			}
		}
	}
	
	public Point chercherPoint(int indice)
	{
		return points.get(indice);
	}
	
}
