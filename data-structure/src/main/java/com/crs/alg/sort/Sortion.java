package com.crs.alg.sort;

/**
 * @author 刘小江
 * @version 1.0
 * @date 2022/3/23 23:24
 **/
public abstract class Sortion {

    /** 判断v是否小于w */
    protected static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }
    /** 在数组中调换两个元素的位置 */
    protected static void swapPos(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i] = a[j];
        a[j] = t;
    }
    /** 打印数组内容 */
    public static void show(Comparable[] a){
        System.out.println("打印数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    /** 判断是升序排列的数组 */
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
    /** 需要子类实现的具体排序方法 */
    public abstract void sort(Comparable[] a);
}
