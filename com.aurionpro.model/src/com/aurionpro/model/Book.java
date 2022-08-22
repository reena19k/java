package com.aurionpro.model;
import java.util.Random;
public class Book {
    public int getPageNum(){
        return 1+new Random().nextInt(301);
    }

}