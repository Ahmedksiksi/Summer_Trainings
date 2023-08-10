package com.example.summertrainings;

public class FormationClass {
    private String formationTitle;
    private String formationDesc;
    private String formationImage;
    private String formationPdf;
    private String formationQuiz;

    private String formationDate_debut;
    private String formationDate_fin;


    public String getFormationTitle() {
        return formationTitle;
    }

    public String getFormationDesc() {
        return formationDesc;
    }

    public String getFormationImage() {
        return formationImage;
    }

    public String getFormationPdf() {
        return formationPdf;
    }

    public String getFormationQuiz() {
        return formationQuiz;
    }

    public String getFormationDate_debut() {
        return formationDate_debut;
    }

    public String getFormationDate_fin() {
        return formationDate_fin;
    }

    public FormationClass(String formationTitle, String formationDesc, String formationImage) {
        this.formationTitle = formationTitle;
        this.formationDesc = formationDesc;
        this.formationImage = formationImage;
        this.formationPdf = formationPdf;
        this.formationQuiz = formationQuiz;
        this.formationDate_debut = formationDate_debut;
        this.formationDate_fin = formationDate_fin;
    }



    public  FormationClass() {
    }
}
