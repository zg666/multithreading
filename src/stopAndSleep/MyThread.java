package stopAndSleep;

public class MyThread extends Thread{
	public void run(){
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("i="+(i+1));
			}
			System.out.println("run begin");
			Thread.sleep(2000); 
			System.out.println("run end");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("先停止，再遇到了sleep，进入catch");
			e.printStackTrace();
		}
	}
	
	

}
