package com.example.ecole2.util;

import android.widget.Toast;

public class VerificationMessage {
    private boolean isValid;
    Toast toast;
    private String string;

    public VerificationMessage(){}

    public boolean isEmailValid(String email){
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public boolean isNomPrenomValid(String nom, String prenom){
        return nom.matches("^[A-Za-z\\é\\è\\ê\\ë\\ï\\-]+$") && prenom.matches("^[A-Za-z\\é\\è\\ê\\ë\\ï\\-]+$");
    }

    public boolean isNullOrEmpty(String string){
        this.string = string;
        if(string == null) return true;
        else if(string.isEmpty()) return true;
        else return false;
    }
}
