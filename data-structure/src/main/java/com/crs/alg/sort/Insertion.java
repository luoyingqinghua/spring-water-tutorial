package com.crs.alg.sort;

/**
 * @author 刘小江
 * @version 1.0
 * @date 2022/3/23 23:20
 **/
public class Insertion extends Sortion{
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                swapPos(a,j,j-1);
            }
        }
    }
}
