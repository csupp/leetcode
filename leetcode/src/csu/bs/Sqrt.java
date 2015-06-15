package csu.bs;

public class Sqrt {
     public static int mySqrt(int x){
    	 if(x==0)
    		 return 0;
    	 int left =1,right = x, result = 0;
    	 while(left<=right){
    		 int mid =(right+left)/2;
    		 if(mid<=x/mid){
    			 left = mid +1;
    			 result = mid;
    		 }else{
    			 right = mid -1;
    		 }
    	 }
    	 return result;
     }
     
     public static void main(String[] args) {
		System.out.println(mySqrt(4));
	}
}
