package isAlive;
/*
 * isAlive()�жϵ�ǰ�߳��Ƿ��ڻ�Ծ״̬
 */
public class MyThread extends Thread {
	public void run(){
		System.out.println("run="+this.isAlive());
	}

}
