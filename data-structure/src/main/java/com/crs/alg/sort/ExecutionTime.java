package com.crs.alg.sort;

/**
 * @author 刘小江
 * @version 1.0
 * @date 2022/3/23 23:38
 **/
public class ExecutionTime {
    public static void execute(String desc,Sort sort){
        long startTime = System.currentTimeMillis();
        sort.execute();
        long endTime = System.currentTimeMillis();
        System.out.println(desc + "执行的时间为："+(endTime - startTime));
    }
}
