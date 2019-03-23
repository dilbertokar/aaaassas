package com.example.dilber.excelsior;

import android.widget.ImageView;

public class Product {

    int id;
    String isim;
    String fiyat;
    int resimId;

    public Product(int id, String isim, String fiyat, int resimId) {
        this.id = id;
        this.isim = isim;
        this.fiyat = fiyat;
        this.resimId = resimId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }
}
