package com.aurionpro.test;

public class Example {

	public static void main(String[] args) {
		int[] freq=new int[100];
		int count,i,j,min=999,max=0;
		for( i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])<min)
			{
				min=Integer.parseInt(args[i]);
			}
		}
			
      System.out.println(min);  
  	for(i=0;i<args.length;i++)
	{
		if(Integer.parseInt(args[i])>max)
		{
			max=Integer.parseInt(args[i]);
		}
	}
		
  System.out.println(max);  
  for(i=0;i<args.length;i++)
  {
	  freq[i]=-1;
  }
  for (i = 0; i < args.length; i++) {
      freq[i] = -1;
  }
  for (i = 0; i < args.length; i++) {
      count = 1;
      for (j = i + 1; j < args.length; j++) {
          if (Integer.parseInt(args[i]) == Integer.parseInt(args[j])) {
              count++;
              freq[j] = 0;

          }
      }
      if (freq[i] != 0) {
          freq[i] = count;

      }
  }
  System.out.println("Frequency of all elements of array : ");
  for (i = 0; i < args.length; i++) {
      if (freq[i] != 0) {
          System.out.println(Integer.parseInt(args[i]) + " occur " + freq[i] + " times ");

      }
  }
	}
}

	
