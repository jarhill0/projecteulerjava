enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Euler019 {
    private static int calculate() {
        Day myDay = new Day();
        int counter = 0;
        while (myDay.getYear() < 2001) {
            myDay.tomorrow();
            if (myDay.getYear() < 1901) {
                continue; // Initializer is for 1900; we only count after 1901
            }
            if (myDay.getDate() == 1 && myDay.getDayOfWeek() == DayOfWeek.SUNDAY) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}

class Day {
    private DayOfWeek dayOfWeek;
    private Month month;
    private int date;
    private int year;
    private int daysInMonth;

    Day() {
        dayOfWeek = DayOfWeek.MONDAY;
        month = Month.JANUARY;
        date = 1;
        year = 1900;
        daysInMonth = 31;
    }

    void tomorrow() {
        updateDayOfWeek();
        date++;
        if (date > daysInMonth) {
            date = 1;
            updateMonth(); // Side effect: updates daysInMonth; updates year when applicable
        }
    }

    int getDate() {
        return date;
    }

    DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    int getYear() {
        return year;
    }

    private void updateDayOfWeek() {
        switch (dayOfWeek) {
            case SUNDAY:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case MONDAY:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case TUESDAY:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case WEDNESDAY:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case THURSDAY:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case FRIDAY:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            case SATURDAY:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;

        }
    }

    private void updateMonth() {
        // Side effects: updates daysInMonth; updates year when applicable
        switch (month) {
            case JANUARY:
                month = Month.FEBRUARY;
                daysInMonth = leapYear() ? 29 : 28;
                break;
            case FEBRUARY:
                month = Month.MARCH;
                daysInMonth = 31;
                break;
            case MARCH:
                month = Month.APRIL;
                daysInMonth = 30;
                break;
            case APRIL:
                month = Month.MAY;
                daysInMonth = 31;
                break;
            case MAY:
                month = Month.JUNE;
                daysInMonth = 30;
                break;
            case JUNE:
                month = Month.JULY;
                daysInMonth = 31;
                break;
            case JULY:
                month = Month.AUGUST;
                daysInMonth = 31;
                break;
            case AUGUST:
                month = Month.SEPTEMBER;
                daysInMonth = 30;
                break;
            case SEPTEMBER:
                month = Month.OCTOBER;
                daysInMonth = 31;
                break;
            case OCTOBER:
                month = Month.NOVEMBER;
                daysInMonth = 30;
                break;
            case NOVEMBER:
                month = Month.DECEMBER;
                daysInMonth = 31;
                break;
            case DECEMBER:
                month = Month.JANUARY;
                daysInMonth = 31;
                year++;
                break;

        }
    }

    private boolean leapYear() {
        return (year % 4 == 0 && (year % 100 != 0 | year % 400 == 0));
    }

}

