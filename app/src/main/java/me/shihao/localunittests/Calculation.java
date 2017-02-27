package me.shihao.localunittests;

import android.util.Log;

/**
 * Created by shihao <1406504841@qq.com> on 2017/2/27.16:18
 */

public class Calculation {

    /**
     * 简单模拟平时编写的方法
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        Log.d("TAG", "add");
        return a + b;
    }

    public int multiply(int one, int another) {
        return one * another;
    }

}
