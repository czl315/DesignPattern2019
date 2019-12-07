package com.czl.thread.synchronizedDemo;

/**
 * czl
 * createTime:2019/10/11
 */
public class SynCodeObject implements Runnable {
    private static int count=0;
    private static volatile long currentTimeStart = 0;
    private static Object lockObj ;

    public SynCodeObject(Object LockObj) {
        this.lockObj = LockObj;
    }

    @Override
    public void run() {
        synObject();//性能：   1234    5195    3233    3496
    }

    /**
     * 锁定方法
     */
    public static void synObject(){
        synchronized (lockObj){
            count++;
            if(count==5000){
                System.out.println("count-end-currentTime:"+(System.currentTimeMillis()-currentTimeStart));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("count-start:"+count);
        currentTimeStart = System.currentTimeMillis();
        System.out.println("count-start-currentTime:"+currentTimeStart);
        for(int i=0;i<7000;i++){
            new Thread(new SynCodeObject(new Object())).start();
        }

        for (int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(count);
        }

        System.out.println("多线程中如果对共享变量进行操作的话，可能会引发安全性问题。可以使用synchnized加锁");
    }
}
