package interrupted;
/*
 * interrupted()方法，测试当前线程是否已经中断,执行后将状态改为false
 */
public class Run {
      public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			// Thread.currentThread().interrupt();
			System.out.println("是否停止1？"+thread.interrupted()); // false 从未中断
			System.out.println("是否停止2？"+thread.interrupted()); // false 从未中断
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
