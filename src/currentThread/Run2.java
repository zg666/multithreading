package currentThread;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		/*
		 * 构造方法的打印：main
run方法的打印:Thread-0
		 */
		mythread.start(); 
		/*
		 * 构造方法的打印：main
run方法的打印:main
		 */
		mythread.run();
	}

}
