package net.sid.MonCamion.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	@NotEmpty
	@Size(min=4,max=30)
	private String nomClient;
	
	@NotEmpty
	@Size(min=5,max=50)
	private String adress;
	@NotEmpty
	@Size(min=10,max=30)
	private String email;
	@NotEmpty
	@Size(min=10,max=20)
	private String tel;
	
	@OneToMany(mappedBy="client")
	private Collection<Devis> devis;
	public Client() {
		super();
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Collection<Devis> getDevis() {
		return devis;
	}
	public void setDevis(Collection<Devis> devis) {
		this.devis = devis;
	}
}
