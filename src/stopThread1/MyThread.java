package stopThread1;

public class MyThread extends Thread{
	public void run(){
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				if(this.interrupted()){
					System.out.println("已经是停止状态了，我要退出了");
					throw new InterruptedException();
				}
			}
			System.out.println("我在for下面");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("进MyThread中run方法中得catch了");
			e.printStackTrace();
		}
	}

}
