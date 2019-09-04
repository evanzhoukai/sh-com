package cn.sh.test0801;

/**
 * @author zhoukai
 * @date 2019-08-01
 */
public class Demo0101 {

    public static void main(String[] args) throws Exception {
        ProducePool producePool = new ProducePool();
        producePool.consumerMessage("lucy");
        //producePool.close();

    }

}
