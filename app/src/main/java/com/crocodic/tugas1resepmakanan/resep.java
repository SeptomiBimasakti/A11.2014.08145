package com.crocodic.tugas1resepmakanan;

/**
 * Created by PHAP on 04/10/2017.
 */

public class resep {
    private String title, description, ingredients, procedure;
    private int gambar;

    public resep() {
    }

    public resep(String title, String description, int gambar, String ingredients, String procedure) {
        this.title = title;
        this.description = description;
        this.gambar = gambar;
        this.ingredients = ingredients;
        this.procedure = procedure;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGambar() {
        return gambar;
    }

    public void setGambar(Integer gambar) {
        this.gambar = gambar;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }


}
