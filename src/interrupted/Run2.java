package interrupted;
/*
 * interrupted()具有清除状态的功能
 */
public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1？"+Thread.interrupted()); // true
		System.out.println("是否停止2？"+Thread.interrupted());  // false
		
	}

}
