package educ.models;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private List<Groupe> groupes;
	private List<Utilisateur> utilisateurs;
	public static Application instance;
	
	public Application() {
		groupes=new ArrayList<>();
		utilisateurs=new ArrayList<>();

	}
	
	
	/**
	 * Ajoute des utilisateurs et des groupes àune nouvelle 
	 */
	public static Application create() {
		Application app=new Application();
		Utilisateur u1 = new Utilisateur("");
		instance.addUsers("zorro","bernado");
		instance.addGroupes("animaux","Heros");
		return app;
	}
	
	private void addUsers(String...userNames) {
		for (String name=userNames) {
			utilisateurs.add(new Utilisateur(name));
		}
	}
	
	private void addGroupes(String...groupeNames) {
		for (String name=groupeNames) {
			utilisateurs.add(new Utilisateur(name));
		}
	}
	
	
	@Override
	public String toString() {
		return "Application [groupes=" + groupes + ", utilisateurs=" + utilisateurs + "]";
	}
	
	
	
}
