package com.config.gamer.config.gamer.presentation;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.config.gamer.config.gamer.metier.DTO.ProduitDTO;
import com.config.gamer.config.gamer.metier.Service.ProduitService;

/**
 * @author thomas59
 *
 */
@Controller
public class ProduitController {

	  @Autowired
	  private ProduitService produitService;

	    @GetMapping("/")
	    public String list(Model model) {
	        List<ProduitDTO> produits = produitService.findAll();
	        model.addAttribute("produits", produits);
	        return "index";
	      }
}
