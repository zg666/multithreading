package interrupted;
/*
 * interrupted()�������״̬�Ĺ���
 */
public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ1��"+Thread.interrupted()); // true
		System.out.println("�Ƿ�ֹͣ2��"+Thread.interrupted());  // false
		
	}

}
