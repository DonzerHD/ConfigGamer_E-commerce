package com.config.gamer.config.gamer.traitement;

import java.util.ArrayList;
import java.util.List;

import com.config.gamer.config.gamer.donnees.DO.Produit;

public class Panier {
	  private List<Produit> produits;
	  
	  public Panier() {
	    produits = new ArrayList<>();
	  }
	  
	  public void ajouterProduit(Produit produit) {
	    produits.add(produit);
	  }	  
	  public List<Produit> getProduits() {
	    return produits;
	  }
	  
	  public double prixTotal() {
		  double total = 0;
		  for (Produit produit : produits) {
		    total += produit.getPrix_produit();
		  }
		  return total;
		}
	}
