package com.aurionpro.model;

import java.util.StringTokenizer;

public class Tokenizer {
        public static void main(String args[]) {

            String mydelim = " ,: ";
            String mystr = "name:Mahesh , Age:20 , City:Nagpur";
          

            StringTokenizer str =
                    new StringTokenizer(mystr, mydelim);

            int count = str.countTokens();
            System.out.println("Number of tokens : " + count + "\n");


            while (str.hasMoreTokens())
                System.out.println(str.nextToken());
        }
    }
