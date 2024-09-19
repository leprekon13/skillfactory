public class CalculatorLogic {

    // Поле для хранения текущего результата
    private double result;

    // Конструктор: инициализация результата
    public CalculatorLogic() {
        this.result = 0.0;
    }

    /**
     * Метод для выполнения арифметической операции
     * @param operation - строка с операцией (+, -, *, /)
     * @param number - число, которое будет участвовать в вычислениях
     */
    public void calculate(String operation, double number) {
        switch (operation) {
            case "+":
                this.result += number;
                break;
            case "-":
                this.result -= number;
                break;
            case "*":
                this.result *= number;
                break;
            case "/":
                if (number == 0) {
                    System.out.println("Ошибка: Деление на ноль невозможно.");
                } else {
                    this.result /= number;
                }
                break;
            default:
                System.out.println("Ошибка: Некорректная операция.");
                break;
        }
    }

    /**
     * Метод для сброса текущего результата
     */
    public void clear() {
        this.result = 0.0;
    }

    /**
     * Метод для получения текущего результата
     * @return текущий результат
     */
    public double getResult() {
        return this.result;
    }
}
