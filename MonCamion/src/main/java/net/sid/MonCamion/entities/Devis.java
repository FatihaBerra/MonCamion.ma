package net.sid.MonCamion.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Devis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDevis;
	
	private Date dateDevis;
	
	@NotEmpty
	@Size(min=4,max=30)
	private String lieuDepart;
	@NotEmpty
	@Size(min=4,max=30)
	private String lieuArrive;
	private int nbrCamion;
	private Long distance;
	private int nbrJour;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="idVehicule")
	private Vehicule vehicule;
	public Long getIdDevis() {
		return idDevis;
	}
	public void setIdDevis(Long idDevis) {
		this.idDevis = idDevis;
	}
	public Date getDateDevis() {
		return dateDevis;
	}
	public void setDateDevis(Date dateDevis) {
		this.dateDevis = dateDevis;
	}
	public String getLieuDepart() {
		return lieuDepart;
	}
	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}
	public String getLieuArrive() {
		return lieuArrive;
	}
	public void setLieuArrive(String lieuArrive) {
		this.lieuArrive = lieuArrive;
	}
	public int getNbrCamion() {
		return nbrCamion;
	}
	public void setNbrCamion(int nbrCamion) {
		this.nbrCamion = nbrCamion;
	}
	public Long getDistance() {
		return distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}
	public int getNbrJour() {
		return nbrJour;
	}
	public void setNbrJour(int nbrJour) {
		this.nbrJour = nbrJour;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Devis() {
		super();
	}
	public Devis(Date dateDevis, String lieuDepart, String lieuArrive, int nbrCamion, Long distance, int nbrJour,
			Client client, Vehicule vehicule) {
		super();
		this.dateDevis = dateDevis;
		this.lieuDepart = lieuDepart;
		this.lieuArrive = lieuArrive;
		this.nbrCamion = nbrCamion;
		this.distance = distance;
		this.nbrJour = nbrJour;
		this.client = client;
		this.vehicule = vehicule;
	}
	
}
