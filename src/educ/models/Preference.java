package educ.models;
import java.util.List;
import java.util.ArrayList;

public class Preference {
	
	private String nom;
	private Object valeur;
	
	
	
	public Preference(String nom, Object valeur) {
		this.nom=nom;
		this.valeur=valeur;
	}
	
	public static List<Preference> GetDefault() {
		List<Preference> prefs = new ArrayList<>();
		prefs.add(new Preference("admin",true));
		prefs.add(new Preference("bgColor","black"));
		return prefs;
	};
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Object getValeur() {
		return valeur;
	}

	public void setValeur(Object valeur) {
		this.valeur = valeur;
	}

}
