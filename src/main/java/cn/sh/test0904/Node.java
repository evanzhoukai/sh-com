package cn.sh.test0904;

import lombok.Data;

/**
 * 单链表
 *
 * @author zhoukai
 * @date 2019/9/4
 */
@Data
public class Node {

    /**
     * 当前节点数据
     */
    private int data;

    /***
     * 下一节点。
     */
    private Node next;

    /***
     * 有参构造
     * @param data
     */
    public Node(int data) {
        this.data = data;
    }


}
