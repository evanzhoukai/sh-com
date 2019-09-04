package cn.sh.test0904;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 单链表 倒序
 *
 * @author zhoukai
 * @date 2019/9/4
 */
public class LinkDemo {

    public static void main(String[] args) {

        // 构造一个节点
        Node tail = new Node(0);
        // 赋值给 头
        Node head = tail;
        for (int i = 1; i < 10; i++) {
            Node p = new Node(i);
            tail.setNext(p);
            tail = p;
        }
        tail = head;
        //demo(tail);
        System.out.println("============分隔========");
        demo1(tail);
        System.out.println("------------分隔========");
        while (tail != null) {
            System.out.println(tail.getData());
            tail = tail.getNext();
        }

    }

    public static void demo(Node tail) {
        Stack<Integer> stack = new Stack<>();
        while (tail != null) {
            stack.push(tail.getData());
            tail = tail.getNext();
        }
        // 倒序
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void demo1(Node tail) {
        Queue<Integer> queue = new LinkedBlockingDeque<>();
        while (tail != null) {
            queue.add(tail.getData());
            tail = tail.getNext();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


}
