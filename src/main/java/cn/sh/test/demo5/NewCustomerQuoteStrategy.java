package cn.sh.test.demo5;

import java.math.BigDecimal;

//新客户的报价策略实现类
public class NewCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("抱歉！新客户没有折扣！");
        return originalPrice;
    }
}