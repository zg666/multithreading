package suspend_resume_LockStop;
/* 
 * suspend���������ռ�����
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
