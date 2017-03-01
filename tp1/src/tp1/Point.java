package tp1;

/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point implements Subject
{
    // attributs
    private int x; //abscisse
    private int y; //ordonnée
    
    private Graphe graphe;

    /**
     * Constructor for objects of class Point
     */
    public Point(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    
    public boolean equals(Object anObject)
    {
    	if(anObject instanceof Point)
    	{
    		Point point = (Point) anObject;
    		return ((point.getX() == this.x) && (point.getY() == this.y));
    	}
    	
    	return false;
    }
    
    // accesseur x
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    // accesseur y
    public int getY()
    {
        return y;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    //méthode pour manipuler x et y
    public String coordonnees()
    {
        return "X = "+getX()+" Y = " + getY();
    }
    
    public void setGraph(Graphe graph)
    {
    	this.graphe = graph;
    }
    
    public void dessiner(int x, int y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    public Graphe getGraph()
    {
    	return graphe;
    }

	@Override
	public void afficher() {
		System.out.println(coordonnees());
		
	}
}
