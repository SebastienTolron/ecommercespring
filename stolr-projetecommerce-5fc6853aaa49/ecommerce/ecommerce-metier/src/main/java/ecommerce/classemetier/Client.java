package ecommerce.classemetier;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String nom;
	private String prenom;
	private String pseudo;
	private String motDePasse;
	private String email;
	
//	private ArrayList<Commande> historiqueCommandes;
//	private ArrayList<AdresseLivraison> listeAdresseLivraison;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String pseudo, String motDePasse,String nom, String prenom, String email) {
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public ArrayList<Commande> getHistoriqueCommandes() {
//		return historiqueCommandes;
//	}
/*
	public void setHistoriqueCommandes(ArrayList<Commande> historiqueCommandes) {
		this.historiqueCommandes = historiqueCommandes;
	}

	public ArrayList<AdresseLivraison> getListeAdresseLivraison() {
		return listeAdresseLivraison;
	}

	public void setListeAdresseLivraison(ArrayList<AdresseLivraison> listeAdresseLivraison) {
		this.listeAdresseLivraison = listeAdresseLivraison;
	}
*/
}
