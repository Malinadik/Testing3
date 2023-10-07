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
        System.out.println("Ответ:");
        switch (system) {
            case 1:
                System.out.println(si(system, value));
                break;
            case 2:
                System.out.println(english(system, value));
                break;
            case 3:
                System.out.println(oldRussian(system, value));
                break;
            case 4:
                System.out.println(roman(system, value));
                break;
            default:
                System.out.println("Неверное значение");
        }
    }

    public static double si(int system, double value){
        return 0;
    }

    public static double english(int system, double value){
        return 0;
    }

    public static double oldRussian(int system, double value){
        return 0;
    }

    public static double roman(int system, double value){
        return 0;
    }
}

