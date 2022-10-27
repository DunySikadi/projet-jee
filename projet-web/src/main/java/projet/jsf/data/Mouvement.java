package projet.jsf.data;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
public class Mouvement implements Serializable {

	// Champs
	Integer id;

	@NotBlank(message = "Le pseudo doit être renseigné")
	private double somme;
	@ManyToOne
	@JoinColumn(name="idcompte")
	@NotNull( message="Le compte doit être renseigné") 
	private Compte compte;
	
	// Constructeurs

	public Mouvement() {
	}

	public Mouvement(Integer id, double somme,Compte compte) {
		super();
		this.id = id;
		this.somme = somme;
		this.compte = compte;
	}

	// Getters & setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getSomme() {
		return somme;
	}

	public void setSomme(double somme) {
		this.somme = somme;
	}
	
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	// hashCode() & equals()
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = (Mouvement) obj;
		return Objects.equals(id, other.id);
	}

}
