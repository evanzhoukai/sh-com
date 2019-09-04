package cn.sh.test0801;

import javax.jms.JMSException;
import java.util.Random;

/**
 * @author hzk
 * @date 2018/3/31
 */
public class ProduceTest {

    public static void main(String[] args) throws JMSException, InterruptedException {
        ProducePool producePool = new ProducePool();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(random.nextInt(3) * 1000);
            producePool.produceMessage("Hello,ActiveMQ! Number:" + i);

        }
        producePool.close();
    }
}

