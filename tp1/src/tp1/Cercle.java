package tp1;
/**
 * Write a description of class Cercle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cercle
{
    private Point centre;
    private int rayon;

    /**
     * Constructor for objects of class Cercle
     */
    public Cercle(Point centre, int rayon)
    {
        this.centre = centre;
        this.rayon = rayon;
    }
    
    public void setRayon(int rayon)
    {
        this.rayon = rayon;
    }
    
    public int getRayon()
    {
        return rayon;
    }
    
    public void setCentre(Point centre)
    {
        this.centre = centre;
    }
    
    public Point getCentre()
    {
        return this.centre;
    }
        
    public String toString()
    {
        return "Coordonnees du centre: "+centre.coordonnees()+" rayon: "+ this.rayon;
    }
}
