package math.stackAndQueue;

import java.util.Stack;
/*
*getMin的栈
 */
public class MyStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(1);
        myStack.push(24);
        System.out.println(myStack.getMin());
        Integer pop = myStack.pop();
        System.out.println(myStack.getMin());
        Integer pop1 = myStack.pop();

        System.out.println(myStack.getMin());
    }

    public void push(Integer i){
        stack1.push(i);
        if (stack2.isEmpty()){
            stack2.push(i);
        }else if(getMin()<i){
            stack2.push(getMin());
        }else{
            stack2.push(i);
        }
    }

    public Integer pop(){
        if (stack1.isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        Integer value = stack1.pop();
        stack2.pop();
        return value;
    }

    public Integer getMin(){
        if (stack2.isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        return this.stack2.peek();
    }
}
