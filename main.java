import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        УчебнаяГруппаСервис<Преподаватель, Студент> учебнаяГруппаСервис = new УчебнаяГруппаСервис<>();
        Контроллер<Преподаватель, Студент> контроллер = new Контроллер<>(учебнаяГруппаСервис);

        Преподаватель преподаватель = new Преподаватель(1);

        List<Студент> студенты = new ArrayList<>();
        студенты.add(new Студент(101));
        студенты.add(new Студент(102));
        студенты.add(new Студент(103));

        УчебнаяГруппа<Преподаватель, Студент> учебнаяГруппа = контроллер.создатьУчебнуюГруппу(преподаватель, студенты);

        // Вывод информации о созданной учебной группе
        System.out.println("Преподаватель: " + учебнаяГруппа.получитьПреподавателя().получитьId());
        System.out.println("Студенты:");
        for (Студент студент : учебнаяГруппа.получитьСтудентов()) {
            System.out.println("  Студент id: " + студент.получитьId());
        }
    }
}
