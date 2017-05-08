package yield;

public class MyThread extends Thread{
	@Override
	public void run(){
		long beginTime=System.currentTimeMillis();
		int count=0;
		for (int i = 0; i < 10; i++) {
			// 去掉注释后，用时变多，将CPU转让给了其他资源导致速度变慢
			// Thread.yield();
			count=count+(i+1);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("用时:"+(endTime-beginTime)+"毫秒");
		
		
	}
   
}
