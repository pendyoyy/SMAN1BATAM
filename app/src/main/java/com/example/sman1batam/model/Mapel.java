package com.example.sman1batam.model;

import com.google.gson.annotations.SerializedName;

public class Mapel{
    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("nama_mapel")
    private String namaMapel;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("id")
    private int id;

    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt(){
        return updatedAt;
    }

    public void setNamaMapel(String namaMapel){
        this.namaMapel = namaMapel;
    }

    public String getNamaMapel(){
        return namaMapel;
    }

    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }

    public String getCreatedAt(){
        return createdAt;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

}