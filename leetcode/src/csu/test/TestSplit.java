package csu.test;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class TestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Integer a = 1000;
		Integer b = 1000;
		Integer c = -128;
		Integer d = -128;
		System.out.println(a==b);
		System.out.println(c==d);
		//System.out.print(Math.sqrt(5));
		for(int i=0;i<=1000;i++) {
			int result=getRandom_0_1000();
			if(result==1000 ||result==0 ) {
				System.err.println("*********"+result);
			}else {
				System.out.println(result);
			}
			
		}
		
		
		

		
	}
	
	 public static int getRandom() {
		 Random rand = new Random();
		 return rand.nextInt(2);
		 
	 }
	 public static int getRandomNum() {
		 StringBuffer buffer = new StringBuffer();
		 for(int i=0;i<10;i++) {
			 buffer.append(getRandom());
		 }
		 int result = Integer.valueOf(buffer.toString(),2);
		return  result;
		 
	 }
	 public static int getRandom_0_1000() {
		 
		int randomNumber = getRandomNum();
		if( randomNumber<=1000) {
			return randomNumber;
		}else {
			return getRandom_0_1000();
		}
		 
	 }

}
