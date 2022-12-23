package com.config.gamer.config.gamer.metier.Service;

import com.config.gamer.config.gamer.donnees.DO.FournisseurAchat;
import com.config.gamer.config.gamer.metier.DTO.FournisseurAchatDTO;

public interface FournisseurAchatService {
	
	FournisseurAchatDTO ConvertFournisseurAchatDTO(FournisseurAchat fournisseurAchat);
	FournisseurAchat ConvertFournisseurAchat(FournisseurAchatDTO fournisseurAchatDTO);
	
	
	FournisseurAchatDTO createteAchat(FournisseurAchatDTO fournisseurAchatDTO);

}
