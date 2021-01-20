package com.gfl.test1;

public class multithreading extends Thread{

    public  static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
    }

   static class A extends Thread {

       @Override
       public synchronized void run() {
           try {
               System.out.println("吃饭");
               this.wait(5000);
               this.notify();
               System.out.println("吃完了");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

   }

   static class B extends Thread {

       @Override
       public void run() {
           try {
               System.out.println("睡觉");
               Thread.sleep(500);
               System.out.println("睡醒了");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }

    static class C extends Thread {

        @Override
        public void run() {
            try {
                System.out.println("打游戏");
                Thread.sleep(500);
                System.out.println("打完了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
