package com.example.cmimock.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class GetFacturiersOut {
    String dateServeur;
    int codeRetour;
    String msg;
    int nbreCreancier;
    List<Creancier> listeCreanciers;
    String MAC;
}
