package com.czl.thread;

/**
 * czl
 * createTime:2019/10/11
 */
public class NoSync implements Runnable {
    private static int count=0;

    @Override
    public void run() {
//        noSynAll();
        synAdd();
    }

    public static void noSynAdd(){
//        synchronized (NoSync.class){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
//        }
    }

    /**
     * 锁定方法
     */
    public synchronized static void synAdd(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("count-start:"+count);
        for(int i=0;i<5000;i++){
            new Thread(new NoSync()).start();
        }

        for (int i=1;i<=10;i++){
            Thread.sleep(1000);
            System.out.println(count);
        }
    }
}
