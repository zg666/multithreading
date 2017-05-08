package bugongxiangshuju;
/*
 * 多个线程不共享数据情况，
 */
public class Run {
	public static void main(String[] args) {
		MyThread a=new MyThread("A");
		MyThread b=new MyThread("B");
		MyThread c=new MyThread("C");
		a.start();
		b.start();
		c.start();
	}

}
