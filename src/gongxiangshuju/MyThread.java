package gongxiangshuju;
/*
 * �̼߳乲�����ݣ���ʹ��ѭ����䣬Ӧʵ���̰߳�ȫ��ʹ��synchronized����run����
 */
public class MyThread extends Thread{
	private int count=5;

	@Override
	//ʹ��synchronized����run����ʵ���߳�ͬ��
	synchronized public void run() {
		// TODO Auto-generated method stub
		super.run();
		// ��Ҫ��ѭ����䣬��Ϊʹ��ͬ���������߳̾͵ò������л����ˣ�һֱ��һ���߳̽��м�������
		count--;
		System.out.println("��"+this.currentThread().getName()+"���㣬count="+count);
	}
	

}
