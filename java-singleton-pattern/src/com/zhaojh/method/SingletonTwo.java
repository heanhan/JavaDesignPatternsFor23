package com.zhaojh.method;

/**
 * @author : zhaojh
 * @date : 2019-11-07
 * @function : 单例模式----饿汉式（静态代码块） 线程安全
 *
 *  优点：代码初始化是已经进行了实例化的操作
 *  缺点：实例化的对戏那个如果不用，造成内存的浪费
 *
 */

public class SingletonTwo {

    /**
     * 1.定义静态类对象
     */
    private static SingletonTwo singletonTwo;

    /**
     * 2.构建 静态代码块
     */
    static{
        singletonTwo = new SingletonTwo();
    }

    /**
     * 3.构造方法私有化
     */
    private SingletonTwo(){}

    /**
     * 4.对外提供统一的获取实例的入口
     */
    public static SingletonTwo getInstance(){
        return singletonTwo;
    }

    public static void main(String[] args) {
        System.out.println("通过静态代码块获取的单例的值"+SingletonTwo.getInstance());

    }
}
