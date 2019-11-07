package com.zhaojh.method;

/**
 * @author : zhaojh
 * @date : 2019-11-07
 * @function : 单例模式---懒汉式   线程不安全  实现了懒加载
 */

public class SingletonThree {

    /**
     * 1.构建静态实例变量
     */
    private static SingletonThree singletonThree;

    /**
     * 2。构造方法的私有化
     */
    private SingletonThree(){}

    public static SingletonThree getInstance(){
        if(singletonThree == null){
            singletonThree = new SingletonThree();
        }
        return singletonThree;
    }


    public static void main(String[] args) {

        System.out.println("获取单例实例："+SingletonThree.getInstance());

    }
}
