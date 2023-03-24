package csu.stack.queue;

/**
 * @author admin
 * @create 3.5.22 11:33 上午
 */


import java.util.LinkedList;
import java.util.Queue;

public class Queue2Stack {
    Queue<Integer> queue1= new LinkedList<Integer>();
    Queue<Integer> queue2= new LinkedList<Integer>();

    /**
     * 两个队列实现栈
     * @param x
     */
    public void push2(int x) {
        queue2.offer(x);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2= temp;
    }

    /**
     * 单个队列实现栈
     * @param x
     */
    public void push1(int x){
            int n = queue1.size();
            queue1.offer(x);
            for(int i=0;i<n;i++){
                queue1.offer(queue1.poll());
            }
        }

        public int pop() {
            return queue1.poll();

        }

        public int top() {
            return    queue1.peek();
        }

        public boolean empty() {

            return queue1.isEmpty();
        }
    }



