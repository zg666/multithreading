package Daemon;
/*
 * i=1
i=2
i=3
i=4
i=5
���뿪thread����Ҳ���ٴ�ӡ�ˣ�Ҳ����ֹͣ��
i=6
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			// �ػ��̣߳����з��ػ��߳̽������ػ��̲߳Ż����
			thread.setDaemon(true);
			thread.start();
			thread.sleep(5000);
			System.out.println("���뿪thread����Ҳ���ٴ�ӡ�ˣ�Ҳ����ֹͣ��");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
