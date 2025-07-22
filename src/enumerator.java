// File: EnumExample.java
public class enumerator {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is coming!");
                break;
            case SUNDAY:
                System.out.println("Rest day!");
                break;
            default:
                System.out.println("Midweek day: " + today);
        }
        System.out.println("\nAll Days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
