package isAlive;
/*
 * isAlive()判断当前线程是否处于活跃状态
 */
public class MyThread extends Thread {
	public void run(){
		System.out.println("run="+this.isAlive());
	}

}
