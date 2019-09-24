package cn.sh.test0916;

import cn.mwee.base_common.helper.concurrent.MwThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhoukai
 * @date 2019/9/24
 */
public class Demo091609 {

    public static void main(String[] args) {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(100);
        executor.setQueueCapacity(1000);
        executor.setKeepAliveSeconds(1000);
        executor.setThreadNamePrefix("tsak-asyn");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        executor.initialize();
        MwThreadPoolTaskExecutor threadPoolTaskExecutor = new MwThreadPoolTaskExecutor(executor);
        threadPoolTaskExecutor.execute(() -> print("dd"));
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("结束。")));
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("也结束。");
            }
        }));
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("")));


    }

    public static void print(String name) {
        System.out.println("输入文本是：" + name);

    }
}
