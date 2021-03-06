package com.example.playmusic.Adapter;

public class Music {
    private int index;
    private String name;
    private int file;
    private int imageId;

    public Music(String name,int file,int imageId){
        this.name = name;
        this.file = file;
        this.imageId = imageId;
    }

    public Music(int index, String name,int file,int imageId){
        this.index = index;
        this.name = name;
        this.file = file;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getFile(){
        return file;
    }

    public void setFile(int file){
        this.file = file;
    }

    public int getIndex(){
        return index;
    }

    public int getImageId(){
        return imageId;
    }

    public void setImageId(int imageId){
        this.imageId = imageId;
    }
}
