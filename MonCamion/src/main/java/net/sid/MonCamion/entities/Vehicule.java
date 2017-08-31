package net.sid.MonCamion.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Vehicule")
public class Vehicule implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long   idVehicule;
	@NotEmpty
	@Size(min=5,max=30)
	private String titre;
	@NotEmpty
	@Size(min=5,max=30)
	private String type;
	@NotEmpty
	private double superficie;
	@NotEmpty
	private double hauteur;
	@NotEmpty
	private double largeur;
	@NotEmpty
	private int    nbr_personne;
	@NotEmpty
	private double poids;
	
	private String description;
	@NotEmpty
	@Lob
	private byte[] photo;
	
	//un produit a une seul categorie donc on utilise l'annotation many to one
	
	@ManyToOne
	//specifier la jointure
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
	
	
	public Vehicule() {
		super();
	}



	public Long getIdVehicule() {
		return idVehicule;
	}



	public void setIdVehicule(Long idVehicule) {
		this.idVehicule = idVehicule;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getSuperficie() {
		return superficie;
	}



	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}



	public double getHauteur() {
		return hauteur;
	}



	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}



	public double getLargeur() {
		return largeur;
	}



	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}



	public int getNbr_personne() {
		return nbr_personne;
	}



	public void setNbr_personne(int nbr_personne) {
		this.nbr_personne = nbr_personne;
	}



	public double getPoids() {
		return poids;
	}



	public void setPoids(double poids) {
		this.poids = poids;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public byte[] getPhoto() {
		return photo;
	}



	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public Vehicule(String titre, String type, double superficie, double hauteur, double largeur, int nbr_personne,
			double poids, String description, byte[] photo, Categorie categorie) {
		super();
		this.titre = titre;
		this.type = type;
		this.superficie = superficie;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.nbr_personne = nbr_personne;
		this.poids = poids;
		this.description = description;
		this.photo = photo;
		this.categorie = categorie;
	}

	


}
