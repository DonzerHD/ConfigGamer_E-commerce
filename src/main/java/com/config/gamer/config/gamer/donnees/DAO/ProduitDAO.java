package com.config.gamer.config.gamer.donnees.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.config.gamer.config.gamer.donnees.DO.Produit;

public interface ProduitDAO extends JpaRepository<Produit, Long> {
	
}
