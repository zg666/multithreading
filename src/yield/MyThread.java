package yield;

public class MyThread extends Thread{
	@Override
	public void run(){
		long beginTime=System.currentTimeMillis();
		int count=0;
		for (int i = 0; i < 10; i++) {
			// ȥ��ע�ͺ���ʱ��࣬��CPUת�ø���������Դ�����ٶȱ���
			// Thread.yield();
			count=count+(i+1);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("��ʱ:"+(endTime-beginTime)+"����");
		
		
	}
   
}
