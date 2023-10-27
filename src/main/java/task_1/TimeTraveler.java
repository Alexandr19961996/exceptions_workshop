package task_1;

public class TimeTraveler {

    private final String name;
    private final int birthYear;
    private final int deathYear;

    public TimeTraveler(String name, int birthYear, int deathYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }
}
