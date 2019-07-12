public class Weekday {

    private int numberOfDays;

    public static final int JANUARY = 31;
    public static final int FEBRUARY = 28;
    public static final int MARCH = 31;
    public static final int APRIL = 30;
    public static final int MAY = 31;
    public static final int JUNE = 30;
    public static final int JULY = 31;
    public static final int AUGUST = 31;
    public static final int SEPTEMBER = 30;
    public static final int OCTOBER = 31;
    public static final int NOVEMBER = 30;
    public static final int DECEMBER = 31;

    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    public String getWeekDay(int day, int month, int year) {
        numberOfDays = 0;
        numberOfDays += numberOfDays + ((year - 1900) * 365);
        int leapYearAdjustment = (year - 1900) / 4;
        numberOfDays += leapYearAdjustment;

        int daysTillMonth = daysUntilThisMonth(month);
        numberOfDays += daysTillMonth;

        numberOfDays += day;

        if ((year % 4 == 0) && (month == 1 || month == 2)) {
            numberOfDays--;
        }

        int mod = numberOfDays % 7;
        System.out.println("numberOfDays: " + numberOfDays);
        System.out.println("mod: " + mod);

        return dayName(mod);
    }

    public static void main(String[] args) {
        Weekday weekday = new Weekday();
        System.out.println(weekday.getWeekDay(2,2,1996));



    }
    private String dayName(int i) {
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[i];
    }


    private int daysUntilThisMonth(int month) {
        int[] months = {0, Weekday.JANUARY, Weekday.FEBRUARY, Weekday.MARCH, Weekday.APRIL, Weekday.MAY,
                Weekday.JUNE, Weekday.JULY, Weekday.AUGUST, Weekday.SEPTEMBER, Weekday.OCTOBER,
                Weekday.NOVEMBER, Weekday.DECEMBER};

        int sum = 0;
        for (int i = 0; i < month; i++) {
            sum = sum + months[i];
        }

        return sum;
    }


}
