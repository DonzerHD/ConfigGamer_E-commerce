package com.config.gamer.config.gamer.metier.Service;

import java.util.List;


import com.config.gamer.config.gamer.donnees.DO.FournisseurAchat;
import com.config.gamer.config.gamer.metier.DTO.FournisseurAchatDTO;

public interface FournisseurAchatService {
	
	FournisseurAchatDTO ConvertFournisseurAchatDTO(FournisseurAchat fournisseurAchat);
	FournisseurAchat ConvertFournisseurAchat(FournisseurAchatDTO fournisseurAchatDTO);
	List<FournisseurAchatDTO> findAll();
	void createProduct(FournisseurAchatDTO fournisseurAchatDTO);
}
