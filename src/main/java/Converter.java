import java.math.BigDecimal;
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
        BigDecimal value = scanner.nextBigDecimal();
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

    public static BigDecimal si(int unit, BigDecimal value){
        return BigDecimal.valueOf(0);
    }

    public static BigDecimal english(int unit, BigDecimal value){
        return BigDecimal.valueOf(0);
    }

    public static BigDecimal oldRussian(int unit, BigDecimal value){
        BigDecimal ans = BigDecimal.valueOf(0.0);
        switch (unit){
            case 1:
                ans = BigDecimal.valueOf(0.0445).multiply(value);
                break;
                //TODO заменить все на BigDecimal
            case 2:
                ans = BigDecimal.valueOf(0.0445 * 4).multiply(value);
                break;
            case 3:
                ans = BigDecimal.valueOf(0.45).multiply(value);
                break;
            case 4:
                ans = BigDecimal.valueOf(2.48).multiply(value);
                break;
            case 5:
                ans = BigDecimal.valueOf(1.76).multiply(value);
                break;
            case 6:
                ans = BigDecimal.valueOf(0.31).multiply(value);
                break;
            case 7:
                ans = BigDecimal.valueOf(0.025).multiply(value);
                break;
            case 8:
                ans = BigDecimal.valueOf(2.13).multiply(value);
                break;
            case 9:
                ans = BigDecimal.valueOf(0.91).multiply(value);
                break;
            case 10:
                ans = BigDecimal.valueOf(1067).multiply(value);
                break;
            case 11:
                ans = BigDecimal.valueOf(0.71).multiply(value);
                break;
            default:
                System.out.println("Неверные данные");
                return BigDecimal.valueOf(0);
        }
        return ans;
    }

    public static BigDecimal roman(int unit, BigDecimal value){
        return BigDecimal.valueOf(0);
    }
}

