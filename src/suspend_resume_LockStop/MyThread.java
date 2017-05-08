package suspend_resume_LockStop;
/*
 * suspend方法引起独占锁情况 
 * 控制台：main end
 */
public class MyThread extends Thread {
	private long i=0;
	@Override
	public void run(){
		while(true){
			i++;
		}
	}
    
}
