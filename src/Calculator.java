import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Инициализация сканера для получения ввода от пользователя
        Scanner scanner = new Scanner(System.in);

        // Создание экземпляра класса логики калькулятора
        CalculatorLogic calculator = new CalculatorLogic();

        // Основной цикл программы
        while (true) {
            System.out.println("Введите операцию (+, -, *, /) или 'C' для сброса, 's' для выхода:");

            // Получение операции от пользователя
            String operation = scanner.nextLine();

            // Если пользователь ввел 's', выходим из программы
            if (operation.equalsIgnoreCase("s")) {
                System.out.println("Программа завершена.");
                break;
            }

            // Если пользователь ввел 'C', сбрасываем результат
            if (operation.equalsIgnoreCase("C")) {
                calculator.clear();
                System.out.println("Результат сброшен.");
                continue;
            }

            // Запрос у пользователя числа для следующей операции
            System.out.println("Введите число:");
            double number;
            try {
                number = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число.");
                continue;
            }

            // Выполнение операции
            calculator.calculate(operation, number);
            System.out.println("Текущий результат: " + calculator.getResult());
        }

        // Закрытие сканера
        scanner.close();
    }
}
