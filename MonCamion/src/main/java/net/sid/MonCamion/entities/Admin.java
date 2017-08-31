package net.sid.MonCamion.entities;

import javax.persistence.*;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idAdmin;
	private String adminName;
	private String password;
	private boolean actived;
	public Admin(String adminName, String password, boolean actived) {
		super();
		this.adminName = adminName;
		this.password = password;
		this.actived = actived;
	}
	public Admin() {
		super();
	}
	public Long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	} 
}
