package com.quantumstudio.galleryrest.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Painting {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Min(0)
    private int stock;

    @NotNull
    @Column(unique = true)
    private String name;

    @NotNull
    @Min(1)
    private double price;

    @ManyToOne
    private Artist artist;

    @OneToMany
    private Set<Purchase> purchaseList;

    @ManyToOne
    private Technique technique;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Set<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(Set<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }
}
