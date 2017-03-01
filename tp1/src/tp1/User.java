package tp1;


public class User {
		public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	private String username;
	private String mdp;
	

	public User(String username, String mdp) {
		super();
		this.username = username;
		this.mdp = mdp;
	}
	public User() {
		super();
	}
	
	public void dessiner(Point p)
	{
		Proxy pr = new Proxy();
		pr.setPoint(p);
		pr.afficher();
	}
}

