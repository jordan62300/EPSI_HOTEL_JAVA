package Hotel_EPSI;

public class Client extends Personne {

	private String telephone;
	private String mail;
	
	public Client (String nom, String prenom, String adresse, String telephone ,String mail ,String dateDeNaissance) {
	super (nom, prenom , dateDeNaissance,adresse);
	setTelephone(telephone);
	setMail(mail);
	
	}

	// GET & SET
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
