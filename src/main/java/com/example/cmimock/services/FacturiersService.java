package com.example.cmimock.services;

import com.example.cmimock.models.Creancier;
import com.example.cmimock.models.GetFacturiersIn;
import com.example.cmimock.models.GetFacturiersOut;
import com.example.cmimock.models.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacturiersService {
    public GetFacturiersOut getListeFacturiers(GetFacturiersIn requete){

        // Facturier 1---------
        Param param11 = new Param("param11","valeurparam11");
        Param param12 = new Param("param12","valeurparam12");
        List<Param> params1 = new ArrayList<>();
        params1.add(param11);
        params1.add(param12);
        Creancier facturier1 = new Creancier("facturier1","1111","descriptionFact1","http://logofacturier1.com","http://facturier1.com",params1);
        //-----------------------------
        // Facturier 2---------
        Param param21 = new Param("param21","valeurparam21");
        Param param22 = new Param("param22","valeurparam22");
        List<Param> params2 = new ArrayList<>();
        params2.add(param21);
        params2.add(param22);
        Creancier facturier2 = new Creancier("facturier2","2222","descriptionFact2","http://logofacturier2.com","http://facturier2.com",params2);
        //-----------------------------
        // Facturier 3---------
        Param param31 = new Param("param31","valeurparam31");
        Param param32 = new Param("param32","valeurparam32");
        List<Param> params3 = new ArrayList<>();
        params3.add(param31);
        params3.add(param32);
        Creancier facturier3 = new Creancier("facturier3","3333","descriptionFact3","http://logofacturier3.com","http://facturier3.com",params3);
        //-----------------------------
        List<Creancier> listeCreanciers = new ArrayList<>();
        listeCreanciers.add(facturier1);
        listeCreanciers.add(facturier2);
        listeCreanciers.add(facturier3);
        GetFacturiersOut reponse = new GetFacturiersOut("28042022",12,"All OK",listeCreanciers.size(),listeCreanciers,"QSIDUQSLKDJQLKSJD");
        return reponse;

    }
}
