package dayfinder;

// Service class to manage weekdays
public class WeekdayService {

    private String[] weekdays = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
    };

    // Get weekday by index
    public String getWeekday(int index) {
        return weekdays[index];
    }
}

