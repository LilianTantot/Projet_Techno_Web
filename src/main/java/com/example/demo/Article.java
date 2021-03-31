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
	private String sexe; 
	private String categorie;
	private String description;
	private String taille;
	private Long stock;
	private String couleur;
	private String image;
	
	public Article() {super();}

	public Long getIDart() {return IDart;}

	public void setIDart(Long iDart) {IDart = iDart;}

	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}

	public String getSexe() {return sexe;} 

	public void setSexe(String sexe) {this.sexe = sexe;}

	public String getCategorie() {return categorie;}

	public void setCategorie(String categorie) {this.categorie = categorie;}

	public String getDescription() {return description;}

	public void setDescription(String description) {this.description = description;}

	public String getTaille() {return taille;}

	public void setTaille(String taille) {this.taille = taille;}

	public Long getStock() {return stock;}

	public void setStock(Long stock) {this.stock = stock;}

	public String getCouleur() {return couleur;}

	public void setCouleur(String couleur) {this.couleur = couleur;}

	public String getImage() {return image;}

	public void setImage(String image) {this.image = image;}
	
}
