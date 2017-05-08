package violenceStop;
/*
 * ±©Á¦Í£Ö¹
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			thread.sleep(8000);
			// ±©Á¦Í£Ö¹
			thread.stop();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
