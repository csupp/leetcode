package csu;

import java.util.HashSet;

public class TheKthNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,7,6,3,8,4,8};
		int k =5;
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int m =0;
		int[] arr_ = new int[set.size()];
		for (int value:set) {
			arr_[m++]=value;
			
		}
		
		
		getTheKthNumber(arr_,0,arr_.length-1,k);
		
		
		

	}
	
 public static void getTheKthNumber(int [] arr,int low,int high, int k) {
	 
	 if(low<high) {
		 int index = getIndex(arr,low,high,k);
		 if(index==arr.length-k) {
			 System.out.println(arr[index]);
		 }
		 else if(index<arr.length-k) {
			 getTheKthNumber(arr, index+1, high, k);
		 }else {
			 getTheKthNumber(arr, low, index-1, k);
		 }
		 
		
		
		 
	 }
	 	 
 }
 
 public static int getIndex(int[] arr,int i, int j,int k) {
	 
	 int temp = arr[i];
	 while(i<j) {
		 while(i<j&&arr[j]>=temp) {
			 j--;
		 }
		 arr[i]= arr[j];
		 while(i<j&&arr[i]<=temp) {
			 i++;
		 }
		 arr[j]=arr[i];
		
		 
	 }
	 arr[i]=temp;
	
	
	 return i;
 }
	
 
}
