import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1.3
        System.out.println("Задача 1.3:");
        System.out.println("Введите имя (или оставьте пустым):");
        String first_name1 = getInputName(scanner);

        System.out.println("Введите фамилию (или оставьте пустым):");
        String last_name1 = getInputName(scanner);

        System.out.println("Введите отчество (или оставьте пустым):");
        String middle_name1 = getInputName(scanner);

        Name nameInput = new Name(last_name1, first_name1, middle_name1);

        Name NameFromTask1 = new Name("", "Клеопатра", "");
        Name NameFromTask2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name NameFromTask3 = new Name("Маяковский", "Владимир", "");

        System.out.println("Введенное имя: " + nameInput);
        System.out.println("\nИмена из условия задачи:");
        System.out.println(NameFromTask1);
        System.out.println(NameFromTask2);
        System.out.println(NameFromTask3);


        // Задача 1.4
        System.out.println("\nЗадача 1.4:");
        System.out.println("Введите количество секунд: ");
        int second1Input = getInputTime(scanner);

        Time time = new Time(second1Input);

        Time timeFromTask1 = new Time(10);
        Time timeFromTask2 = new Time(1000);
        Time timeFromTask3 = new Time(100000);

        System.out.println("\nТекстовая форма введенного времени: " + time);
        System.out.println("\nТекстовая форма времени из условия задачи:");
        System.out.println(timeFromTask1);
        System.out.println(timeFromTask2);
        System.out.println(timeFromTask3);


        // Задача 2.4
        System.out.println("\nЗадача 2.4:");

        System.out.println("Введите фамилию сотрудника:");
        String nameEmployee = getInputName(scanner);

        System.out.println("Введите фамилию начальника:");
        String nameChief = getInputName(scanner);

        System.out.println("Введите отдел:");
        String departmentName = getInputName(scanner);

        Employee employee = new Employee(nameEmployee, departmentName);
        Employee chief = new Employee(nameChief, departmentName);

        // Устанавливаю начальника отдела
        chief.setChief(chief);
        employee.setChief(chief);

        Employee name1 = new Employee("Петров", "IT");
        Employee name2 = new Employee("Козлов", "IT");
        Employee name3 = new Employee("Сидоров", "IT");

        // Устанавливаю Козлова начальником отдела IT
        name2.setChief(name2);

        // Устанавливаю начальником для остальных сотрудников
        name1.setChief(name2);
        name3.setChief(name2);

        // Вывод информации о сотрудниках
        System.out.println("Новый отдел с сотрудниками: ");
        System.out.println(employee);
        System.out.println(chief);

        System.out.println("\nСотрудники из условия задачи:");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        // Задача 3.4
        System.out.println("\nЗадача 3.4:");


        // Задача 4.4
        System.out.println("\nЗадача 4.4:");
        System.out.println("Введите количество секунд: ");
        int second2Input = getInputTime(scanner);

        System.out.println("Введите часы, минуты, секунды: ");
        int hourInput = getInputTime(scanner);
        int minuteInput = getInputTime(scanner);
        int secInput = getInputTime(scanner);

        Time time2 = new Time(second2Input);
        Time hms = new Time(hourInput, minuteInput, secInput);

        Time timeFromTask = new Time(10000);
        Time timeFromTaskHMS = new Time(2, 3, 5);

        System.out.println("\nТекстовая форма введенного времени: " + time2);
        System.out.println("\nТекстовая форма введенных часов, минут, секунд: " + hms);
        System.out.println("\nТекстовая форма времени из условия задачи:");
        System.out.println(timeFromTask);
        System.out.println(timeFromTaskHMS);


        // Задача 5.4
        System.out.println("\nЗадача 5.4:");
        System.out.println("Введите время в секундах, чтобы получить число часов, минут(с начала часа), секунд(с начала минуты): ");
        int hour2Input = getInputTime(scanner);
        int minute2Input = getInputTime(scanner);
        int sec2Input = getInputTime(scanner);

        Time timeH = new Time(hour2Input);
        Time timeM = new Time(minute2Input);
        Time timeS = new Time(sec2Input);

        Time time1FromTask = new Time(34056);
        Time time2FromTask = new Time(4532);
        Time time3FromTask = new Time(123);

        System.out.println("\nТекстовая форма введенного времени:");
        System.out.println("Часы: " + timeH.getHour());
        System.out.println("Минуты: " + timeM.getMinute());
        System.out.println("Секунды: " + timeS.getSecond());

        System.out.println("\nТекстовая форма времени из условия задачи:");
        System.out.println("Часы: " + time1FromTask.getHour());
        System.out.println("Минуты: " + time2FromTask.getMinute());
        System.out.println("Секунды: " + time3FromTask.getSecond());

    }

    // Проверка для задания 1.3, 2.4
    private static String getInputName(Scanner scanner) {
        String input = scanner.nextLine();
        while (!input.matches("[a-zA-Zа-яА-Я]*")) {
            System.out.println("Ошибка: Введите строку.");
            input = scanner.nextLine();
        }
        return input;
    }

    // Проверка для задания 1.4 и 4.4 и 5.4
    private static int getInputTime(Scanner scanner) {
        int input = scanner.nextInt();
        scanner.nextLine();
        while (input < 0) {
            System.out.println("Ошибка: Введите положительное число.");
            System.out.println("Введите количество секунд: ");
            input = scanner.nextInt();
            scanner.nextLine();
        }
        return input;
    }
}