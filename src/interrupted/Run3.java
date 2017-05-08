package interrupted;
/*
 * isInterrupted()不能清除状态标识，不能清除状态标识
 */
public class Run3 {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止1？="+thread.isInterrupted()); // true
			System.out.println("是否停止2？="+thread.isInterrupted());  // true
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
