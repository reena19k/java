package com.aurionpro.model;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws Exception  {
		Properties filesProp = new Properties();
		FileInputStream file = new FileInputStream("C:/Swabhav techlab repositary/core/35-Properties/src/config.properties");
		filesProp.load(file);
		String userName =filesProp.getProperty("username");
        String paswd = filesProp.getProperty("password");
        System.out.println("UserName is "+userName+" Password is "+paswd);
        FileOutputStream file1 = new FileOutputStream("C:/Swabhav techlab repositary/core/35-Properties/src/config.properties");
       Object username= filesProp.setProperty("username" , "reena");
       Object passwd = filesProp.setProperty("password","123");
        filesProp.store(file1,null);
        System.out.println("Username is "+username+" PassWord is "+passwd);
	
	}

}
