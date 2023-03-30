import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);
        firstImplementation(scanner);
    }


    public static void firstImplementation(Scanner scanner) {
        List<Card> card = new ArrayList<>();
        char state = 'A';
        boolean cycle = true;
        int pin, numCard = -50;

        Card test = new Card(0000,5000000);
        Card card1 = new Card(1234, 1000);
        Card card2 = new Card(1111,0);
        card.add(test);
        card.add(card1);
        card.add(card2);

        while(cycle) {

            switch (state) {
                case 'A' -> {
                    System.out.println("Добрый день. Введите номер карты (от 1 до " + card.size() + ") (Для выключения автомата введите 0): ");
                    numCard = scanner.nextInt() - 1;
                    if (numCard == -1) {
                        state = 'O';
                    } else {
                        state = 'B';
                    }
                }
                case 'B' -> {
                    System.out.println("Чтение карты...");
                    if (numCard < 0 || numCard >= card.size()) {
                        System.out.println("Карта недействительна");
                        state = 'A';
                        numCard = 0;
                    } else {
                        System.out.println(numCard);
                        state = 'C';
                    }
                }
                case 'C' -> {
                    System.out.println("Введите пин-код");
                    pin = scanner.nextInt();
                    if (pin == card.get(numCard).getPinCard()) {
                        System.out.println("Добро пожаловать!");
                        state = 'D';
                    } else {
                        System.out.println("Пин-код введен неверно");
                    }
                }
                case 'D' -> {
                    System.out.println("Что вы хотите сделать? Введите номер действия\n1. Посмотреть баланс\n2. Снять деньги\n3. Выйти");
                    int action = scanner.nextInt();
                    if (action == 1) {
                        System.out.println("Баланс: " + card.get(numCard).getBalanceCard() + " рублей");
                        System.out.print("\033[H\033[2J");

                    } else if (action == 2) {
                        state = 'E';
                    } else if (action == 3) {
                        state = 'A';
                    } else {
                        System.out.println("Введен неправильный пункт меню");
                    }
                }
                case 'E' -> {
                    System.out.println("Введите -1, чтобы выйти или введите сумму: ");
                    double money = scanner.nextInt();
                    if (money == -1.0)
                    {
                        state = 'D';
                    } else if (money > card.get(numCard).getBalanceCard()) {
                        System.out.println("Недостаточно средств");
                    } else {
                        card.get(numCard).setBalanceCard(card.get(numCard).getBalanceCard() - money);
                        state = 'A';
                        numCard = -50;
                        System.out.println("Всего доброго");
                    }
                }
                case 'O' -> cycle = false;
            }
        }
    }
}
