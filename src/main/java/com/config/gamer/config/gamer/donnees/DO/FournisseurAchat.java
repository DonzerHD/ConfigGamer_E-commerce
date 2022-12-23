package com.config.gamer.config.gamer.donnees.DO;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fournisseurachat", schema = "configamer")
public class FournisseurAchat {
	  
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id_fournisseurAchat", updatable = false, nullable = false)
	  private Long id_fournisseurAchat;
	  
	  @Column(name = "materiel_fournisseur", nullable = false)
	  private String materiel_fournisseur;
	  
	  @Column(name = "nom_fournisseurAchat", nullable = false)
	  private String nom_fournisseurAchat;
	  
	  @Column(name = "quantite_acheter_fournisseurAchat", nullable = false)
	  private Integer quantite_acheter_fournisseurAchat;
	  
	  @Column(name = "date_acheter_fournisseurAchat", nullable = false)
	  private LocalDateTime date_acheter_fournisseurAchat;

	public String getNom_fournisseurAchat() {
		return nom_fournisseurAchat;
	}

	public void setNom_fournisseurAchat(String nom_fournisseurAchat) {
		this.nom_fournisseurAchat = nom_fournisseurAchat;
	}

	public Long getId_fournisseurAchat() {
		return id_fournisseurAchat;
	}

	public void setId_fournisseurAchat(Long id_fournisseurAchat) {
		this.id_fournisseurAchat = id_fournisseurAchat;
	}

	public String getMateriel_fournisseur() {
		return materiel_fournisseur;
	}

	public void setMateriel_fournisseur(String materiel_fournisseur) {
		this.materiel_fournisseur = materiel_fournisseur;
	}

	public Integer getQuantite_acheter_fournisseurAchat() {
		return quantite_acheter_fournisseurAchat;
	}

	public void setQuantite_acheter_fournisseurAchat(Integer quantite_acheter_fournisseurAchat) {
		this.quantite_acheter_fournisseurAchat = quantite_acheter_fournisseurAchat;
	}

	public LocalDateTime getDate_acheter_fournisseurAchat() {
		return date_acheter_fournisseurAchat;
	}

	public void setDate_acheter_fournisseurAchat(LocalDateTime date_acheter_fournisseurAchat) {
		this.date_acheter_fournisseurAchat = date_acheter_fournisseurAchat;
	}
	  
}
