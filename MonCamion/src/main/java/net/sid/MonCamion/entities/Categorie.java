package net.sid.MonCamion.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;


@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategorie;
	
	@NotEmpty
	@Size(min=1,max=30)
	private String nomCategorie;
	
	@OneToMany(mappedBy="categorie")
	private Collection<Vehicule> vehicules;
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Categorie(String nomCategorie, Collection<Vehicule> vehicules) {
		super();
		this.nomCategorie = nomCategorie;
		this.vehicules = vehicules;
	}
	public Categorie() {
		super();
	}
	
	

}
