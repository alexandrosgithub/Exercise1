import java.util.Scanner;
public class HelloWorld {

	private static HelloUser user;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		user = new HelloUser(keyboard.nextLine());
		user.greetUser();
	}

	
}
