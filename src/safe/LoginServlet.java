package safe;
/*
 *非线程安全
 */
public class LoginServlet {
	private static String usernameRef;
	private static String passwordRef;
	
  synchronized	public static void doPost(String username,String password){
		try {
			usernameRef=username;
			if("a".equals(username)){
				Thread.sleep(5000);
			}
			passwordRef=password;
			System.out.println("username="+usernameRef+"password="+password);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
    
}
