package com.gfl.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test4 {

    public static void main(String[] args) {
        Lock lock=new ReentrantLock();//ReentrantLock是lock的子类
        lock.lock();//获取锁对象
        lock.unlock();//释放锁资源
    }

}
