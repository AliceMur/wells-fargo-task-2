package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityid;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private float quantity;

    protected Security() {

    }

    public Security(String name, String category, String purchasePrice, String purchaseDate, float quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getsecuityId() {
        return securityid;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }


    public String getname() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return category;
    }

    public void category(String category) {
        this.category = category;
    }

    public String getpurchasePrice() {
        return purchasePrice;
    }

    public void setpurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getpurchaseDate() {
        return purchaseDate;
    }

    public void setpurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getquantity() {
        return quantity;
    }

    public void setquantity(float quantity) {
        this.quantity = quantity;
    }
}
