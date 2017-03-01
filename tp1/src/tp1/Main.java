package tp1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		HashMap<String, String> m = new HashMap<String,String>();
		m.put("salwa", "benel");
		m.put("iliass", "kahli");
		m.put("loick", "latifi");
		m.put("soufiane", "omari");
		Scanner in = new Scanner(System.in);
		Point p = new Point(4,5);
		System.out.println("Entrer votre login:");
		String login = in.nextLine();
		System.out.println("Entrer votre password:");
		String password = in.nextLine();
		User user = new User(login,password);
		
		if(m.containsKey(user.getUsername()))
		{
			String mdp = m.get(user.getUsername());
			if(mdp.equals(user.getMdp()))
				user.dessiner(p);
			else
			{
				System.out.println("password incorrect");
			}
		}
		else
		{
			System.out.println("Login incorrect");
		}

	}
}
