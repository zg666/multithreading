package stopThrowLock;
/*
 * 暴力停止造成数据不一致
 */
public class Run {
	public static void main(String[] args) {
		try {
			SynchronizedObject object=new SynchronizedObject();
			MyThread thread=new MyThread(object);
			thread.start();
			thread.sleep(500);
			thread.stop();
			System.out.println(object.getUsername()+" "+object.getPassword());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
