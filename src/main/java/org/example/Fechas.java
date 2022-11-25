package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fechas {
    public static void main(String[] args) {
        Solver solver = new Solver();
        solver.solve("OCT", "THU");
    }
}

class Solver {

    private Map<String, Integer> daysByMonth;
    private Map<String, Integer> daysOfWeek;

    Solver() {
        daysByMonth = new HashMap<>();
        daysOfWeek = new HashMap<>();
        daysByMonth.put("JAN", 31);
        daysByMonth.put("FEB", 28);
        daysByMonth.put("MAR", 31);
        daysByMonth.put("APR", 30);
        daysByMonth.put("MAY", 31);
        daysByMonth.put("JUN", 30);
        daysByMonth.put("JUL", 31);
        daysByMonth.put("AUG", 31);
        daysByMonth.put("SEP", 30);
        daysByMonth.put("OCT", 31);
        daysByMonth.put("NOV", 30);
        daysByMonth.put("DEC", 31);

        daysOfWeek.put("SUN", 1);
        daysOfWeek.put("MON", 2);
        daysOfWeek.put("TUE", 3);
        daysOfWeek.put("WED", 4);
        daysOfWeek.put("THU", 5);
        daysOfWeek.put("FRI", 6);
        daysOfWeek.put("SAT", 7);

    }

    public void solve(String month, String firstDay){
        Integer days = daysByMonth.get(month);
        Integer firstDayCalendarNumber = daysOfWeek.get(firstDay);

        Integer firstWeekWeekends = firstDayCalendarNumber == 7 ? 1 : 2;
        System.out.println("[FIRST_WEEKENDS] " + firstWeekWeekends);

        Integer remainingDays = days - ( 7 - firstDayCalendarNumber);
        System.out.println("[REMAINING_DAYS] " + remainingDays);
        Integer remainingWeekends = 0;

        while (remainingDays > 0) {
            if (remainingDays <= 6) {
                remainingWeekends += remainingDays == 6 ? 1 : 0;
                break;
            }
            remainingWeekends += 2;
            remainingDays -= 7;
        }

        //Integer remainingWeekends = remainingDays - 20;

        Integer totalWeekends = firstWeekWeekends + remainingWeekends;

        System.out.println("WEEKENDS: " + totalWeekends);

    }
}