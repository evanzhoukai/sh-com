package cn.sh.test.demo5;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 菩提树下的杨过 on 05/09/2017.
 */
public class OOMTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        int max = 100;
        for (int i = 0; i < max; i++) {
            Thread t = new Thread() {
                public void run() {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            };
            t.setName("thread-" + i);
            t.start();
        }
        Thread t = new Thread() {
            public void run() {
                int i = 0;
                while (true) {
                    i = (i++) / 10;
                }
            }
        };
        t.setName("BUSY THREAD");
        t.start();
        System.out.println("ready");
        latch.await();
    }

}