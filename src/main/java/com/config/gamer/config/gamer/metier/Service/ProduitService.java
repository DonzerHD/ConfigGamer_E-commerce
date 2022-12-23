package com.config.gamer.config.gamer.metier.Service;

import java.util.List;

import com.config.gamer.config.gamer.donnees.DO.Produit;
import com.config.gamer.config.gamer.metier.DTO.ProduitDTO;

public interface ProduitService {

	ProduitDTO ConvertProduitDTO(Produit produit);
	Produit ConvertProduit(ProduitDTO produitDTO);
	
	List<ProduitDTO> findAll();
	void createProduit(ProduitDTO produitDTO);
}
