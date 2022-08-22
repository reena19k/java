package com.aurionpro.model;

import java.util.Random;

public class Players {
    private String name;
    private int age;
    private String id;
    private static int countid=101;

   public  Players(String name,int age){
       this.name=name;
       this.age=age;
       this.id= "P" + countid++;
   }
   

    public  Players(String name){
        this(name,32);						
    }

    public String getName() {
        return name;
    }
    public int getAge(){
       return age;
    }
 
	
	public Players WhoIsElder(Players player1)
	    {
	    	
	    	if(this.getAge()>player1.getAge())
	    		return this;
	    	else
	    		return player1;
	    }
	
	
	 @Override
	 public String toString() {
	 	return "Player [name=" + name + ", age=" + age + ", id=" + id + "]";
	 }
    

 //   public Player whoIsElder(Player player1){
   //    if(this.getAge()> player1.getAge())						//whoisElder is method and Player is its returntype
    //       return this;     //objectreturn is this 
      // else
        //   return player1;    											//s1 s2	who is elder()
       																		//s1.whoiselder(s2)   constructormethod
    //}
//}





}