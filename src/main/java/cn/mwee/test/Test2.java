package cn.mwee.test;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author zhoukai
 * @Description:
 * @date 2019-09-18 20:58
 */
public class Test2 {

    private static volatile boolean notStart = true;

    private static volatile boolean notEnd = true;

    public static void main(String[] args) throws Exception{

        List<Job> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            int priority = i<5?Thread.MIN_PRIORITY: Thread.MAX_PRIORITY;
            Job job = new Job(priority);
            list.add(job);
            Thread thread = new Thread(job,"Thread:"+i);
            thread.setPriority(priority);
            thread.start();
        }
        notStart =false;
        TimeUnit.SECONDS.sleep(10);
        notEnd = false;
        list.stream().forEach(val -> System.out.println("Job Priority: "+val.priority+" , Count: "+val.jobCount));

    }

    static class Job implements Runnable{

        private int priority;

        private long jobCount;

        public Job(int priority){
            this.priority = priority;
        }

        @Override
        public void run() {

            while (notStart){
                Thread.yield();
            }
            while (notEnd){
                Thread.yield();
                jobCount++;
            }

        }
    }
}
