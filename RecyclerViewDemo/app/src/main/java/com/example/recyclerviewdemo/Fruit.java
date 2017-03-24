package com.example.recyclerviewdemo;

/**
 * Created by Administrator on 2017/3/24.
 */

class Fruit {
    private String fruitName;
    private int imageId;

    public Fruit(String name, int imageid){
        this.fruitName = name;
        this.imageId = imageid;
    }

    public String getName(){
        return fruitName;
    }

    public int getImageId(){
        return imageId;
    }
}
