package com.example.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Integer numbCommande;
    public Integer montant;
    public Date dateCreated;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getNumbCommande() {
        return numbCommande;
    }
    public void setNumbCommande(Integer numbCommande) {
        this.numbCommande = numbCommande;
    }
    public Integer getMontant() {
        return montant;
    }
    public void setMontant(Integer montant) {
        this.montant = montant;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
}
