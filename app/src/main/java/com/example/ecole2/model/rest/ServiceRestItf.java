package com.example.ecole2.model.rest;

import com.example.ecole2.entite.Message;
import com.example.ecole2.model.IResponseRestCallback;

public interface ServiceRestItf {
    void lireFormations(IResponseRestCallback objetReponse);
    void postMessage(Message messageObj, IResponseRestCallback objetReponse);
}
