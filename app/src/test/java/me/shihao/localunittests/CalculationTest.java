package me.shihao.localunittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by shihao <1406504841@qq.com> on 2017/2/27.16:40
 */
public class CalculationTest {

    Calculation calculation;

    @BeforeClass
    public static void start() throws Exception {
        System.out.println("类运行时调用一次");
    }

    @AfterClass
    public static void end() throws Exception {
        System.out.println("类结束时调用一次");
    }

    @Before
    public void before() throws Exception {
        calculation = new Calculation();
        System.out.println("每个test方法前都会调用");
    }

    @After
    public void after() throws Exception {
        System.out.println("每个test方法后都会调用");
    }

    @Test
    public void add() throws Exception {
        System.out.println("test add");
        int r = calculation.add(2, 3);
        Assert.assertEquals(5, r);
    }

    @Test
    public void multiply() throws Exception {
        System.out.println("test multiply");
        int r = calculation.multiply(2, 3);
        Assert.assertEquals(6, r);
    }

}