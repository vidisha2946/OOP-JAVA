public class WhatWhen
    {
        public static void main(String[] args){
            TempThread tt =new TempThread();
            tt.start();
            System.out.println("program completed");
        }
    }
    class TempThread extends Thread{
        public void run(){
            for (long i=0;i<10000000000l;i++){

            }
            System.out.println("loop completd");
        }
    }
