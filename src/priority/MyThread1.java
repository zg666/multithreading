package priority;

import sleep.MyThread2;

/*
 * 线程的优先级具有继承性，比如A线程启动B线程，则B线程的优先级与A一样
 */
public class MyThread1 extends Thread{
	public void run(){
		// priority（） 线程优先级
		System.out.println("MyThread1 run priority"+this.getPriority());
		MyThread2 thread2=new MyThread2();
		thread2.start();
	}

}
