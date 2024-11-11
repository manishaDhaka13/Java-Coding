import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
//        inputThenPrintSumAndAverage();
        inputThenPrintSumAndAveragee();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;
        while (true) {
            System.out.println("enter a number or a Character to exit");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("SUM = " + sum);
                double average = (double)sum / counter;
                avg = Math.round(average);
                System.out.println("AVG = " + avg);
                break;
            }

        }
    }


    public static void inputThenPrintSumAndAveragee() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            System.out.println("enter a number or a Character to exit");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                // break the loop on invalid input
                break;
            }
            sum += scanner.nextInt();
            count++;
            // clear buffer e.g. remove line separator
            scanner.nextLine();
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}



