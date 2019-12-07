package com.czl.thread.synchronizedDemo;

/**
 * czl
 * createTime:2019/10/11
 */
public class SynStaticMethodAndClass implements Runnable {
    private static int count=0;
    private static volatile long currentTimeStart = 0;

    @Override
    public void run() {
//        addSynStaticMothed();//性能：1668  1596    2860
        addSynClass();//性能：1273 1180    1258    1817
    }

    /**
     * 锁定方法
     */
    public synchronized static void addSynStaticMothed(){
        count++;
        if(count==5000){
            System.out.println("count-end-currentTime:"+(System.currentTimeMillis()-currentTimeStart));
        }
    }

    public static void addSynClass(){
        synchronized (SynStaticMethodAndClass.class) {
            count++;
            if (count == 5000) {
                System.out.println("count-end-currentTime:" + (System.currentTimeMillis() - currentTimeStart));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("count-start:"+count);
        currentTimeStart = System.currentTimeMillis();
        System.out.println("count-start-currentTime:"+currentTimeStart);
        for(int i=0;i<7000;i++){
            new Thread(new SynStaticMethodAndClass()).start();
        }

        for (int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(count);
        }

        System.out.println("多线程中如果对共享变量进行操作的话，可能会引发安全性问题。可以使用synchnized加锁");
    }
}
