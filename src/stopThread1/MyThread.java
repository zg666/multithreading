package stopThread1;

public class MyThread extends Thread{
	public void run(){
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				if(this.interrupted()){
					System.out.println("�Ѿ���ֹͣ״̬�ˣ���Ҫ�˳���");
					throw new InterruptedException();
				}
			}
			System.out.println("����for����");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("��MyThread��run�����е�catch��");
			e.printStackTrace();
		}
	}

}
