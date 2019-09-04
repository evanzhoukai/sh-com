package cn.sh.test0806;

import java.util.concurrent.FutureTask;

/**
 * @author zhoukai
 * @date 2019-08-06
 */
public class Demo0602 {

    public static void main(String[] args) throws Exception {
        DemoZhou demoZhou = new DemoZhou(5);
        FutureTask<Integer> task = new FutureTask<>(demoZhou);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get());
    }
}
