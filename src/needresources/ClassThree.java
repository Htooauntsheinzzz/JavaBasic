package needresources;

import java.time.*;

public class ClassThree {

    public static void main(String[] args) {

        ClassThree obj = new ClassThree();
        obj.callLocalDate();

    }

    public void callLocalDate(){
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Clock clock = Clock.systemDefaultZone();
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");

        LocalDate localDate1 = LocalDate.of(2025, 01, 01);

        DayOfWeek localDate2 = LocalDate.now().getDayOfWeek();
        Month localDate3 = LocalDate.now().getMonth();
        int localDate4 = LocalDate.now().getDayOfMonth();

        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(clock);
        System.out.println(zoneId);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);


    }
}
