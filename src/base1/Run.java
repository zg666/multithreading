package base1;

public class Run {
	/*
	 * ����̨���:
	 *  ���н���
      MyThread 
      ʹ�ö��߳�ʱ���������н����ִ��˳���޹أ����������
	 */
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		mythread.start();
		System.out.println("���н���");
	}

}
