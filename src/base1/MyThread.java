package base1;
/*
 * 继承Thread创建线程
 */
public class MyThread extends Thread {
	
	public void run(){
		super.run();
		System.out.println("MyThread");
	}

}
