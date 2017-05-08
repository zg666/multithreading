package priorityRule;
/*
 * 设置线程的优先级较大，并不代表先高优先级线程先全部执行完
 * 高优先级线程总是大部分先执行
 * CPU尽量将执行资源让给优先级比较高的线程
 */
public class Run {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 thread1=new MyThread1();
			thread1.setPriority(10);
			thread1.start();
			
			MyThread2 thread2=new MyThread2();
			thread2.setPriority(1);
			thread2.start();
		}
	}

}
