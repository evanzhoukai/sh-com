package cn.sh.test0806;

import lombok.Data;

import java.util.concurrent.Callable;

@Data
class DemoZhou implements Callable<Integer> {

    public DemoZhou(int i) {
        this.i = i;
    }

    private int i;

    @Override
    public Integer call() throws Exception {
        i = i + 1;
        return i;
    }
}