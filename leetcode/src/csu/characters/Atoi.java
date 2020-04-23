package csu.characters;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(myAtoi("-42"));
		System.out.println(myAtoi("-4w2"));
		System.out.println(myAtoi("-91283472332"));
		System.out.println(myAtoi("91283472332"));

	}
	
	public static int myAtoi(String str) {

		 char[] cs = str.trim().toCharArray();
	        if(cs.length==0){
	            return 0;
	        }
	        boolean flag = true;
	        int index=0;
	        int result=0;
	        if(cs[0]=='-'){
	            flag=false;
	            index++;
	        }
	        else if(cs[0]=='+'){
	            flag= true;
	            index++;
	        }
	        for(int i=index;i<cs.length;i++){
	             if('0'<=cs[i]&&cs[i]<='9'){
	            	 if(flag) {
	            		 if(result>(Integer.MAX_VALUE/10)|| result==(Integer.MAX_VALUE/10)&&(cs[i]-'0')>Integer.MAX_VALUE%10) {
	                		 return Integer.MAX_VALUE;
	                		 }else {
	                		 result = result*10+(cs[i]-'0');
	                	 }
	            		 
	            	 }else {
	            		 if(-result<(Integer.MIN_VALUE/10)|| -result==(Integer.MIN_VALUE/10)&&(cs[i]-'0')>-(Integer.MIN_VALUE%10)) {
	            			return Integer.MIN_VALUE;
	            			 
	            		 }
	            		 else {
	            			 result = result*10+(cs[i]-'0');
	            		 }
	            	 }
	            	
	                 
	             }else if(cs[i]>'9'|| cs[i]<'0'){
	                 break;
	             }
	        }
	       
	        result = flag?result:-result;
	      

	        return result;

		}   
        

}
