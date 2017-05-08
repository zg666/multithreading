package gongxiangshuju;


/*
 * ¹²ÏíÊı¾İ
 */
public class Run {
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		Thread a=new Thread (mythread,"A");
		Thread b=new Thread (mythread,"B");
		Thread c=new Thread (mythread,"C");
		a.start();
		b.start();
		c.start();
	}

}
