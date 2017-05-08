package sleep;
/*
 * begin=1493186438167
end=1493186438168
run threadName=Thread-0begin=1493186438168
run threadName=Thread-0end=1493186443168

 */
public class MyThread2 extends Thread{
	public void run(){
		try {
			System.out.println("run threadName="+this.currentThread().getName()+"begin="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("run threadName="+this.currentThread().getName()+"end="+System.currentTimeMillis());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
