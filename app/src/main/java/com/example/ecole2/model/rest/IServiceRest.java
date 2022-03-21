package com.example.ecole2.model.rest;

import com.example.ecole2.entite.Formation;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface IServiceRest {
    // émulateur android studio
    //public static final String ENDPOINT = "http://10.0.2.2:90/ecole";
    public static final String ENDPOINT = "http://172.17.104.170:8089/ecole";
    // émulateur genymotion
    //public static final String ENDPOINT = "http://10.0.2.2:90/5EtudiantPromotion1vuePresentationRestWs/rest";
    @GET("/formation")
    public void getFormations(Callback<List<Formation>> formations);

}