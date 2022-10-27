package projet.commun.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DtoMouvement implements Serializable {

	// Champs

	private int id;

	private double somme;
	
	private DtoCompte compte;


	// Constructeurs

	public DtoMouvement() {
	}

	public DtoMouvement(int id, double somme) {
		super();
		this.id = id;
		this.somme = somme;
	}

	// Getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSomme() {
		return somme;
	}

	public void setSomme(double somme) {
		this.somme = somme;
	}

	public DtoCompte getCompte() {
		return compte;
	}

	public void setCompte(DtoCompte compte) {
		this.compte = compte;
	}

	

	
}
