package com.czl.thread;

import com.czl.thread.create.CzlThread;
import com.czl.thread.create.CzlThreadImplFace;

/**
 *
 */
public class CzlThreadTest {
    public static void main(String[] args) {
        CzlThread t1 = new CzlThread();
        CzlThread t2 = new CzlThread();
        CzlThreadImplFace t3 = new CzlThreadImplFace();
        CzlThreadImplFace t4 = new CzlThreadImplFace();
        t1.start();
        t2.start();
        new Thread(t3).start();
        new Thread(t4).start();
    }
}
