package suspend_resume_LockStop;
/*
 * suspend���������ռ����� 
 * ����̨��main end
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
