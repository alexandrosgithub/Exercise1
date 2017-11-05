
public class HelloUser {
	
	private String userName;
 

	public HelloUser(String name){
		this.userName = name;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void greetUser() {
		System.out.println("Hello : "+ this.userName+" !");
	}
}
