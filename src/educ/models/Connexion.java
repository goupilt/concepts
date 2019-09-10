package educ.models;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Date;

public class Connexion {
	private String ip;
	private Date date;
	private Utilisateur utilisateur;
	
	public Connexion(Utilisateur utilisateur) throws UnknownHostException {
		this.utilisateur=utilisateur;
		this.date=new Date();
		this.ip=InetAddress.getLocalHost().toString();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return DateFormat.getInstance().format(date) +"@"+ ip +"          ";
	}
	
}
