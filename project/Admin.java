
public class Admin extends User {
	
	private static String adminCode="AdminAccess";//set unchangable value set as administartion code
	
	public Admin(String u,String p,String a) {//person enters username password and admin code
		super(u,p);
		if(!adminCode.equals(a))
			throw new SecurityException("Access Denied");//only shows if the admin code entered isn't exactly the same
	}
	
}