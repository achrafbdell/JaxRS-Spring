package com.projet.controllers;

import com.projet.entities.Compte;
import com.projet.repositories.CompteRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/banque")
public class CompteJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;

    @Path("/compte")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Compte> getCompte(){
        return compteRepository.findAll();
    }

    // CREATE: Ajouter un nouveau compte
    @Path("/comptes")
    @POST
    @Consumes ({MediaType. APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte addCompte (Compte compte) {
        return compteRepository.save(compte);
    }

    // UPDATE: Mettre àjour un compte existant @Path("/compte/{id}")
    @Path("/compte/{id}")
    @PUT
    @Consumes ({MediaType. APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces ({MediaType. APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte updateCompte (@PathParam("id") Long id, Compte compte) {
        Compte existingCompte = compteRepository.findById(id).orElse(null);
        if (existingCompte != null) {
            existingCompte.setSolde(compte.getSolde());
            existingCompte.setDateCreation(compte.getDateCreation());
            existingCompte.setTypeCompte(compte.getTypeCompte());
            return compteRepository.save(existingCompte);
        }
        return null;
    }

    // DELETE: Supprimer un compte
    @Path("/comptes/{id}")
    @DELETE
    @Produces ({MediaType. APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteCompte (@PathParam("id") Long id) {
        compteRepository.deleteById(id);
    }

}

