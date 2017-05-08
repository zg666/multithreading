package CountPriority;
/*
 * a=1153483594
b=1154455287
优先级高的运行快

 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadA a=new ThreadA();
			a.setPriority(Thread.NORM_PRIORITY-3);
			a.start();
			
			ThreadB b=new ThreadB();
			b.setPriority(Thread.NORM_PRIORITY+3);
			b.start();
			Thread.sleep(2000);
			a.stop();
			b.stop();
			System.out.println("a="+a.getCount());
			System.out.println("b="+b.getCount());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
