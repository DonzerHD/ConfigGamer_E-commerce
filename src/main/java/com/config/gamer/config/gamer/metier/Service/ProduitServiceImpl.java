package com.config.gamer.config.gamer.metier.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.config.gamer.config.gamer.donnees.DAO.ProduitDAO;
import com.config.gamer.config.gamer.donnees.DO.Produit;
import com.config.gamer.config.gamer.metier.DTO.ProduitDTO;


@Service
public class ProduitServiceImpl implements ProduitService {
	
	 @Autowired
	  private ProduitDAO produitDAO;
	
	 @Override
	 public ProduitDTO ConvertProduitDTO(Produit produit) {
		    ProduitDTO produitDTO = new ProduitDTO();
		    produitDTO.setId_produit(produit.getId_produit());
		    produitDTO.setNom_produit(produit.getNom_produit());
		    produitDTO.setDescription_produit(produit.getDescription_produit());
		    produitDTO.setPrix_produit(produit.getPrix_produit());
		    produitDTO.setStock_produit(produit.getStock_produit());
		    produitDTO.setCategorie_produit(produit.getCategorie_produit());
		    return produitDTO;
		  }

	 @Override
	 public Produit ConvertProduit(ProduitDTO produitDTO) {
		    Produit produit = new Produit();
		    produit.setId_produit(produitDTO.getId_produit());
		    produit.setNom_produit(produitDTO.getNom_produit());
		    produit.setDescription_produit(produitDTO.getDescription_produit());
		    produit.setPrix_produit(produitDTO.getPrix_produit());
		    produit.setStock_produit(produitDTO.getStock_produit());
		    produit.setCategorie_produit(produitDTO.getCategorie_produit());
		    return produit;
		  }
	 
	 @Override
	 public List<ProduitDTO> findAll() {
		    List<Produit> products = produitDAO.findAll();
		    return products.stream().map(this::ConvertProduitDTO).collect(Collectors.toList());
		  }
	 
	 @Override
	 public void createProduit(ProduitDTO produitDTO) {
	  Produit produit = ConvertProduit(produitDTO);
	  produitDAO.save(produit);
		  }
	 
	 @Override
	 public Produit getById(long id) {
		    return produitDAO.findById(id).orElse(null);
		  }
	 
	 @Override
	 public void save(Produit produit) {
	  produitDAO.save(produit);
		  }
}
