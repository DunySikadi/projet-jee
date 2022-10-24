package projet.commun.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class DtoCompte implements Serializable {

	// Champs

	private int id;

	private String pseudo;

	private String motDePasse;

	private String email;

	private List<String> roles = new ArrayList<>();

	private String prenom;
	
	private String nom;
	
	private int credit;

	// Constructeurs

	public DtoCompte() {
	}

	public DtoCompte(int id, String pseudo, String motDePasse, String email) {
		this.id = id;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.credit = credit;
	}

	// Getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public boolean isInRole(String role) {

		if (role != null) {
			for (String r : roles) {
				if (r.equals(role)) {
					return true;
				}
			}
		}
		return false;
	}
}
