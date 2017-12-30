package com.springtest.giflib.model;

import java.time.LocalDate;

public class Gif {

    private String name;
    private int CategoryId;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;


    public Gif(String name, int CategoryId, LocalDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.CategoryId = CategoryId;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
