package com.config.gamer.config.gamer.presentation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.config.gamer.config.gamer.metier.DTO.FournisseurAchatDTO;
import com.config.gamer.config.gamer.metier.Service.FournisseurAchatService;

@Controller
@RequestMapping("/fournisseur")
public class FournisseurAchatController {

  private final FournisseurAchatService fournisseurAchatService;

  @Autowired
  public FournisseurAchatController(FournisseurAchatService fournisseurAchatService) {
    this.fournisseurAchatService = fournisseurAchatService;
  }

  @GetMapping
  public String showProductListAndForm(Model model) {
    model.addAttribute("fournisseurAchats", fournisseurAchatService.findAll());
    model.addAttribute("fournisseurAchat", new FournisseurAchatDTO());
    return "Fournisseur";
  }

  @PostMapping
  public String createProduct(FournisseurAchatDTO productDTO, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "/fournisseur";
    }
    fournisseurAchatService.createFournisseurAchat(productDTO);
    return "redirect:/fournisseur";
  }

}

