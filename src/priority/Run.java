package priority;
/*
 * ���ȼ�Ĭ��Ϊ5 
 */
public class Run {
	public static void main(String[] args) {
		System.out.println("main thread start priority="+Thread.currentThread().getPriority());
		// ���ú�thread1��thread2���ȼ�����Ϊ6��main thread���ȼ���ȻΪ5
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end priority="+Thread.currentThread().getPriority());
		MyThread1 thread1=new MyThread1();
		thread1.start();
	}

}
