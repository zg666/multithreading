package suspend_resume_LockStop;
/*
 * println����һֱ��ͣ���������ͷţ�����main end �����ӡ
 */
public class MyThread1 extends Thread {
	private long i=0;
	@Override
	public void run(){
		while(true){
			i++;
			System.out.println(i);
		}
	}
    
}
