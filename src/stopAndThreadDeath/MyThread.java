package stopAndThreadDeath;

public class MyThread extends Thread{
	public void run(){
		try {
			this.stop();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("������catch����");
			e.printStackTrace();
		}
	}

}
