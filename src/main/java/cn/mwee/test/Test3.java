package cn.mwee.test;

import java.util.concurrent.TimeUnit;

/**
 * @author zhoukai
 * @Description:
 * @date 2019-09-19
 */
public class Test3 {

    /***
     * 守护线程。
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Daemon(), "Deamon");
        thread.setDaemon(true);
        thread.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("hook 。结束了。")));
        TimeUnit.SECONDS.sleep(5);
    }

    static class Daemon implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Daemon Thread=====");
                }
            } catch (Exception e) {

            } finally {
                System.out.println("Daemon Thread finally run.");
            }
        }
    }
}
