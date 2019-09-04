package cn.sh.test0903;

/**
 * java 实现单链表的逆序
 *
 * @author Administrator
 */
public class SingleLinkedReverse {

    /**
     * 单向链表。
     * |--|  ---> |--| --> |--|
     */
    class Node {
        // 当前节点数据
        int data;
        // 下一节点
        Node next;

        // 构造函数。
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SingleLinkedReverse slr = new SingleLinkedReverse();
        Node head, tail;
        // 构造链表头部
        head = tail = slr.new Node(0);
        // 构造链表其他节点。
        for (int i = 1; i < 10; i++) {
            Node p = slr.new Node(i);
            tail.next = p;
            tail = p;
        }
        tail = head;
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.next;
        }

//        head = reverse(head);
//        System.out.println(" ");
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
    }

    private static Node reverse(Node head) {
        Node p1, p2 = null;
        p1 = head;
        while (head.next != null) {
            p2 = head.next;
            head.next = p2.next;
            p2.next = p1;
            p1 = p2;
        }
        return p2;
    }
}
