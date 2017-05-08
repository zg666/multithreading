package isAlive;

public class Run {
    public static void main(String[] args) throws InterruptedException {
		MyThread mythread=new MyThread();
		System.out.println("begin=="+mythread.isAlive());
		mythread.start();
		Thread.sleep(1000);
		// 休眠1s后，mythread已经执行完，输出false
		System.out.println("end=="+mythread.isAlive());
	}
}
