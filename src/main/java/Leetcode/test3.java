package Leetcode;

import java.util.Stack;

public class test3 {
    public static int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int i = 0;
        int num= 0;
        while (!stack.isEmpty()){
            Integer pop = stack.pop();
            num += pop * Math.pow(2,i);
            i++;
        }
        return num;
    }

    public static void main(String[] args) {
        int b = Integer.MAX_VALUE;
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        getDecimalValue(listNode);
    }
}
