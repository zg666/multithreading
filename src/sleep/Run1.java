package sleep;

import currentThread.MyThread;
/*
 * begin=1493186199571
run threadNmae=mainbegin
run threadNmae=mainend
end=1493186204571
 */
public class Run1 {
	public static void main(String[] args) {
		MyThread1 mythread=new MyThread1();
		System.out.println("begin="+System.currentTimeMillis());
		mythread.run();
		System.out.println("end="+System.currentTimeMillis());
	}

}
