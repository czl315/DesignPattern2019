package com.czl.thread.synchronizedDemo;

/**
 * czl
 * createTime:2019/10/11
 */
public class NoSynchronized implements Runnable {
    private static int count=0;
    private static volatile long currentTimeStart = 0;

    @Override
    public void run() {
        noSynAdd();
//        synAdd();
    }

    public static void noSynAdd(){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            count++;
        if(count==5000){
            System.out.println("count-end-currentTime:"+(System.currentTimeMillis()-currentTimeStart));
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("count-start:"+count);
        currentTimeStart = System.currentTimeMillis();
        System.out.println("count-start-currentTime:"+currentTimeStart);
        for(int i=0;i<7000;i++){
            new Thread(new NoSynchronized()).start();
        }

        for (int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(count);
        }

        System.out.println("多线程中如果对共享变量进行操作的话，可能会引发安全性问题。");
    }
}
