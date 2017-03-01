package tp1;

import java.util.ArrayList;

// Singleton
public class Controller {
	
	//ArrayList<User> users = new ArrayList();
	
	static private Controller instance;
	
	Controller(){}
	
	static public Controller getInstance()
	{
		if(instance == null)
		{
			instance = new Controller();
			return instance;
		}
		else
		{
			return instance;
		}
	}
	
	public boolean isValidUser (String username){
		
		return username.equals(getUser().getUsername());
	}
	
	public boolean isValidUserPassword (String mdp){
		return mdp.equals(getUser().getMdp());
	}
	
	public boolean isValidUserPasswordContent (String mdp) {
		int upper = 0;
		for (int i=0;i<mdp.length();i++){
			if(Character.isUpperCase(mdp.charAt(i))){
				upper++;
			}
		}
	return (upper>=1);
	}
	public User getUser(){
		
		User user = new User("Salwa","S123");
		User user1 = new User("Khawla","1994");
		User user2 = new User("Hafida","H92");
		return user;
	}
	
}
