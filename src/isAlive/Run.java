package isAlive;

public class Run {
    public static void main(String[] args) throws InterruptedException {
		MyThread mythread=new MyThread();
		System.out.println("begin=="+mythread.isAlive());
		mythread.start();
		Thread.sleep(1000);
		// ����1s��mythread�Ѿ�ִ���꣬���false
		System.out.println("end=="+mythread.isAlive());
	}
}
