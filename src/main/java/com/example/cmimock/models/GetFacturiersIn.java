package com.example.cmimock.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class GetFacturiersIn {
    int typeCanal;
    double acquereurID;
    int modeID;
    double canalID;
    String dateServeur;
    int categorieCreance;
    double refTxSysPmt;
    String MAC;
}
