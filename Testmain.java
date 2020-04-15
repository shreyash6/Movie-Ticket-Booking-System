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
			switch (add) {

			case 1:
				System.out.println(
						"\n1. Joker\n2. Malang\n3. Street Dancer 3\n4. Good Newwz\n5. 3 Idiots\n6. Interstellar\n");
				System.out.print("Enter your choice: ");
				choice = myObj.nextInt();

				switch (choice) {
				// movie 1
				case 1:
					u1.set_movieName("Joker");

					System.out.println("\n1. Monday\n2. Tuesday\n3. Wednesday\n"
							+ "4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
					System.out.print("Select Day: ");

					day = myObj.nextInt();

					switch (day) {

					case 1:
						u1.set_day("Monday");
						break;

					case 2:
						u1.set_day("Tuesday");
						break;

					case 3:
						u1.set_day("Wednesday");
						break;

					case 4:
						u1.set_day("Thursday");
						break;

					case 5:
						u1.set_day("Friday");
						break;

					case 6:
						u1.set_day("Saturday");
						break;

					case 7:
						u1.set_day("Sunday");
						break;

					}

					System.out.println("1. 10:30\n2. 13:00\n3. 15:30\n4. 18:00\n5. 20:30\n6. 22:30");
					System.out.print("Select Time: ");
					time = myObj.nextInt();

					switch (time) {

					case 1:
						u1.set_hrs(10);
						u1.set_min(30);
						break;

					case 2:
						u1.set_hrs(13);
						u1.set_min(00);
						break;

					case 3:
						u1.set_hrs(15);
						u1.set_min(30);
						break;

					case 4:
						u1.set_hrs(18);
						u1.set_min(00);
						break;

					case 5:
						u1.set_hrs(20);
						u1.set_min(30);
						break;

					case 6:
						u1.set_hrs(22);
						u1.set_min(30);
						break;

					}

//					System.out.print("Enter Total Number of Seats: ");
//					u1.set_totalSeats(myObj.nextInt());
					break;

				// movie 2

				case 2:
					u1.set_movieName("Malang");
					System.out.println("\n1. Monday\n2. Tuesday\n3. Wednesday\n"
							+ "4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
					System.out.print("Select Day: ");
					day = myObj.nextInt();

					switch (day) {

					case 1:
						u1.set_day("Monday");
						break;

					case 2:
						u1.set_day("Tuesday");
						break;

					case 3:
						u1.set_day("Wednesday");
						break;

					case 4:
						u1.set_day("Thursday");
						break;

					case 5:
						u1.set_day("Friday");
						break;

					case 6:
						u1.set_day("Saturday");
						break;

					case 7:
						u1.set_day("Sunday");
						break;

					}

					System.out.println("1. 10:30\n2. 13:00\n3. 15:30\n4. 18:00\n5. 20:30\n6. 22:30");
					System.out.print("Select Time: ");
					time = myObj.nextInt();

					switch (time) {

					case 1:
						u1.set_hrs(10);
						u1.set_min(30);
						break;

					case 2:
						u1.set_hrs(13);
						u1.set_min(00);
						break;

					case 3:
						u1.set_hrs(15);
						u1.set_min(30);
						break;

					case 4:
						u1.set_hrs(18);
						u1.set_min(00);
						break;

					case 5:
						u1.set_hrs(20);
						u1.set_min(30);
						break;

					case 6:
						u1.set_hrs(22);
						u1.set_min(30);
						break;

					}

//					System.out.print("Enter Total Number of Seats: ");
//					u1.set_totalSeats(myObj.nextInt());
					break;

				// movie 3

				case 3:
					u1.set_movieName("Street Dancer 3");
					System.out.println("\n1. Monday\n2. Tuesday\n3. Wednesday\n"
							+ "4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
					System.out.print("Select Day: ");
					day = myObj.nextInt();

					switch (day) {

					case 1:
						u1.set_day("Monday");
						break;

					case 2:
						u1.set_day("Tuesday");
						break;

					case 3:
						u1.set_day("Wednesday");
						break;

					case 4:
						u1.set_day("Thursday");
						break;

					case 5:
						u1.set_day("Friday");
						break;

					case 6:
						u1.set_day("Saturday");
						break;

					case 7:
						u1.set_day("Sunday");
						break;

					}

					System.out.println("1. 10:30\n2. 13:00\n3. 15:30\n4. 18:00\n5. 20:30\n6. 22:30");
					System.out.print("Select Time: ");
					time = myObj.nextInt();

					switch (time) {

					case 1:
						u1.set_hrs(10);
						u1.set_min(30);
						break;

					case 2:
						u1.set_hrs(13);
						u1.set_min(00);
						break;

					case 3:
						u1.set_hrs(15);
						u1.set_min(30);
						break;

					case 4:
						u1.set_hrs(18);
						u1.set_min(00);
						break;

					case 5:
						u1.set_hrs(20);
						u1.set_min(30);
						break;

					case 6:
						u1.set_hrs(22);
						u1.set_min(30);
						break;

					}

//				System.out.print("Enter Total Number of Seats: ");
//				u1.set_totalSeats(myObj.nextInt());
					break;

				// movie 4

				case 4:
					u1.set_movieName("Good Newwz");
					System.out.println("\n1. Monday\n2. Tuesday\n3. Wednesday\n"
							+ "4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
					System.out.print("Select Day: ");
					day = myObj.nextInt();

					switch (day) {

					case 1:
						u1.set_day("Monday");
						break;

					case 2:
						u1.set_day("Tuesday");
						break;

					case 3:
						u1.set_day("Wednesday");
						break;

					case 4:
						u1.set_day("Thursday");
						break;

					case 5:
						u1.set_day("Friday");
						break;

					case 6:
						u1.set_day("Saturday");
						break;

					case 7:
						u1.set_day("Sunday");
						break;

					}

					System.out.println("1. 10:30\n2. 13:00\n3. 15:30\n4. 18:00\n5. 20:30\n6. 22:30");
					System.out.print("Select Time: ");
					time = myObj.nextInt();

					switch (time) {

					case 1:
						u1.set_hrs(10);
						u1.set_min(30);
						break;

					case 2:
						u1.set_hrs(13);
						u1.set_min(00);
						break;

					case 3:
						u1.set_hrs(15);
						u1.set_min(30);
						break;

					case 4:
						u1.set_hrs(18);
						u1.set_min(00);
						break;

					case 5:
						u1.set_hrs(20);
						u1.set_min(30);
						break;

					case 6:
						u1.set_hrs(22);
						u1.set_min(30);
						break;

					}

//				System.out.print("Enter Total Number of Seats: ");
//				u1.set_totalSeats(myObj.nextInt());
					break;

				// movie 5

				case 5:
					u1.set_movieName("3 Idiots");
					System.out.println("\n1. Monday\n2. Tuesday\n3. Wednesday\n"
							+ "4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
					System.out.print("Select Day: ");
					day = myObj.nextInt();

					switch (day) {

					case 1:
						u1.set_day("Monday");
						break;

					case 2:
						u1.set_day("Tuesday");
						break;

					case 3:
						u1.set_day("Wednesday");
						break;

					case 4:
						u1.set_day("Thursday");
						break;

					case 5:
						u1.set_day("Friday");
						break;

					case 6:
						u1.set_day("Saturday");
						break;

					case 7:
						u1.set_day("Sunday");
						break;

					}

					System.out.println("1. 10:30\n2. 13:00\n3. 15:30\n4. 18:00\n5. 20:30\n6. 22:30");
					System.out.print("Select Time: ");
					time = myObj.nextInt();

					switch (time) {

					case 1:
						u1.set_hrs(10);
						u1.set_min(30);
						break;

					case 2:
						u1.set_hrs(13);
						u1.set_min(00);
						break;

					case 3:
						u1.set_hrs(15);
						u1.set_min(30);
						break;

					case 4:
						u1.set_hrs(18);
						u1.set_min(00);
						break;

					case 5:
						u1.set_hrs(20);
						u1.set_min(30);
						break;

					case 6:
						u1.set_hrs(22);
						u1.set_min(30);
						break;

					}

//				System.out.print("Enter Total Number of Seats: ");
//				u1.set_totalSeats(myObj.nextInt());
					break;

				// movie 6

				case 6:
					u1.set_movieName("Interstellar");
					System.out.println("\n1. Monday\n2. Tuesday\n3. Wednesday\n"
							+ "4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
					System.out.print("Select Day: ");
					day = myObj.nextInt();

					switch (day) {

					case 1:
						u1.set_day("Monday");
						break;

					case 2:
						u1.set_day("Tuesday");
						break;

					case 3:
						u1.set_day("Wednesday");
						break;

					case 4:
						u1.set_day("Thursday");
						break;

					case 5:
						u1.set_day("Friday");
						break;

					case 6:
						u1.set_day("Saturday");
						break;

					case 7:
						u1.set_day("Sunday");
						break;

					}

					System.out.println("1. 10:30\n2. 13:00\n3. 15:30\n4. 18:00\n5. 20:30\n6. 22:30");
					System.out.print("Select Time: ");
					time = myObj.nextInt();

					switch (time) {

					case 1:
						u1.set_hrs(10);
						u1.set_min(30);
						break;

					case 2:
						u1.set_hrs(13);
						u1.set_min(00);
						break;

					case 3:
						u1.set_hrs(15);
						u1.set_min(30);
						break;

					case 4:
						u1.set_hrs(18);
						u1.set_min(00);
						break;

					case 5:
						u1.set_hrs(20);
						u1.set_min(30);
						break;

					case 6:
						u1.set_hrs(22);
						u1.set_min(30);
						break;

					}

					break;
				}
				break;

			case 2:
				u1.displayList(list);
				break;

			}
			

			System.out.print("\nDo you want to continue ? (1/0): ");
			cont = myObj.nextInt();
			if (cont == 1) {

				u1.addTicket(list);

			}

		} while (cont == 1);

	}

}
