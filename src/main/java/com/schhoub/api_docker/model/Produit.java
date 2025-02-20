package com.schhoub.api_docker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Produit {
    private Integer id;
    private String name;
    private Double price;
}
