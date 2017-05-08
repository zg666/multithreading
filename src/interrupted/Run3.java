package interrupted;
/*
 * isInterrupted()�������״̬��ʶ���������״̬��ʶ
 */
public class Run3 {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("�Ƿ�ֹͣ1��="+thread.isInterrupted()); // true
			System.out.println("�Ƿ�ֹͣ2��="+thread.isInterrupted());  // true
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
