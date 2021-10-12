package HW8;

import java.time.LocalDate;
import java.util.Objects;

public class KeyDate {
    private final LocalDate localDate;

    public KeyDate(int year, int month, int day) {
        localDate = LocalDate.of(year, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyDate localDate1 = (KeyDate) o;
        return Objects.equals(localDate, localDate1.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localDate);
    }

    @Override
    public String toString() {
        return localDate.toString();
    }
}
