package com.config.gamer.config.gamer.traitement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	  
	  public void enleverLesProduit() {
		  produits.clear();
	  }
	  
	  public void updateStock() {
		  Map<Produit, Integer> produitsCount = new HashMap<>();
		  for (Produit produit : produits) {
		    if (produitsCount.containsKey(produit)) {
		      produitsCount.put(produit, produitsCount.get(produit) + 1);
		    } else {
		      produitsCount.put(produit, 1);
		    }
		  }
		  for (Map.Entry<Produit, Integer> entry : produitsCount.entrySet()) {
		    Produit produit = entry.getKey();
		    int count = entry.getValue();
		    produit.setStock_produit(produit.getStock_produit() - count);
		  }
	}
}
