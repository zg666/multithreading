package printexception;
/*
 * 留意i--与system.out.println异常,继续使用同步
 */
public class MyThread extends Thread{
   private int i=5;
	synchronized public void run(){
		// i--放在println中
		System.out.println("i="+(i--)+"threadName="+this.currentThread().getName());
	}
}
