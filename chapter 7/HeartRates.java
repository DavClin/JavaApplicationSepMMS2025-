import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthDay, birthMonth, birthYear;

    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = day;
        this.birthMonth = month;
        this.birthYear = year;
    }

    public int getAge() {
        LocalDate birth = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birth, LocalDate.now()).getYears();
    }

    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public String getTargetRange() {
        int max = getMaxHeartRate();
        int lower = (int)(max * 0.50);
        int upper = (int)(max * 0.85);
        return lower + " - " + upper;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " DOB: " + birthDay + "/" + birthMonth + "/" + birthYear;
    }
}
