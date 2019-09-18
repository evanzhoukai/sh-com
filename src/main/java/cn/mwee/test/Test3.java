package cn.mwee.test;

import org.apache.activemq.util.ThreadTracker;

import java.util.concurrent.TimeUnit;

/**
 * @author zhoukai
 * @Description:
 * @date 2019-09-18 21:20
 */
public class Test3 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Daemon(),"Deamon");
        thread.setDaemon(true);
        thread.start();
    }

    static class Daemon implements Runnable{
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
            }catch (Exception e){

            }finally {
                System.out.println("Daemon Thread finally run.");
            }
        }
    }
}
