package bugongxiangshuju;
/*
 * �̼߳����ݲ�����ʹ��ѭ��
 */
public class MyThread extends Thread{
	private int count=5;
	public MyThread(String name){
		super();
		this.setName(name);
	}
	public void run(){
		super.run();
		while(count>0){
			count--;
			System.out.println("��"+this.currentThread().getName()+"���㣬count="+count);
		}
	}
    
	
}
