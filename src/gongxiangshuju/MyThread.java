package gongxiangshuju;
/*
 * 线程间共享数据，不使用循环语句，应实现线程安全，使用synchronized修饰run方法
 */
public class MyThread extends Thread{
	private int count=5;

	@Override
	//使用synchronized修饰run方法实现线程同步
	synchronized public void run() {
		// TODO Auto-generated method stub
		super.run();
		// 不要用循环语句，因为使用同步后其他线程就得不到运行机会了，一直由一个线程进行减法运算
		count--;
		System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
	}
	

}
