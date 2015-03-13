package csu.sort;

import java.util.Arrays;

public class SortColors {
	 public void sortColors(int[] A){
	        int pos_low = 0;
	        int pos_mid = 0;
	        int pos_high = A.length-1;
	        while(pos_mid<=pos_high){
	            switch(A[pos_mid]){
	            case 0:
	                swap(A,pos_low,pos_mid);
	                pos_low++;
	                pos_mid++;
	                break;
	            case 1:
	                pos_mid++;
	                break;
	            case 2:
	                swap(A,pos_mid,pos_high);
	                pos_high--;
	                break;
	         }
	        
	    }
	  
	}
	   public void swap(int[]A, int a,int b){
	        int temp =A[b] ;
	        A[b]  = A[a];
	        A[a] = temp;
	    }
	   
	   public static void main(String[] args) {
		   SortColors sc = new SortColors();
		   int[] arr = {1,0};
		  sc.sortColors(arr);
		  System.out.println((Arrays.toString(arr)));
		  
		  
		  
	}
	   
}
