package cn.sh.test0806;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author zhoukai
 * @date 2019-08-06
 */
public class Demo0601 {


    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        DemoZhou demo = new DemoZhou(3);
        FutureTask<Integer> futureTask = new FutureTask<>(demo);
        executorService.submit(futureTask);
        executorService.shutdown();
        Integer integer = futureTask.get();
        System.out.println(integer);
    }

}
