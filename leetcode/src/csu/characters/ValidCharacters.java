package csu.characters;

import java.util.Stack;

public class ValidCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValid("([)");
		

	}
	public static boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i=1;i<=s.length()-1;i++){
           
            if(!stack.isEmpty()){
                if(stack.peek()=='('&&s.charAt(i)==')'){
                    stack.pop();
                }else if(stack.peek()=='{'&&s.charAt(i)=='}'){
                    stack.pop();
                }else if(stack.peek()=='['&&s.charAt(i)==']'){
                    stack.pop();
                }else {
                	 stack.push(s.charAt(i));
                }
               
               
            } else{
                stack.push(s.charAt(i));
           }

        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }

}
