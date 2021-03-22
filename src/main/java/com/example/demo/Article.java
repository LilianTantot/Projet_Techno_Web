package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long IDart;
	private String nom;
	private String prenom;
	private Boolean Sexe; //false = femme et true = homme
	private String categorie;
	private String description;
	private String taille;
	private Long stock;
	private Long vente;
	private Boolean Art_bool;
	
	public Article() {super();}

	public Long getIDart() {return IDart;}

	public void setIDart(Long iDart) {IDart = iDart;}

	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}

	public String getPrenom() {return prenom;}

	public void setPrenom(String prenom) {this.prenom = prenom;}
	
	public Boolean getSexe() {return Sexe;}

	public void setSexe(Boolean sexe) {Sexe = sexe;}

	public String getCategorie() {return categorie;}

	public void setCategorie(String categorie) {this.categorie = categorie;}

	public String getDescription() {return description;}

	public void setDescription(String description) {this.description = description;}

	public String getTaille() {return taille;}

	public void setTaille(String taille) {this.taille = taille;}

	public Long getStock() {return stock;}

	public void setStock(Long stock) {this.stock = stock;}
	
	public Long getVente() {return vente;}

	public void setVente(Long vente) {this.vente = vente;}

	public Boolean getArt_bool() {return Art_bool;}

	public void setArt_bool(Boolean art_bool) {Art_bool = art_bool;}

}
