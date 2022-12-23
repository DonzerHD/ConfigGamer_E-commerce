package com.config.gamer.config.gamer.metier.DTO;


public class ProduitDTO {

	  private Long id_produit;
	  
	  private String nom_produit;

	  private String description_produit;

	  private Double prix_produit;

	  private Integer stock_produit;

	  public Long getId_produit() {
		return id_produit;
	}

	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public String getDescription_produit() {
		return description_produit;
	}

	public void setDescription_produit(String description_produit) {
		this.description_produit = description_produit;
	}

	public Double getPrix_produit() {
		return prix_produit;
	}

	public void setPrix_produit(Double prix_produit) {
		this.prix_produit = prix_produit;
	}

	public Integer getStock_produit() {
		return stock_produit;
	}

	public void setStock_produit(Integer stock_produit) {
		this.stock_produit = stock_produit;
	}

	public String getCategorie_produit() {
		return categorie_produit;
	}

	public void setCategorie_produit(String categorie_produit) {
		this.categorie_produit = categorie_produit;
	}

	private String categorie_produit;
}
