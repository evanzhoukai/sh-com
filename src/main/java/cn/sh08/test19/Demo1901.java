package cn.sh08.test19;

import cn.mwee.base_common.utils.date.MwDateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zhoukai
 * @date 2019-08-19
 */
public class Demo1901 {

    public static void main(String[] args) {

        Date todayEnd = MwDateUtil.getTodayEnd();


        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 1);
        Date time = calendar.getTime();

        Date string2Date = MwDateUtil.getString2Date(MwDateUtil.getDate2String(time, MwDateUtil.yyyy_MM_dd) + " 00:00:00");
        System.out.println(todayEnd);
        System.out.println(string2Date);
        System.out.println(todayEnd.before(string2Date));
    }
}
