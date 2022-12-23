package com.config.gamer.config.gamer.metier.Service;

import java.time.LocalDate;
import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.config.gamer.config.gamer.donnees.DAO.FournisseurAchatDAO;
import com.config.gamer.config.gamer.donnees.DO.FournisseurAchat;
import com.config.gamer.config.gamer.metier.DTO.FournisseurAchatDTO;

@Service
public class FournisseurAchatImpl implements FournisseurAchatService{
	
	@Autowired
	private FournisseurAchatDAO fournisseurAchatDAO;
	
	 
	@Override
	 public FournisseurAchatDTO ConvertFournisseurAchatDTO(FournisseurAchat fournisseurAchat) {
		    FournisseurAchatDTO fournisseurAchatDTO = new FournisseurAchatDTO();
		    fournisseurAchatDTO.setId_fournisseurAchat(fournisseurAchat.getId_fournisseurAchat());
		    fournisseurAchatDTO.setNom_fournisseurAchat(fournisseurAchat.getNom_fournisseurAchat());
		    fournisseurAchatDTO.setMateriel_fournisseur(fournisseurAchat.getMateriel_fournisseur());
		    fournisseurAchatDTO.setDate_acheter_fournisseurAchat(fournisseurAchat.getDate_acheter_fournisseurAchat());
		    fournisseurAchatDTO.setQuantite_acheter_fournisseurAchat(fournisseurAchat.getQuantite_acheter_fournisseurAchat());
		    return fournisseurAchatDTO;
		  }

	 @Override
	 public FournisseurAchat ConvertFournisseurAchat(FournisseurAchatDTO fournisseurAchatDTO) {
		    FournisseurAchat fournisseurAchat = new FournisseurAchat();
		    fournisseurAchat.setId_fournisseurAchat(fournisseurAchatDTO.getId_fournisseurAchat());
		    fournisseurAchat.setNom_fournisseurAchat(fournisseurAchatDTO.getNom_fournisseurAchat());
		    fournisseurAchat.setMateriel_fournisseur(fournisseurAchatDTO.getMateriel_fournisseur());
		    fournisseurAchat.setDate_acheter_fournisseurAchat(fournisseurAchatDTO.getDate_acheter_fournisseurAchat());
		    fournisseurAchat.setQuantite_acheter_fournisseurAchat(fournisseurAchatDTO.getQuantite_acheter_fournisseurAchat());
		    return fournisseurAchat;
		  }

	 @Override
	 public List<FournisseurAchatDTO> findAll() {
		    List<FournisseurAchat> fournisseurAchat = fournisseurAchatDAO.findAll();
		    return fournisseurAchat.stream().map(this::ConvertFournisseurAchatDTO).collect(Collectors.toList());
		  } 
	 
	 
	 @Override
	 public void createFournisseurAchat(FournisseurAchatDTO fournisseurAchatDTO) {
		    FournisseurAchat fournisseurAchat = ConvertFournisseurAchat(fournisseurAchatDTO);
		    fournisseurAchat.setDate_acheter_fournisseurAchat(LocalDate.now());
		    fournisseurAchatDAO.save(fournisseurAchat);
		  }

}
