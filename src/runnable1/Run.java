package runnable1;
/*
 * ʵ��Runnable�ӿڴ����߳�,Threadʵ����Runnable�ӿ�
 */
public class Run {
	public static void main(String[] args) {
	Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
	
		thread.start();
		System.out.println("���н���");
	}

}
