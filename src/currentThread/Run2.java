package currentThread;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		/*
		 * ���췽���Ĵ�ӡ��main
run�����Ĵ�ӡ:Thread-0
		 */
		mythread.start(); 
		/*
		 * ���췽���Ĵ�ӡ��main
run�����Ĵ�ӡ:main
		 */
		mythread.run();
	}

}
