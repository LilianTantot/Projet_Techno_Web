package com.example.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//Table client
@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long IDut;
	private String nom;
	private String prenom;
	private Long naissance;
	private String mail;
	private String adresse;
	private String ville;
	private String pays;
	private Long codePostale;
	private String mdp;
	private Long tel;
	private String username;
	private Boolean adminBool;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Achat> achat;
	
	public Client() {super();}

	public Long getIDut() {return IDut;}

	public void setIDut(Long iDut) {IDut = iDut;}

	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}

	public String getPrenom() {return prenom;}

	public void setPrenom(String prenom) {this.prenom = prenom;}

	public Long getNaissance() {return naissance;}

	public void setNaissance(Long naissance) {this.naissance = naissance;}

	public String getMail() {return mail;}

	public void setMail(String mail) {this.mail = mail;}

	public String getAdresse() {return adresse;}

	public void setAdresse(String adresse) {this.adresse = adresse;}
	
	public String getVille() {return ville;}

	public void setVille(String ville) {this.ville = ville;}

	public String getPays() {return pays;}

	public void setPays(String pays) {this.pays = pays;}
	
	public Long getCodePostale() {return codePostale;}

	public void setCodePostale(Long codePostale) {this.codePostale = codePostale;}

	public String getMdp() {return mdp;}

	public void setMdp(String mdp) {this.mdp = mdp;}

	public Long getTel() {return tel;}

	public void setTel(Long tel) {this.tel = tel;}

	public String getUsername() {return username;}

	public void setUsername(String username) {this.username = username;}

	public Boolean getAdminBool() {return adminBool;}

	public void setAdminBool(Boolean adminBool) {this.adminBool = adminBool;}

}
