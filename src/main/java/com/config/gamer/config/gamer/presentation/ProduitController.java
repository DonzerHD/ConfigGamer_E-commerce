package com.config.gamer.config.gamer.presentation;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.config.gamer.config.gamer.donnees.DO.Produit;
import com.config.gamer.config.gamer.metier.DTO.ProduitDTO;
import com.config.gamer.config.gamer.metier.Service.ProduitService;
import com.config.gamer.config.gamer.traitement.Panier;

@Controller
public class ProduitController{

	  @Autowired
	  private ProduitService produitService;
		  
	  @Autowired
	  private HttpServletRequest request;
	  
	  
		@GetMapping("/")
	    public String list(Model model) {
	        List<ProduitDTO> produits = produitService.findAll();
	        model.addAttribute("produits", produits);
	        HttpSession session = request.getSession();
		      Panier panier = (Panier) session.getAttribute("panier");
		      if (panier == null) {
		        panier = new Panier();
		        session.setAttribute("panier", panier);
		      }
		      model.addAttribute("panier", panier);
		      // Récupère le panier de la session et envoie son nombre d'éléments à la vue
		      if (panier != null) {
		        model.addAttribute("panierIcone", panier.getProduits().size());
		      } else {
		        model.addAttribute("panierIcone", 0);
		      }
		      model.addAttribute("prixTotal", panier.prixTotal());
		
	        return "index";
	      }

	    
	    @PostMapping("/panier/ajouter")
	    public String ajouterAuPanier(@RequestParam("id_produit") long id_produit) {
	      // Récupérez le panier de la session
	      HttpSession session = request.getSession();
	      Panier panier = (Panier) session.getAttribute("panier");
	      if (panier == null) {
	        panier = new Panier();
	        session.setAttribute("panier", panier);
	      }
	      
	      // Récupérez le produit à ajouter au panier
	      Produit produit = produitService.getById(id_produit);
	      
	      // Ajoutez le produit au panier
	      panier.ajouterProduit(produit);
                 
	      return "redirect:/";
	    }
	    
	    @PostMapping("/cart/empty")
	    public String emptyCart() {
	    HttpSession session = request.getSession();
		 Panier panier = (Panier) session.getAttribute("panier");
		 /* Code bizarre*/
		  panier.updateStock();
		  for (Produit produit : panier.getProduits()) {
		    produitService.save(produit);
		  }
		 /* Code bizarre */
	      panier.enleverLesProduit();
	      return "redirect:/";
	    }
	    
}




