package com.schhoub.api_docker.service;

import com.schhoub.api_docker.model.Produit;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Data
public class ProduitService {
    private List<Produit> produits =new ArrayList<>();
    private final Random random = new Random();


    public List<Produit> getAllProduits(){
        return produits;
    }

    public Produit getProduitById(Integer id) {
       Produit produit =  produits.stream()
                            .filter(pr -> pr.getId().equals(id))
                            .findFirst()
                            .orElseThrow(()-> new RuntimeException("Produit non trouvé avec ID : " + id));
        System.out.println(produit);
       return produit;
    }

     public void createProduit(){
         for (int i = 1; i < 10; i++) {
             Double prix = 10 + (90 * random.nextDouble());
             Produit produit = Produit.builder()
                     .id(i)
                     .name("ProduitN°"+i)
                     .price(prix)
                     .build();
             produits.add(produit);
         }
     }

     public Produit updateProduit(Produit produit ,Integer id){
             Produit pr = produits.stream()
                     .filter(produit1 -> produit1.getId().equals(id))
                     .findFirst()
                     .orElseThrow(()->new RuntimeException("Produit non trouvé avec ID : " + id));
             pr.setName(produit.getName());
             pr.setPrice(produit.getPrice());

             return pr;
     }

     public void deleteProduit(Integer id){
        produits.removeIf(produit -> produit.getId().equals(id));
     }

}
