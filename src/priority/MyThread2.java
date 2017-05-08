package priority;

public class MyThread2 extends Thread{
	public void run(){
		System.out.println("MyThread2 run priority="+this.getPriority());
	}

}
