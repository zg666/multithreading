package returnStop;
/*
 * 使用return停止线程，建议使用抛出异常的方法来实现线程停止
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}

}
