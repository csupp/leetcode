package csu.characters;

import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
public class Count{
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] mask_ip = input.trim().split(" ");
       
        String maskString = mask_ip[0];
        String ip1_str = mask_ip[1];
        String ip2_str = mask_ip[2];
        
        String[] mask=maskString.split("\\.");
        String[] ip1= ip1_str.split("\\.");
        String[] ip2= ip2_str.split("\\.");
        String ip1_mask="";
        String ip2_mask="";
        for(int i=0;i<3;i++ ){
             ip1_mask += Integer.parseInt(ip1[i])&Integer.parseInt(mask[i]);
             ip2_mask += Integer.parseInt(ip2[i])&Integer.parseInt(mask[i]);
        }
        if(ip1_mask.equals(ip2_mask)){
            System.out.println(0); 
        }
        else{
            System.out.println(1);
        }
        
    }
	/**
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int result=0;
            for(int i =2;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    int ele = map.get(s.charAt(i));
                    result+=ele*Math.pow(16,s.length()-i-1);
              }
                else{
                    result+=Integer.parseInt(String.valueOf(s.charAt(i)))*Math.pow(16,s.length()-i-1);
                }
                
        }
            System.out.println(result);
    }
}
*/
}