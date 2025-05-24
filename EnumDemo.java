enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public Boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class EnumDemo {
    public static void main(String args[]) {
        for (WeekDay day : WeekDay.values()) {
            if (day.isWeekend()) {
                System.out.println(day + " is a weekend day.");
            } else {
                System.out.println(day + " is a weekday.");
            }
        }
    }
}

