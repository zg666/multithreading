package sleep;

public class MyThread1 extends Thread{
	public void run(){
		try {
			System.out.println("run threadNmae="+this.currentThread().getName()+"begin");
			Thread.sleep(5000);
			System.out.println("run threadNmae="+this.currentThread().getName()+"end");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
    
}
