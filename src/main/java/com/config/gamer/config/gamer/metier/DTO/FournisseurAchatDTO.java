package com.config.gamer.config.gamer.metier.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.config.gamer.config.gamer.donnees.DO.Produit;

/**
 * @author thomas59
 *
 */
public class FournisseurAchatDTO {

	  private Long id_fournisseurAchat;
	  

	  private String materiel_fournisseur;
	  
	  private String nom_fournisseurAchat;
	  
	private Integer quantite_acheter_fournisseurAchat;
		  
	 private LocalDate date_acheter_fournisseurAchat;
	  

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
	public Integer getQuantite_acheter_fournisseurAchat() {
		return quantite_acheter_fournisseurAchat;
	}

	public void setQuantite_acheter_fournisseurAchat(Integer quantite_acheter__fournisseurAchat) {
		this.quantite_acheter_fournisseurAchat = quantite_acheter__fournisseurAchat;
	}

	public LocalDate getDate_acheter_fournisseurAchat() {
		return date_acheter_fournisseurAchat;
	}

	public void setDate_acheter_fournisseurAchat(LocalDate date_acheter_fournisseurAchat) {
		this.date_acheter_fournisseurAchat = date_acheter_fournisseurAchat;
	}

	public String getMateriel_fournisseur() {
		return materiel_fournisseur;
	}

	public void setMateriel_fournisseur(String materiel_fournisseur) {
		this.materiel_fournisseur = materiel_fournisseur;
	}
	
}
