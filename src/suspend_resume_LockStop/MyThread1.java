package suspend_resume_LockStop;
/*
 * println方法一直暂停，锁不被释放，所以main end 不会打印
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
