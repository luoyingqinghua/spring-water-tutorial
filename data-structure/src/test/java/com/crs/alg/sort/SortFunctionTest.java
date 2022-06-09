package com.crs.alg.sort;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 排序功能测试
 * @author 刘小江
 * @version 1.0
 * @date 2022/3/24 22:08
 **/
class SortFunctionTest {
    // S O R T E X A M P L E
//   static String[] target = {"S","O","R","T","E","X","A","M","P","L","E"};
   // 1,5,19,20,2,11,15,17
   static Integer[] target = {1,5,19,20,2,11,15,17};

    @BeforeAll
    static void before(){
        System.out.println("打印原始数组");
        Sortion.show(target);
    }

    // 插入排序
    @Test
    void testInsertion(){
        new Insertion().sort(target);
        System.out.println("打印插入排序后数组");
        Insertion.show(target);
        Assertions.assertTrue(Insertion.isSorted(target));
    }

}