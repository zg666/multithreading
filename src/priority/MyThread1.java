package priority;

import sleep.MyThread2;

/*
 * �̵߳����ȼ����м̳��ԣ�����A�߳�����B�̣߳���B�̵߳����ȼ���Aһ��
 */
public class MyThread1 extends Thread{
	public void run(){
		// priority���� �߳����ȼ�
		System.out.println("MyThread1 run priority"+this.getPriority());
		MyThread2 thread2=new MyThread2();
		thread2.start();
	}

}
