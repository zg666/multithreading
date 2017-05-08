package printexception;

public class Run {
	public static void main(String[] args) {
		MyThread run=new MyThread();
		Thread t1=new Thread(run),
				t2=new Thread(run),
				t3=new Thread(run);
		t1.start();
		t2.start();
		t3.start();
	}

}
