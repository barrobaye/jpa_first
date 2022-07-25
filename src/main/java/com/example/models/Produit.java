package com.example.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.jboss.logging.Param;

@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    public String libelle;
    public Integer prix;

     /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
     /**
      * @param id the id to set 
       */
    public void setId(Long id) {
        this.id = id;
    }
     /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }
     /**
      * @param libelle the id to set 
       */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
     /**
     * @return the prix
     */
    public Integer getPrix() {
        return prix;
    }

     /**
      * @param prix the id to set 
       */
    public void setPrix(Integer prix) {
        this.prix = prix;
    }
    }
