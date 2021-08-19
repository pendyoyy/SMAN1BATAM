package com.example.sman1batam.model;

import com.google.gson.annotations.SerializedName;

public class Nilai{
    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("user_id")
    private int userId;

    @SerializedName("nilai")
    private int nilai;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("mapel_id")
    private int mapelId;

    @SerializedName("id")
    private int id;

    @SerializedName("mapel")
    private Mapel mapel;

    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt(){
        return updatedAt;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public int getUserId(){
        return userId;
    }

    public void setNilai(int nilai){
        this.nilai = nilai;
    }

    public int getNilai(){
        return nilai;
    }

    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }

    public String getCreatedAt(){
        return createdAt;
    }

    public void setMapelId(int mapelId){
        this.mapelId = mapelId;
    }

    public int getMapelId(){
        return mapelId;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setMapel(Mapel mapel){
        this.mapel = mapel;
    }

    public Mapel getMapel(){
        return mapel;
    }

}