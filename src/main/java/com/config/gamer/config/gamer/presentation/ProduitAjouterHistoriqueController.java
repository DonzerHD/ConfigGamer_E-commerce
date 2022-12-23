package com.config.gamer.config.gamer.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.config.gamer.config.gamer.metier.DTO.FournisseurAchatDTO;
import com.config.gamer.config.gamer.metier.DTO.ProduitDTO;
import com.config.gamer.config.gamer.metier.Service.FournisseurAchatService;
import com.config.gamer.config.gamer.metier.Service.ProduitService;

@Controller
@RequestMapping("/ajouterProduit")
public class ProduitAjouterHistoriqueController {

  private final ProduitService produitService;

  @Autowired
  public ProduitAjouterHistoriqueController(ProduitService produitService) {
    this.produitService = produitService;
  }

  @GetMapping
  public String listProduit(Model model) {
    model.addAttribute("produits", produitService.findAll());
    model.addAttribute("produit", new ProduitDTO());
    return "ajouterProduit";
  }

  @PostMapping
  public String createProduit(ProduitDTO produitDTO, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "/ajouterProduit";
    }
    produitService.createProduit(produitDTO);
    return "redirect:/ajouterProduit";
  }

}

