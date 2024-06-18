import java.util.List;

public class УчебнаяГруппа<T extends Преподаватель, S extends Студент> {
    private T преподаватель;
    private List<S> студенты;

    public УчебнаяГруппа(T преподаватель, List<S> студенты) {
        this.преподаватель = преподаватель;
        this.студенты = студенты;
    }

    public T получитьПреподавателя() {
        return преподаватель;
    }

    public List<S> получитьСтудентов() {
        return студенты;
    }
}
