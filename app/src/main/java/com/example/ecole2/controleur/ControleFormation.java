package com.example.ecole2.controleur;

import android.util.Log;

import com.example.ecole2.entite.Formation;
import com.example.ecole2.model.RequeteAsynchrone;

import java.util.ArrayList;
import java.util.List;

public class ControleFormation {
    private static String TAG = "ControleFormation";
    public static ControleFormation instance = null ;
    private List<Formation> formations = new ArrayList<>();
    private Formation formation = null;
    private static RequeteAsynchrone requeteAsynchrone;

    private ControleFormation(){
        super();
    }

    public static ControleFormation getInstance(){
        if(instance == null){
            instance = new ControleFormation();
            requeteAsynchrone = RequeteAsynchrone.getInstance();
            Log.i(TAG, "constructeur");
        }
        return ControleFormation.instance;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        Log.i(TAG, "setFormations");
        this.formations = formations;
    }

}
