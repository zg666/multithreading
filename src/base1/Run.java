package base1;

public class Run {
	/*
	 * 控制台输出:
	 *  运行结束
      MyThread 
      使用多线程时，代码运行结果和执行顺序无关，具有随机性
	 */
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		mythread.start();
		System.out.println("运行结束");
	}

}
