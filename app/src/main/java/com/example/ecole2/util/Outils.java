package com.example.ecole2.util;

public class Outils {
    public static String convertStringDate(String uneDate){
        String[] expected = uneDate.split("-");
        return expected[2] + "-" + expected[1] + "-" + expected[0];
    }
}
