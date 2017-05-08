package stopThread;

public class MyThread extends Thread{
	public void run(){
		super.run();
		for (int i = 0; i < 11; i++) {
			if(this.interrupted()){
				System.out.println("已经停止了，要退出了");
				break;
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止");
	}

}
