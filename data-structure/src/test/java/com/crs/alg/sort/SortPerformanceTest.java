package com.crs.alg.sort;

import com.github.jsonzou.jmockdata.JMockData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 排序性能测试
 * @author 刘小江
 * @version 1.0
 * @date 2022/3/24 22:08
 **/
public class SortPerformanceTest {

    static int N = 10000;
    static Integer target[] = new Integer[N];

    @BeforeAll
    static void before(){
        for (int i = 0; i < N; i++) {
            target[i] = JMockData.mock(Integer.class);
        }
        System.out.println("排序前数组：");
        Sortion.show(target);
    }
    // 插入排序
    @Test
    void testInsertion(){
        ExecutionTime.execute("插入排序",()->{
            new Insertion().sort(target);
        });
        System.out.println("排序后数组：");
        Sortion.show(target);
    }
}
