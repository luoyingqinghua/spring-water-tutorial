## 排序算法
定义一个顶层排序抽象类，提供一些公用的方法

判断是否小于

打印可排序数组

判断是否升序排序数组

java中需要排序的对象通常是javaBean，能够排序的javaBean必须实现Comparable接口，因此设计这些方法采用顶层Comparable数组

我们默认实现所有排序算法最终是升序排列

用例：

排序前序列：S O R T E X A M P L E

排序后序列：A E E L M O P R S T X
###插入排序