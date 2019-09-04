package cn.sh.test0801;

import javax.jms.JMSException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author hzk
 * @date 2018/3/31
 */
public class ProduceTest02 {


    public static void main(String[] args) throws JMSException, InterruptedException {
        int total = 8000000;

        ExecutorService executorService = new ThreadPoolExecutor(
                100, total, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(total));

        for (int i = 0; i < 10; i++) {
            executorService.execute(produce(i, total));
        }


    }

    static Runnable produce(int thread, int total) {
        return () -> {
            try {
                ProducePool producePool = new ProducePool();
                producePool.initializeQueue();
                for (int i = 0; i < total; i++) {
                    producePool.produceMessageQueue("线程【" + thread + "】Hello,ActiveMQ! Number:" + i);
                }
                producePool.close();
            } catch (Exception e) {
            }
        };
    }


}

