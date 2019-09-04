package cn.sh.test0801;

import javax.jms.JMSException;

/**
 * P2P 发送一条消息
 *
 * @author hzk
 * @date 2018/3/31
 */
public class ProduceTest04 {


    public static void main(String[] args) throws JMSException, InterruptedException {

        ProducePool producePool = new ProducePool();
        producePool.initializeQueue();
        for (int i = 0; i < 1; i++) {
            producePool.produceMessageQueue("线程【" + 1 + "】Hello,ActiveMQ! Number:" + i);
        }
        producePool.close();

    }


}

