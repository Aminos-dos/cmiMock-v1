package com.example.cmimock.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class Creancier {
    String nomCreancier;
    String codeCreancier;
    String descriptionCreancier;
    String logoPath;
    String siteWeb;
    List<Param> params;
}
