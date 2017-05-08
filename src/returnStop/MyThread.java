package returnStop;

public class MyThread extends Thread{
	public void run(){
		while(true){
			if(this.isInterrupted()){
				System.out.println("Õ£÷π¡À");
				return;
			}
			System.out.println("timer="+System.currentTimeMillis());
		}
	}

}
