package sleepAndStop;
/* 
 * �����sleep״̬��ֹͣһ���̣߳������catch���������ֹͣ״ֵ̬����Ϊfalse
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
