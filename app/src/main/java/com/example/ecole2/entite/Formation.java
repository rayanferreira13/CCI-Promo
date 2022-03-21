package com.example.ecole2.entite;

public class Formation {
    private String acronyme;
    private String intitule;
    private String adresseImage;
    private String link;
    private String videoUrl;
    private int dureeMois;
    private String dateDebut;
    public Formation() {}
    public Formation(String acronyme, String intitule, String adresseImage, String link, String videoUrl, int dureeMois, String dateDebut) {
        this.intitule = intitule;
        this.acronyme = acronyme;
        this.adresseImage = adresseImage;
        this.link = link;
        this.videoUrl = videoUrl;
        this.dureeMois = dureeMois;
        this.dateDebut = dateDebut;
    }
    public String getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }
    public String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getAdresseImage() {
        return adresseImage;
    }
    public void setAdresseImage(String adresseImage) {
        this.adresseImage = adresseImage;
    }
    public String getAcronyme() {
        return acronyme;
    }
    public void setAcronyme(String acronyme) {
        this.acronyme = acronyme;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public int getDureeMois() {
        return dureeMois;
    }
    public void setDureeMois(int dureeMois) {
        this.dureeMois = dureeMois;
    }
    @Override
    public String toString() {
        return "Formation [acronyme=" + acronyme + ", intitule=" + intitule + ", adresseImage=" + adresseImage
                + ", link=" + link + ", videoUrl=" + videoUrl + ", dureeMois=" + dureeMois + ", dateDebut=" + dateDebut
                + "]";
    }
}
