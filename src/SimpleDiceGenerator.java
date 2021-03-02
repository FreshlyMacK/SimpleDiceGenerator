import java.util.Random;
import java.util.Scanner;

public class SimpleDiceGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWitaj w generatorze rzutu kością.");

        while (true){
            System.out.println("Wybierz opcję:" +
                    "\n 1. Rzuć kością czterościenną (k4)" +
                    "\n 2. Rzuć kością sześciościenną (k6)" +
                    "\n 3. Rzuć kością ośmiościenną (k8)" +
                    "\n 4. Rzuć kością dziesięciościenną (k10)" +
                    "\n 5. Rzuć kością dwudziestościenną (k20)" +
                    "\n 6. Rzuć kością stuścienną (k100)" +
                    "\n 7. Wyjdż");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    int result = new Random().nextInt(4)+1;
                    System.out.println("Twój wynik to: " + result);

                    String answer;
                    do {
                        System.out.println("Czy chcesz rzucić jeszcze raz tą kością? [T/N]");
                        answer = scanner.nextLine();
                        if (answer.toUpperCase().equals("T")) {
                            result = new Random().nextInt(4)+1;
                            System.out.println("Twój wynik to: " + result);
                        }
                    } while (answer.toUpperCase().equals("T"));

                    break;

                case 2:
                    result = new Random().nextInt(6)+1;
                    System.out.println("Twój wynik to: " + result);

                    do {
                        System.out.println("Czy chcesz rzucić jeszcze raz tą kością? [T/N]");
                        answer = scanner.nextLine();
                        if (answer.toUpperCase().equals("T")) {
                            result = new Random().nextInt(6)+1;
                            System.out.println("Twój wynik to: " + result);
                        }
                    } while (answer.toUpperCase().equals("T"));

                    break;

                case 3:
                    result = new Random().nextInt(8)+1;
                    System.out.println("Twój wynik to: " + result);

                    do {
                        System.out.println("Czy chcesz rzucić jeszcze raz tą kością? [T/N]");
                        answer = scanner.nextLine();
                        if (answer.toUpperCase().equals("T")) {
                            result = new Random().nextInt(8)+1;
                            System.out.println("Twój wynik to: " + result);
                        }
                    } while (answer.toUpperCase().equals("T"));

                    break;

                case 4:
                    result = new Random().nextInt(10)+1;
                    System.out.println("Twój wynik to: " + result);

                    do {
                        System.out.println("Czy chcesz rzucić jeszcze raz tą kością? [T/N]");
                        answer = scanner.nextLine();
                        if (answer.toUpperCase().equals("T")) {
                            result = new Random().nextInt(10)+1;
                            System.out.println("Twój wynik to: " + result);
                        }
                    } while (answer.toUpperCase().equals("T"));

                    break;

                case 5:
                    result = new Random().nextInt(20)+1;
                    System.out.println("Twój wynik to: " + result);

                    do {
                        System.out.println("Czy chcesz rzucić jeszcze raz tą kością? [T/N]");
                        answer = scanner.nextLine();
                        if (answer.toUpperCase().equals("T")) {
                            result = new Random().nextInt(20)+1;
                            System.out.println("Twój wynik to: " + result);
                        }
                    } while (answer.toUpperCase().equals("T"));

                    break;

                case 6:
                    result = new Random().nextInt(100)+1;
                    System.out.println("Twój wynik to: " + result);

                    do {
                        System.out.println("Czy chcesz rzucić jeszcze raz tą kością? [T/N]");
                        answer = scanner.nextLine();
                        if (answer.toUpperCase().equals("T")) {
                            result = new Random().nextInt(100)+1;
                            System.out.println("Twój wynik to: " + result);
                        }
                    } while (answer.toUpperCase().equals("T"));

                    break;

                case 7:
                    System.out.println("Koniec programu");
                    System.exit(-1);
                    break;

                default:
                    System.out.println("Nieprawidłowa opcja.");
            }
        }
    }
}