package tp1;

public class Proxy implements Subject{

	Point point;
	
	@Override
	public void afficher() {
		point.afficher();
		
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	

}
