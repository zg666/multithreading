package returnStop;
/*
 * ʹ��returnֹͣ�̣߳�����ʹ���׳��쳣�ķ�����ʵ���߳�ֹͣ
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}

}
