package educ.tests;

import educ.models.Utilisateur;

public class TestUtilisateur {
	
	
	public static void main(String[] args) {
		Utilisateur user = new Utilisateur("goupilt");
		System.out.println(user.getLogin());
		user.setLogin("jeanpierre");
		user.postLogin();
		System.out.println(user);
		
		
	}
	
}