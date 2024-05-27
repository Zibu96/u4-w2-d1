import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        ------------------ESERCIZIO1--------------

        int[] randNum = new int[5];

        for (int i = 0; i < randNum.length; i++) {
            Random random = new Random();
            int min = 1;
            int max = 10;
            int value = random.nextInt(max - min + 1) + min;

            randNum[i] = value;
        }

        System.out.println(Arrays.toString(randNum));


//        Scanner  scanner = new Scanner(System.in);
//
//
//        int index = 0;
//        do {
//            System.out.println("Quale numero vuoi inserire nell'array?");
//            int num = scanner.nextInt();
//            System.out.println("Quale posizione dell'array vuoi modificare?");
//            index = scanner.nextInt();
//            switch (index) {
//                case 1: {
//                    randNum[0] = num;
//                    break;
//                }
//                case 2: {
//                    randNum[1] = num;
//                    break;
//                }
//                case 3: {
//                    randNum[2] = num;
//                    break;
//                }
//                case 4: {
//                    randNum[3] = num;
//                    break;
//                }
//                case 5: {
//                    randNum[4] = num;
//                    break;
//                }
//                case 0: {
//                    System.out.println("Come direbbe Super Mario... BYE BYE");
//                    break;
//                }
//                default: {
//                    try {
//                        throw new ArrayIndexOutOfBoundsException("hai superato il limite dell'array");
//                    } catch (ArrayIndexOutOfBoundsException ex) {
//                        System.err.println(ex.getMessage());
//                    }
//
//
//                }
//
//            }
//            System.out.println("Il nuovo array è: " + Arrays.toString(randNum));
//
//        } while (index != 0);
//        scanner.close();

        //-----------------ESERCIZIO 2----------------

        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.println("Quanti chilometri hai percorso?");
            int km = scanner1.nextInt();
            System.out.println("E quanti litri di carburante hai utilizzato?");
            int carb = scanner1.nextInt();
            System.out.println("Hai percorso: " + (km / carb) + " km con un litro");
        } catch (ArithmeticException ex) {
            System.err.println("Non puoi dividere per zero! Oppure hai una macchina elettrica");
        } catch (InputMismatchException ex) {
            System.err.println("Non hai inserito un numero!");
        } finally {
            scanner1.close();
        }

    }

}
