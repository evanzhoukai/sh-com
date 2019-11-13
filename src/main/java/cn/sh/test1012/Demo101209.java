package cn.sh.test1012;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author zhoukai
 * @date 2019/11/12
 */
public class Demo101209 {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList();
        String s = "1,2,3,4,5,6,7,8,9,101,102,103";
        String[] split = StringUtils.split(s, ",");
        list = Lists.newArrayList(split);
        System.out.println(list.size());

    }
}
