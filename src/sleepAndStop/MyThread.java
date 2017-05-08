package sleepAndStop;

public class MyThread extends Thread{
	public void run(){
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(20000);
			System.out.println("run end");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("在沉睡中被停止，进入catch"+this.isInterrupted());
			e.printStackTrace();
		}
	}

}
