package educ.models;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	
	private String login;
	private String password;
	private int age;
	private List<Groupe> groupes;
	private List<Connexion> connexions;
	private List<Preference> prefs;
	
	
	
	public Utilisateur(String login) {
  		this.login = login;
  		connexions = new ArrayList<>();
  		groupes = new ArrayList<>();
  		prefs = Preference.GetDefault();

  		}

	 
	
	/**
	 * methode post-connexion de l'utilisateur à l'application
	 * ajoute une instance de connexion dans les connexions de l'utilisateur
	 */
	public void postLogin() {
		try {
			connexions.add(new Connexion(this));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("problème de connexion, impossible de récupérer l'adresse IP client");
		}
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 120 && age >0) {
		this.age = age;
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Ajoute l'utilisateur en cours au groupe de nom nomGroupe
	 * @param nomgroupe
	 * @return true si l'utilisateur a été ajouté au groupe
	 */
	public boolean addToGroup(String nomgroupe) {
		for(Groupe groupe:Application.instance.getGroupes()){
			if(nomgroupe.equals(groupe.getNom)) && !groupes.contains(groupe)){
			groupes.add(groupe);
			return true;
		}
		};
		return false;
	}


	@Override
	public String toString() {
		return this.login+connexions+groupes;
	}
	
	
}
