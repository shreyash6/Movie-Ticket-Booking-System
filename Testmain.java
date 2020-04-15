import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Testmain {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		List<User> list = new LinkedList<>();
		int add;
		int choice;
		int day;
		int time;
		int cont;
		User u1 = new User();

		System.out.print("Enter your Name: ");
		u1.set_userName(myObj.nextLine());

		System.out.print("Enter your City: ");
		u1.set_city(myObj.nextLine());

		System.out.print("Enter Total Number of Seats: ");
		u1.set_totalSeats(myObj.nextInt());

		do {

			System.out.println("\n1. ADD MOVIE\n2. DISPLAY TICKET");
			System.out.print("Enter your choice: ");
			add = myObj.nextInt();

			// NESTED SWITCH CASES BELOW
			

			System.out.print("\nDo you want to continue ? (1/0): ");
			cont = myObj.nextInt();
			if (cont == 1) {

				u1.addTicket(list);

			}

		} while (cont == 1);

	}

}
