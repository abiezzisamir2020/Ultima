public class Main {

	public static int worldTime, worldTime2, worldTime3, doy, year, min, hour, days, days1, days2;

    public static void main(String[] args) {
		 worldTime = 168260271;
		 worldTime2 = 27364375;
		 worldTime3 = 67294091;
		 days = (worldTime/1440) +1;
		 days1 = (worldTime2/1440)+1;
		 days2 = (worldTime3/1440)+1;
		displayTime();
		displayTime1();
		displayTime2();

	}

	//Day 1


	public static int calcDoy() {
		int doy = ((worldTime/1440)%365) +1;
		return doy;

	}

	public static int calcYear() {
		int year = ((worldTime/1440)/365) + 1;
		return year;

	}
	public static int calcTrammel() {
		int trammel = days%9;
		return trammel;
	}
	public static int calcFelucca() {
		int felucca = days%14;
		return felucca;
	}

	public static int calcHour() {
		int hour = ((worldTime%1440)/60);
			return hour;

		}
	public static int calcMin() {
		int min = ((worldTime%1440)%60);
		return min;

	}

	public static void displayTime() {
    	System.out.println("worldTime = " + worldTime);
		System.out.printf("It is %d:%d on day %d of the year %d." , calcHour(), calcMin(), calcDoy(), calcYear());
		System.out.println(" ");
		System.out.printf("Trammel is in day %d of its 9 day phase.", calcTrammel());
		System.out.println(" ");
		System.out.printf("Felucca is in day %d of its 14 day phase.", calcFelucca());
	}

	//Day 2


	public static int calcDoy1() {
		int doy = ((worldTime2/1440)%365) +1;
		return doy;

	}

	public static int calcYear1() {
		int year = ((worldTime2/1440)/365) + 1;
		return year;

	}
	public static int calcTrammel1() {
		int trammel = days1%9;
		return trammel;
	}
	public static int calcFelucca1() {
		int felucca = days1%14;
		return felucca;
	}

	public static int calcHour1() {
		int hour = ((worldTime2%1440)/60);
		return hour;

	}
	public static int calcMin1() {
		int min = ((worldTime2%1440)%60);
		return min;

	}

	public static void displayTime1() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("worldTime = " + worldTime2);
		System.out.printf("It is %d:%d on day %d of the year %d." , calcHour1(), calcMin1(), calcDoy1(), calcYear1());
		System.out.println(" ");
		System.out.printf("Trammel is in day %d of its 9 day phase.", calcTrammel1());
		System.out.println(" ");
		System.out.printf("Felucca is in day %d of its 14 day phase.", calcFelucca1());
	}


	//Day 3


	public static int calcDoy2() {
		int doy = ((worldTime3/1440)%365) +1;
		return doy;

	}

	public static int calcYear2() {
		int year = ((worldTime3/1440)/365) + 1;
		return year;

	}
	public static int calcTrammel2() {
		int trammel = days2%9;
		return trammel;
	}
	public static int calcFelucca2() {
		int felucca = days2%14;
		return felucca;
	}

	public static int calcHour2() {
		int hour = ((worldTime3%1440)/60);
		return hour;

	}
	public static int calcMin2() {
		int min = ((worldTime3%1440)%60);
		return min;

	}

	public static void displayTime2() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("worldTime = " + worldTime3);
		System.out.printf("It is %d:%d on day %d of the year %d." , calcHour2(), calcMin2(), calcDoy2(), calcYear2());
		System.out.println(" ");
		System.out.printf("Trammel is in day %d of its 9 day phase.", calcTrammel2());
		System.out.println(" ");
		System.out.printf("Felucca is in day %d of its 14 day phase.", calcFelucca2());
	}

}
