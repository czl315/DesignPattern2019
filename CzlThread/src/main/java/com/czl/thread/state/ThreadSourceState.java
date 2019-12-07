package com.czl.thread.state;

import java.util.concurrent.locks.LockSupport;

/**
 * czl
 * createTime:2019/11/21
 * 线程源代码-线程6种状态:参考《java.lang.Thread》
 * NEW新增；RUNNABLE可运行；BLOCKED阻塞；WAITING等待；TIMED_WAITING设定时间的等待；TERMINATED终止
 */
public class ThreadSourceState {
    /**
     * A thread state.  A thread can be in one of the following states:
     * 一种线程状态。一个线程可以是下面状态中的一种
     * <ul>
     * <li>{@link #NEW}<br>
     *     A thread that has not yet started is in this state.
     *     NEW新增：尚未启动的线程处于这种状态
     *     </li>
     * <li>{@link #RUNNABLE}<br>
     *     A thread executing in the Java virtual machine is in this state.
     *     RUNNABLE可运行：在Java虚拟机中执行的线程处于这种状态。
     *     </li>
     * <li>{@link #BLOCKED}<br>
     *     A thread that is blocked waiting for a monitor lock
     *     is in this state.
     *     BLOCKED阻塞：在等待监视器锁时阻塞的线程处于这种状态。
     *     </li>
     * <li>{@link #WAITING}<br>
     *     A thread that is waiting indefinitely for another thread to
     *     perform a particular action is in this state.
     *     WAITING等待：一个线程无限期地等待另一个线程执行某个特定的操作，它处于这种状态。
     *     </li>
     * <li>{@link #TIMED_WAITING}<br>
     *     A thread that is waiting for another thread to perform an action
     *     for up to a specified waiting time is in this state.
     *     TIMED_WAITING设定时间的等待：在指定的等待时间内等待另一个线程执行操作的线程处于这种状态。
     *     </li>
     * <li>{@link #TERMINATED}<br>
     *     A thread that has exited is in this state.
     *     TERMINATED终止：退出的线程处于这种状态。
     *     </li>
     * </ul>
     *
     * <p>
     * A thread can be in only one state at a given point in time.
     * These states are virtual machine states which do not reflect
     * any operating system thread states.
     * 在给定的时间点上，线程只能处于一种状态。这些状态是不反映任何操作系统线程状态的虚拟机状态。
     *
     * @since   1.5
//     * @see #getState
     */
    public enum State {
        /**
         * Thread state for a thread which has not yet started.
         * 尚未启动的线程的线程状态。
         */
        NEW,

        /**
         * Thread state for a runnable thread.  A thread in the runnable
         * state is executing in the Java virtual machine but it may
         * be waiting for other resources from the operating system
         * such as processor.
         * 可运行线程的线程状态。处于runnable *状态的线程正在Java虚拟机中执行，但是它可能在等待操作系统中的其他资源，比如处理器。
         */
        RUNNABLE,

        /**
         * Thread state for a thread blocked waiting for a monitor lock.
         * A thread in the blocked state is waiting for a monitor lock
         * to enter a synchronized block/method or
         * reenter a synchronized block/method after calling
         * {@link Object#wait() Object.wait}.
         * 等待监视器锁的阻塞线程的线程状态。
         * 一个线程处于阻塞状态是等待一个锁的监控器进入synchronized代码块或方法，或被wait()呼叫后重入synchronized代码块或方法
         */
        BLOCKED,

        /**
         * Thread state for a waiting thread.
         * 一种等待线程的状态
         * A thread is in the waiting state due to calling one of the
         * following methods:
         * 一个线程处于等待状态是由于下面方法之一调用了
         * <ul>
         *   <li>{@link Object#wait() Object.wait} with no timeout</li>
         *   对象等待未超时
         *   <li>{@link # join() Thread.join} with no timeout</li>
         *   对象join为超时
         *   <li>{@link LockSupport#park() LockSupport.park}</li>
         *   LockSupport.park
         * </ul>
         *
         * <p>A thread in the waiting state is waiting for another thread to
             * perform a particular action.
         * 一个线程处于等待状态是在等另一个线程执行一个特定行为
         *
         * For example, a thread that has called <tt>Object.wait()</tt>
         * on an object is waiting for another thread to call
         * <tt>Object.notify()</tt> or <tt>Object.notifyAll()</tt> on
         * that object. A thread that has called <tt>Thread.join()</tt>
         * is waiting for a specified thread to terminate.
         * 例如，一个线程被Object.wait()调用，一个对象等待另一个线程调用Object.notify()或Object.notifyAll()在那个对象上。
         * 一个调用Thread.join()等待一个特殊的线程终止。
         */
        WAITING,

        /**
         * Thread state for a waiting thread with a specified waiting time.
         * 一种带有特定等待时间的线程状态。
         * A thread is in the timed waiting state due to calling one of
         * the following methods with a specified positive waiting time:
         * <ul>
         *   <li>{@link # sleep Thread.sleep}</li>
         *   <li>{@link Object#wait(long) Object.wait} with timeout</li>
         *   <li>{@link # join(long) Thread.join} with timeout</li>
         *   <li>{@link LockSupport#parkNanos LockSupport.parkNanos}</li>
         *   <li>{@link LockSupport#parkUntil LockSupport.parkUntil}</li>
         * </ul>
         */
        TIMED_WAITING,

        /**
         * Thread state for a terminated thread.
         * The thread has completed execution.
         * 一种终止线程的状态。
         * 这个线程已经执行完成。
         */
        TERMINATED;
    }

}
