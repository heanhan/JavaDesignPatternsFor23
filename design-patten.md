###  单例模式的学习（共有8种）

    单例模式的介绍：
        要求：单例模式要求类能够有返回对象一个引用（永远是同一个）和一个获得该实例的方法（必须是静态方法）
    
        实现步骤：1. 构造方法私有化，这样无法通过该类的构造方法来实例化对象，只有通过提供的静态方法来得到该类的唯一实例。
                 2. 在该类内部提供一个静态方法，当我们调用这个方法时，如果类持有的引用不为空就返回这个引用，如果类保持为空就创建该类的实例
                并将该实例的引用赋予该类保持的引用。
        
        第一种单例模式---饿汉模式(静态常量)：（线程安全） 
        见代码：SingletonOne