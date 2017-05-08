package priority;
/*
 * 优先级默认为5 
 */
public class Run {
	public static void main(String[] args) {
		System.out.println("main thread start priority="+Thread.currentThread().getPriority());
		// 设置后，thread1和thread2优先级都变为6，main thread优先级仍然为5
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end priority="+Thread.currentThread().getPriority());
		MyThread1 thread1=new MyThread1();
		thread1.start();
	}

}
