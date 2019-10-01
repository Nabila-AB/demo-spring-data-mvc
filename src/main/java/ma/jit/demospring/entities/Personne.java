package ma.jit.demospring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Personne implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	
	public Personne() {
		// TODO Auto-generated constructor stub
		System.out.println("Object created");
	}
	
	

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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

	

//	@Override
//	public String toString() {
//		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
//	}
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String leNom() {
		return this.nom;
	}

}
