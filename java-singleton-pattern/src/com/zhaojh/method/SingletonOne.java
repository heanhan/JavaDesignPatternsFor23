package com.zhaojh.method;

/**
 * @author : zhaojh
 * @date : 2019-11-07
 * @function :单例模式  饿汉式   线程安全   本质使用静态常量
 *  优点：写法简单明了，就是在类转载的时候就完成实例化，避免了线程的同步问题
 *  缺点：在类加载的时候就完成实例化，没有达到Lazy Loading 的效果，如果从始至终未使用过这个实例，则会造成内存的浪费。
 *
 * */


public class SingletonOne {

    /**
     * 1、提供静态常量
     */

    private final static SingletonOne singletonOne= new SingletonOne();


    /**
     * 2、构造方法的私有化
     */
    private SingletonOne(){}

    /**
     *
     * 3、对外提供获取实例的方法
     */
    public static SingletonOne getInstance(){
        return singletonOne;
    }


    public static void main(String[] args) {
        SingletonOne instance = SingletonOne.getInstance();
        System.out.println("获取的单例的实例为："+instance);
    }
}
