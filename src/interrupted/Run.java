package interrupted;
/*
 * interrupted()���������Ե�ǰ�߳��Ƿ��Ѿ��ж�,ִ�к�״̬��Ϊfalse
 */
public class Run {
      public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			// Thread.currentThread().interrupt();
			System.out.println("�Ƿ�ֹͣ1��"+thread.interrupted()); // false ��δ�ж�
			System.out.println("�Ƿ�ֹͣ2��"+thread.interrupted()); // false ��δ�ж�
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
