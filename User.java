import java.util.List;

public class User extends Movie {

	String userName;
	int bookingId;
	String city;
	User next;

	public User() {
		super();
		userName = "NULL";
		bookingId = (int) (Math.random() * ((99999 - 10000) + 1)) + 10000; // MAX = 99999 and MIN = 10000 Random Values

		city = "NULL";
	}

	public String get_userName() {
		return userName;
	}

	public void set_userName(String userName) {
		this.userName = userName;
	}

	public String get_city() {
		return city;
	}

	public void set_city(String city) {
		this.city = city;
	}

	public void displayList(List list) {

		for (Object i : list) {
			displayTicket(i);
		}

	}

	public void displayTicket(Object i) {

		User temp = (User) i;
		System.out
				.println("\n\n *****Total " + temp.totalSeats + " Tickets*****\n" + "" + "Booking ID: " + temp.bookingId
						+ "\n\n" + "Name      : " + temp.userName + "\nCity      : " + temp.city + "\nMovie Name: "
						+ temp.movieName + "\nDay       : " + temp.day + "\nTime      : " + temp.hrs + ":" + temp.min);

	}

	public void addTicket(List list) {

		User temp = new User();

		temp.city = this.city;
		temp.day = this.day;
		temp.hrs = this.hrs;
		temp.min = this.min;
		temp.movieName = this.movieName;
		temp.totalSeats = this.totalSeats;
		temp.bookingId = temp.bookingId;
		temp.userName = this.userName;

		list.add(temp);

	}

}
