package Daemon;

public class MyThread extends Thread{
	private int i=0;
	public void run(){
		try {
			while(true){
				i++;
		     System.out.println("i="+(i));
		     Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
