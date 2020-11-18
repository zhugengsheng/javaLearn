package javaCode.two;

import java.util.LinkedList;

class CQueue {
    LinkedList<Integer> stack1 = null;
    LinkedList<Integer> stack2 = null;
    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (stack1.size()>0){
                stack2.push(stack1.poll());
            }
            return stack2.size()>0?stack2.poll():-1;
        }else{
            return stack2.poll();
        }

    }
}