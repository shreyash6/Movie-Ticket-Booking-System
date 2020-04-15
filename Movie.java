
public class Movie {

	String movieName;
	String day;
	int hrs, min;
	int totalSeats;

	public Movie() {

		movieName = "NULL";
		day = "NULL";
		hrs = 0;
		min = 0;
		totalSeats = 0;
	}

	public void time() {
		System.out.println(hrs + ":" + min);

	}

	public String get_movieName() {
		return movieName;
	}

	public void set_movieName(String movieName) {
		this.movieName = movieName;
	}

	public String get_day() {
		return day;
	}

	public int get_hrs() {
		return hrs;
	}

	public int get_min() {
		return min;
	}

	public int get_totalSeats() {
		return totalSeats;
	}

	public void set_day(String day) {
		this.day = day;
	}

	public void set_hrs(int hrs) {
		this.hrs = hrs;
	}

	public void set_min(int min) {
		this.min = min;
	}

	public void set_totalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

}
