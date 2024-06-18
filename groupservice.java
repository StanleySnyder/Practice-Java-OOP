import java.util.List;

public class УчебнаяГруппаСервис<T extends Преподаватель, S extends Студент> {
    public УчебнаяГруппа<T, S> формироватьУчебнуюГруппу(T преподаватель, List<S> студенты) {
        return new УчебнаяГруппа<>(преподаватель, студенты);
    }
}
