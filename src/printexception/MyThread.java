package printexception;
/*
 * ����i--��system.out.println�쳣,����ʹ��ͬ��
 */
public class MyThread extends Thread{
   private int i=5;
	synchronized public void run(){
		// i--����println��
		System.out.println("i="+(i--)+"threadName="+this.currentThread().getName());
	}
}
