package prep.day01.SwitchTernary;

public class Main {

    public static void main(String[] args) {

        enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

        Days day = Days.MONDAY;

        switch(day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Time to work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend");
                break;
            default:
                System.out.println("What are you trying to do?");
                break;
        
        };

        // switch(day) {
        //     case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY  -> System.out.println("Work time");
        //     case SATURDAY, SUNDAY  -> System.out.println("it's the weekend");

        // };
        
    }
    
}
