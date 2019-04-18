package csu.sortMethods;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = { 22, 12, 45, 19, 26, 23, 68, 9, 19, 88 };
      
      for(int i=0;i<arr.length;i++) {
    	  boolean flag = false;
    	  for(int j=0;j<arr.length-i-1;j++) {
    		  flag = false;
    		  if(arr[j]>arr[j+1]) {
    			  int temp = arr[j+1];
    			  arr[j+1]= arr[j];
    			  arr[j]=temp;
    			  flag =true;
    		  }
    			  
    	  }
    	  while(!flag) {
    		  break;
    	  }
    	  
    	  System.out.println(i+1+"趟排序结果："+ Arrays.toString(arr));  
      }
      
      
      for(int num: arr) {
    	  System.out.print(num+" ");
      }
      
      
	}

}
