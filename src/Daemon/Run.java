package Daemon;
/*
 * i=1
i=2
i=3
i=4
i=5
我离开thread对象也不再打印了，也就是停止了
i=6
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			// 守护线程，所有非守护线程结束，守护线程才会结束
			thread.setDaemon(true);
			thread.start();
			thread.sleep(5000);
			System.out.println("我离开thread对象也不再打印了，也就是停止了");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
