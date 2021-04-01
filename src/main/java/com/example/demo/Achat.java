package com.example.demo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//Table achat
@Entity
public class Achat {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long IDachat;
	private int prixAchat;
	private Long date;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Article> article;
	
	public Achat() {super();}

	public Long getIDachat() {
		return IDachat;
	}

	public void setIDachat(Long iDachat) {
		IDachat = iDachat;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}
	
}
