package com.gfl.test1;


public class test5 {

    private static int totalNumber=2000;
    private static int wugui=2;
    private static int tuzi=5;
    private static String name;

    static Thread thread;
    static Thread thread1;

    public static void main(String[] args) {
      thread= new Thread(new Bisai());
      thread.setName("兔子");
      thread.start();

      thread1= new Thread(new Bisai());
      thread1.setName("乌龟");
      thread1.start();
    }

    static class Bisai implements Runnable{

        @Override
        public void run() {
                try {

                    while (totalNumber>0){
                        if(thread.getName().equals("乌龟")){
                            if(totalNumber<=0){
                                System.out.println("乌龟胜!");
                            }else {
                                System.out.println(thread.getName()+": 乌龟跑了"+wugui+"剩余"+(wugui-=totalNumber));
                                Thread.sleep(100);
                            }
                        }else if(thread1.getName().equals("兔子")){
                            if(totalNumber<=0){
                                System.out.println("兔子胜!");
                            }else {
                                System.out.println(thread1.getName()+": 兔子跑了"+tuzi+"剩余"+(tuzi-=totalNumber));
                                if((2000-totalNumber)%20==0){
                                    Thread.sleep(1000);
                                }else {
                                    Thread.sleep(100);
                                }
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

    }

}