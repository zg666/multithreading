package violenceStop;
/*
 * ����ֹͣ
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			thread.sleep(8000);
			// ����ֹͣ
			thread.stop();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
