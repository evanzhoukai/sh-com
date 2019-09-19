package cn.mwee.test;

/**
 * @author zhoukai
 * @date 2019/9/19
 */
public class Test4 {
    private static final long count = 100001;

    /**
     * 多线程 与单线程 速度比较。
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        concurrent();
        serial();
    }

    /**
     * 多线程
     *
     * @throws Exception
     */
    private static void concurrent() throws Exception {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long end = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("【concurrent times 】" + end + " ms,b = " + b);
    }

    /**
     * 单线程
     */
    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("【serial times 】" + time + " ms ,b =  " + b);
    }

}
