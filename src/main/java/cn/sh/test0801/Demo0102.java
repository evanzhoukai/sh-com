package cn.sh.test0801;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhoukai
 * @date 2019-08-01
 */
public class Demo0102 {

    public static void main(String[] args) throws Exception {
        int total = 800;
        ExecutorService executorService = new ThreadPoolExecutor(
                200, total, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(total));
        for (int i = 0; i < total; i++) {
            executorService.execute(consumer(i + "【线程】"));
        }

    }

    static Runnable consumer(String name) {
        return () -> {
            try {
                ProducePool producePool = new ProducePool();
                producePool.consumerMessageQueue(name);
            } catch (Exception e) {

            }
        };
    }
}
