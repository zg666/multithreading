package stopThread;

public class MyThread extends Thread{
	public void run(){
		super.run();
		for (int i = 0; i < 11; i++) {
			if(this.interrupted()){
				System.out.println("�Ѿ�ֹͣ�ˣ�Ҫ�˳���");
				break;
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("�ұ����������˴�����for�ּ������У��̲߳�δֹͣ");
	}

}
