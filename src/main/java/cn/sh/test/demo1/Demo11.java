package cn.sh.test.demo1;

import java.util.concurrent.*;

/**
 * @author zhoukai
 * @date 2019-02-14
 */
public class Demo11 {

    /**
     * 多线程同时运行
     *
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(20, 100, 2000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(2));
        Semaphore semaphore = new Semaphore(5);
        //最多有3个线程同时运行

        for (int i = 0; i < 20; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire(); //获取许可
                        System.out.println("线程" + Thread.currentThread().getName() +
                                "进入，当前已有" + (5 - semaphore.availablePermits()) + "线程并发");
                        Thread.sleep((long) Math.random() * 5000);
                        //随机sleep 0 ~ 500ms
                        semaphore.release();
                        System.out.println("线程" + Thread.currentThread().getName()
                                + "已离开，当前还有" + (5 - semaphore.availablePermits()) + "线程并发");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        System.exit(1);

    }
}
