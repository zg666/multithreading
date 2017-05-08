package base3;
/*
 * start方法的执行顺序并不代表线程的启动顺序
 */
public class Test {
	public static void main(String[] args) {
		MyThread tl1=new MyThread(1),
				tl2=new MyThread(2),
				tl3=new MyThread(3),
				tl4=new MyThread(4),
				tl5=new MyThread(5);
		tl1.start();
		tl2.start();
		tl3.start();
		tl4.start();
		tl5.start();
			
	}

}
