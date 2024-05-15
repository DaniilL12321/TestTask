import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Calendar {
    private static final HashMap<LocalDate, Boolean> Calendar = new HashMap<>();
    static {
        Calendar.put(LocalDate.of(2024, 5, 1), true);
        Calendar.put(LocalDate.of(2024, 5, 4), true);
        Calendar.put(LocalDate.of(2024, 5, 5), true);
        Calendar.put(LocalDate.of(2024, 5, 9), true);
        Calendar.put(LocalDate.of(2024, 5, 10), true);
        Calendar.put(LocalDate.of(2024, 5, 11), true);
        Calendar.put(LocalDate.of(2024, 5, 12), true);
        Calendar.put(LocalDate.of(2024, 5, 18), true);
        Calendar.put(LocalDate.of(2024, 5, 19), true);
        Calendar.put(LocalDate.of(2024, 5, 25), true);
        Calendar.put(LocalDate.of(2024, 5, 26), true);
        Calendar.put(LocalDate.of(2024, 5, 30), true);
        Calendar.put(LocalDate.of(2024, 5, 31), true);
    }

    public static boolean isWeekend(LocalDate date) {
        Boolean isWeekend = Calendar.get(date);
        return isWeekend != null && isWeekend;
    }

    public static void main(String[] args) {
        System.out.println("Выберите уровень: 1 - проверка только даты, 2 - проверка время и даты");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите дату для проверки (день.месяц.год):");
                String[] date = scanner.nextLine().split("\\.");
                int day = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int year = Integer.parseInt(date[2]);
                LocalDate dateToCheck = LocalDate.of(year, month, day);
                System.out.println(isWeekend(dateToCheck));
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите дату для проверки (день.месяц.год):");
                String[] date2 = scanner2.nextLine().split("\\.");
                int day2 = Integer.parseInt(date2[0]);
                int month2 = Integer.parseInt(date2[1]);
                int year2 = Integer.parseInt(date2[2]);
                LocalDate dateToCheck2 = LocalDate.of(year2, month2, day2);
                if (isWeekend(dateToCheck2)) {
                    System.out.println(isWeekend(dateToCheck2));
                }
                else {
                    System.out.println("Введите время для проверки (часы:минуты):");
                    String[] time = scanner2.nextLine().split(":");
                    int hours = Integer.parseInt(time[0]);
                    System.out.println(!(hours >= 9 && hours < 18));
                }
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }
}