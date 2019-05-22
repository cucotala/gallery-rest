package com.quantumstudio.galleryrest.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min= 3)
    private String name;

    @NotNull
    @Size(min= 3)
    private String password;

    @ManyToOne
    private List<Purchase> purchaseList;

    @ManyToMany(mappedBy = "clientSet")
    private Set<Artist> artistSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Artist> getArtistSet() {
        return artistSet;
    }


    public void setArtistSet(Set<Artist> artistSet) {
        this.artistSet = artistSet;
    }
}
