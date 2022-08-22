package com.aurionpro.test;

import java.util.Arrays;

public class Method {

	public static void main(String[] args) {
		 System.out.println("Enter the length of an array " + args.length);
	        int[] arr = new int[args.length];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = Integer.parseInt(args[i]);
	        }
	        frequncyCalc(arr, arr.length);
	        int minmum = minCalc(arr, arr.length);
	        System.out.println("Minum element in array is " + minmum);
	        int maximum = maxCalc(arr, arr.length);
	        System.out.println("Maximum element in array is " + maximum);
	        sum(arr,arr.length);
	        setMedian(arr,arr.length);
	        
	    }

	    public static void frequncyCalc(int[] arr1, int n) {
	        int[] freq = new int[n];
	        int size, i, j, count;
	        System.out.print("elements in array: ");
	        for (i = 0; i < arr1.length; i++) {
	            freq[i] = -1;
	        }
	        for (i = 0; i < arr1.length; i++) {
	            count = 1;
	            for (j = i + 1; j < arr1.length; j++) {
	                if ((arr1[i]) == (arr1[j])) {
	                    count++;
	                    freq[j] = 0;

	                }
	            }
	            if (freq[i] != 0) {
	                freq[i] = count;

	            }
	        }

	        System.out.println("Frequency of all elements of array : ");
	        for (i = 0; i < arr1.length; i++) {
	            if (freq[i] != 0) {
	                System.out.println((arr1[i]) + " occur " + freq[i] + " times ");

	            }
	        }
	    }

	    public static int minCalc(int[] arr1, int n) {
	        int min = 999;
	        for (int k = 0; k < arr1.length; k++) {
	            if (arr1[k] < min) {
	                min = (arr1[k]);
	            }
	        }
	        return min;
	    }

	    public static int maxCalc(int[] arr1, int n) {
	        int max = 0;
	        for (int k = 0; k < arr1.length; k++) {
	            if (arr1[k] > max) {
	                max = (arr1[k]);
	            }
	        }
	        return max;
	    }

	    public  static void sum(int[] arr1, int n) {
	        int sum = 0;
	        for (int k = 0; k < arr1.length; k++) {
	            sum = sum + arr1[k];
	        }
	        System.out.println("Sum of elements in array  is " + sum);
	    }

	    public static void setMedian(int[] arr1, int n) {
	        Arrays.sort(arr1);
	        int median = 0;
	        median = ((arr1[(arr1.length - 1) / 2]) + (arr1[(arr1.length / 2)])) / 2;
	        System.out.println("Median of array is " + median);
	    }
}


