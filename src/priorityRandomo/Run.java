package priorityRandomo;
/*
 * 不要把优先级作为运行完run方法的标准，具有随机性
 */
public class Run {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 thread1=new MyThread1();
			thread1.setPriority(5);
			thread1.start();
			
			MyThread2 thread2=new MyThread2();
			thread2.setPriority(6);
			thread2.start();
		}
	}

}
