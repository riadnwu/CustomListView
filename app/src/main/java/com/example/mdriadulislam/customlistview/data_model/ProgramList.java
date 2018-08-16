package com.example.mdriadulislam.customlistview.data_model;

public class ProgramList {
    private int languageImage;
    private String language,languageCompiler;

    public ProgramList(int languageImage, String language, String languageCompiler) {
        this.languageImage = languageImage;
        this.language = language;
        this.languageCompiler = languageCompiler;
    }

    public int getLanguageImage() {
        return languageImage;
    }

    public String getLanguage() {
        return language;
    }

    public String getLanguageCompiler() {
        return languageCompiler;
    }

    public void setLanguageImage(int languageImage) {
        this.languageImage = languageImage;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLanguageCompiler(String languageCompiler) {
        this.languageCompiler = languageCompiler;
    }
}
