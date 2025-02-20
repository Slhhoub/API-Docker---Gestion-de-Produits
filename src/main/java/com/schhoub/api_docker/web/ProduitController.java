package com.schhoub.api_docker.web;

import com.schhoub.api_docker.model.Produit;
import com.schhoub.api_docker.service.ProduitService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
@AllArgsConstructor
public class ProduitController {

    private ProduitService produitService;

    @Operation(
            summary = "Récupérer la liste des produits",
            description = "Retourne la liste complète de tous les produits enregistrés. " +
                    "Chaque produit contient des informations détaillées comme l'ID, le nom, " +
                    "et le prix."
    )
    @GetMapping
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @Operation(
            summary = "Récupérer un produit par ID",
            description = "Retourne les détails d'un produit spécifique en fonction de son ID unique. " +
                    "Cette route permet de consulter les informations complètes d'un produit, " +
                    "y compris son nom, son prix, et son ID."
    )
    @GetMapping("/{id}")
    public Produit getProduitbyId(
            @PathVariable
            @Parameter(description = "ID du produit à récupérer") Integer id
    ){
        return produitService.getProduitById(id);
    }

    @Operation(
            summary = "Créer un nouveau produit",
            description = "Permet d'ajouter un nouveau produit à la base de données. " +
                    "Le produit doit être envoyé dans le corps de la requête en format JSON."
    )
    @PostMapping()
    public void saveProduit() {
        produitService.createProduit();
    }

    @Operation(
            summary = "Mettre à jour un produit existant",
            description = "Permet de mettre à jour les informations d'un produit existant en fonction de son ID. " +
                    "Les nouvelles données du produit doivent être envoyées dans le corps de la requête."
    )
    @PutMapping("/{id}")
    public Produit modifierProduit(
            @RequestBody Produit produit,
            @PathVariable Integer id
    ) {
        return produitService.updateProduit(produit, id);
    }

    @Operation(
            summary = "Supprimer un produit",
            description = "Permet de supprimer un produit existant en fonction de son ID. " +
                    "Une fois supprimé, le produit ne pourra plus être récupéré."
    )
    @DeleteMapping("/{id}")
    public void deleteProduit(
            @PathVariable
            @Parameter(description = "ID du produit à supprimer") Integer id
    ) {
        produitService.deleteProduit(id);
    }
}
