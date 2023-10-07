import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привествуем вас в самом лучшем конвертере All in meters, который переводит всё в метры!!!");
        System.out.println("Введите номер системы единиц из которой вы хотите перевести величину \n" +
                "1. СИ \n" +
                "2. Английская \n" +
                "3. Древнерусская \n" +
                "4. Римская");
        int system = scanner.nextInt();
        System.out.println("Введите значение, которое хотите перевести");
        double value = scanner.nextDouble();
        System.out.println("Введите номер единицы измерения, из которой вы хотите перевести");
        int unit;
        switch (system) {
            case 1:
                //TODO: вывести варианты единиц измерения для СИ
                unit = scanner.nextInt();
                System.out.println("Ответ: " + si(unit, value));
                break;
            case 2:
                System.out.println("1. Дюйм\n" +
                        "2. Фут\n" +
                        "3. Ярд\n" +
                        "4. Миля");
                unit = scanner.nextInt();
                System.out.println("Ответ: " + english(unit, value));
                break;
            case 3:
                System.out.println("1. Вершок\n" +
                        "2. Пядь\n" +
                        "3. Локоть\n" +
                        "4. Косая сажень\n" +
                        "5. Маховая сажень\n" +
                        "6. Фут\n" +
                        "7. Дюйм\n" +
                        "8. Сажень\n" +
                        "9. Ярд\n" +
                        "10. Верста\n" +
                        "11. Аршин");
                unit = scanner.nextInt();
                System.out.println("Ответ: " + oldRussian(unit, value));
                break;
            case 4:
                //TODO: вывести варианты единиц измерения для римской СЕ
                unit = scanner.nextInt();
                System.out.println("Ответ: " + roman(unit, value));
                break;
            default:
                System.out.println("Неверное значение");
        }
    }

    public static double si(int unit, double value){
        return 0;
    }

    public static double english(int unit, double value){
        return 0;
    }

    public static double oldRussian(int unit, double value){
        return 0;
    }

    public static double roman(int unit, double value){
        return 0;
    }
}

