package interrupt;
/*
 * interrupt() �����Ǵ�һ��ֹͣ�ı�ǣ����������ֹͣ�߳�
 * 
 * i=1
i=2
i=3
i=4
i=5
i=6
i=7
i=8
i=9
i=10
 */
public class Run {
	public static void main(String[] args) {
		try {
           MyThread thread=new MyThread();
           thread.start();
           Thread.sleep(2000);
           thread.interrupt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
