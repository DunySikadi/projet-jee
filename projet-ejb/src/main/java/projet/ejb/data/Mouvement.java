package projet.ejb.data;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mouvement")
public class Mouvement {

	// Champs
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idmouvement")
	private int id;
	@Column(name = "somme")
	private double somme;
	@ManyToOne
	@JoinColumn(name = "idcompte")
	private Compte compte;

	public Mouvement() {
	}

	public Mouvement(int id, double somme, Compte compte) {
		super();
		this.id = id;
		this.somme = somme;
		this.compte = compte;
	}

	public double getSomme() {
		return somme;
	}

	public void setSomme(double somme) {
		this.somme = somme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	// equals() et hashcode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mouvement other = (Mouvement) obj;
		return id == other.id;
	}

}
