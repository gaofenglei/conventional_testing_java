package com.gfl.test1;

import java.io.File;

public class test3 {

    // 算 n 的阶乘(假设n不为0)
      public static int a(int n){
            if(n <= 2){
                return n;
            }
            // 把 f(n) 的等价操作写进去
            return a(n-1) * n;
        }

   //斐波那契数列的是这样一个数列：1、1、2、3、5、8、13、21、34…，即第一项 f(1) = 1,第二项 f(2) = 1…,第 n 项目为 f(n) = f(n-1) + f(n-2)。求第 n 项的值是多少。
      public static int b(int n){
            // 1.先写递归结束条件
            if(n <= 2){
                return 1;
            }
            // 2.接着写等价关系式
            return b(n-1) + b(n - 2);
        }

   //计算1到n的和
        public static int c(int n){
            if(n==1){
                return 1;
            }

            System.out.println(c(n-1)+n);
            return c(n-1)+n; //n是3 和是6
        }


    private static void getAllfile(File file) {
        File[] files = file.listFiles();//这里需要一个File数组
        for (File file1 : files) {
            if(file1.isDirectory()){//判断是不是文件夹
                getAllfile(file1);
            }else {
                System.out.println(file1);
            }
        }

    }

    //反转abcdefg字符串
    public static String reverseStr(String str){

          if(str.length()<=1){
              return str;
          }

          return reverseStr(str.substring(1))+str.substring(0,1);
    }

    //如何判断一个字符串是否是回文。友情提示，可以把问题分解成判断头尾两个字符和除了头尾之外的子字符串都是否符合回文条件。

    public static void main(String[] args) {
        //System.out.println(a(2));//5*4*3*2*1
        for (int i = 1; i <50 ; i++) {
            System.out.println(b(i));
        }
        //System.out.println(c(4));
        //File file = new File("E:\\shop_admin_gaosb");
        //getAllfile(file) ;
        //System.out.println(reverseStr("abc"));

       /* String str="abcdefg";
        System.out.println(str.substring(1));
        System.out.println(str.substring(0,1));*/
    }

}
