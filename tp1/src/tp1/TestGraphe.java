package tp1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class TestGraphe {

	
	public void test() {
		
	}
	
	@Test
	public void testAppartenance()
	{
		Point p1 = new Point(5,3);
		Point p2 = new Point(10,3);
		Point p3 = new Point(0,5);
		
		Graphe plot = new Graphe();
		
		List<Point> points = new ArrayList<Point>();
		
		points.add(p1);
		points.add(p2);
		points.add(p3);
		
		plot.setPoints(points);
		
		assertEquals(points, plot.getPoints());
		assertEquals(plot, p1.getGraph());
		assertEquals(plot, p2.getGraph());
		assertEquals(plot, p3.getGraph());		
	}
	
	@Test
	public void testEqualsPoint()
	{
		Point p = new Point(10,26);
		
		assertEquals(p, new Point(10,26));
	}
	
	@Test
	public void testEquality()
	{
		Point p1 = new Point(5,4);
		Point p2 = new Point(5,4);
		Point p3 = new Point(4,4);
		
		assertEquals(true, p1.equals(p2));
		assertEquals(false, p1.equals(p3));
	}
	@Test
	public void testGraphe()
	{
		Point p1 = new Point(5,4);
		Graphe g = new Graphe();
		g.ajouterPoint(p1);
		assertEquals(new Point(5,4), p1);
		g.modifierPoint(0, 8, 9);
		assertEquals(new Point(8,9), p1);
		assertEquals(new Point(8,9), g.chercherPoint(0));
		g.supprimerPoint(p1);
		assertEquals(0,g.getPoints().size());
		assertEquals("X = 8 Y = 9",p1.coordonnees());
	}
}
