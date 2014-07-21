import java.util.*;

public class main {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner input = new Scanner(System.in);
		String fillers = "================================";
		System.out.println("Welcome to Rich and Ris' Pizzas!\n");
		System.out.println(fillers);
		System.out.println("Choose an option (the number):");
		System.out.println("(1) Login\n(2) Register");
		System.out.println(fillers);
		String loginOrRegister = input.nextLine();
		// Keeps prompting for correct input if invalid given. 
		while(!loginOrRegister.equals("1") && !loginOrRegister.equals("2")){
			System.out.println("Incorrect input. Please try again!");
			loginOrRegister = input.nextLine();
		}
		if(loginOrRegister.equals("1")){
			// Proceed to login options
			System.out.println(fillers);
			new login();
		}
		if(loginOrRegister.equals("2")){
			// Proceed to register a user.
			System.out.println(fillers);
			new register();
		}
	}

}
