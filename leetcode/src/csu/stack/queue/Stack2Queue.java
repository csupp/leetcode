package csu.stack.queue;

import java.util.Stack;

/**
 * @author admin
 * @create 3.5.22 11:36 上午
 */
public class Stack2Queue<T> {

    Stack<T> stack1 = new Stack<T>();
    Stack<T> stack2 = new Stack<T>();

    public boolean offer(T e){
        stack1.push(e);
        return true;
    }

    public T poll(){
        if(stack2.size()!=0){
            return stack2.pop();
        }else{
            while(stack1.size()!=0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public T peek(){

      return null;
    }


}
