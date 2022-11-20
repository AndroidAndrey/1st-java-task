import java.util.Locale;
import java.util.Scanner;
public class Calc {

    public static void Calculator() {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        double count = 0;
        boolean cont = true;
        while (cont) {
            System.out.println("Введите название товара");
            String res = scanner.next();
            if (res.toUpperCase(Locale.ROOT).equals("ЗАВЕРШИТЬ")) {
                cont = false;
            } else {
                result += res + "\n";
                System.out.println("Введите стоимость в формате: \'рубли.копейки'  ");
                String temp = scanner.next();

                if (!checkPrice(temp)) {
                    System.out.println("Некорректные данные");
                } else {
                    System.out.println("Товар " + res + " успешно добавлен");
                    count += Double.parseDouble(temp);
                }
            }
        }

        String resultMessage = ("Общая стоимость: %.2f RUB");
    System.out.println(String.format(resultMessage, count));
        String resultMessage1 = ("Каждый заплатит: %.2f RUB");
        System.out.println(String.format(resultMessage1,count/Users.users));

    }

    public static boolean checkPrice(String next) {
        boolean isDigit = true;
        for (int i = 0; i < next.length(); i++) {
            if (!Character.isDigit(next.charAt(i)) && next.charAt(i) != '.') {
                isDigit = false;
                break;
            }
        }
        return isDigit;


    }
}




