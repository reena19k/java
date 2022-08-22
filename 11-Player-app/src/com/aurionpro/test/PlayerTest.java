package com.aurionpro.test;

import com.aurionpro.model.*;

public class PlayerTest {
	
    public static void main(String[] args) {
        Players player1 = new Players("Sachin",15);
     //   System.out.println("sachin is elder than dhoni");
        Players player2 = new Players("Dhoni",39);
     //   System.out.println("dhoni is younger than sachin");
        Players elder=player1.WhoIsElder(player2);
        System.out.println(elder);
    }

//    private static void printElderDetails(Player player){
//        System.out.println("Name of Player is "+player.getName());
//        System.out.println("Age of Player is "+player.getAge());
//        System.out.println("Id of Player is "+player.getId());
//    }
}




//int a =10;
//int b =20;
//greater(a,b)
//int c=greater()
//int greater(int a,int b)
//{
//if(a>b)
//	return a;
//else
//	return b;
	
//}
//int greater(int b)
//{
//	if(this<b)
//		return this;
//	else 
//		return b;
			
//}