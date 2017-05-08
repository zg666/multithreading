package runnable1;
/*
 * 实现Runnable接口创建线程,Thread实现了Runnable接口
 */
public class Run {
	public static void main(String[] args) {
	Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
	
		thread.start();
		System.out.println("运行结束");
	}

}
