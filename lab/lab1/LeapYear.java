public class LeapYear {
	public static void main(String[] args) {
		int number = 0;
		boolean IsLeapYear = false;
		int year = Integer.parseInt(args[number]);
		
		if (year % 4 == 0) {
			if (year % 100 == 0)
				if (year % 400 == 0)
					IsLeapYear = true;
		}
		
		if (IsLeapYear)
			System.out.println(year + " is LeapYear!");
		else
			System.out.println(year + " isn't LeapYear!");
	}
}