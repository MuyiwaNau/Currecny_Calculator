package basic;

import java.lang.invoke.SwitchPoint;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int decision;

        do {
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formatDate = date.format(myFormatObj);
            System.out.println("Welcome to akin currency converter " + "Date: " + formatDate);
            System.out.println("********************");
            System.out.println("What's the amount of money ");
            int op = scanner.nextInt();
            System.out.println(op);

            System.out.println("Insert the currency you want to convert to uah");
            System.out.println("\n1. Dollars");
            System.out.println("\n2. Euros");
            System.out.println("\n3. Pounds");

            Scanner scanner1 = new Scanner(System.in);
            int currency = scanner1.nextInt();

            double result = switch (currency) {
                case 1 -> op * 27.45;
                case 2 -> op * 33.5;
                case 3 -> op * 38.8;
                default -> 0;
            };
            System.out.println("The amount in uah is: " + result);


            System.out.println("Do you wish to continue ??");
            System.out.println("\n1. Yes");
            System.out.println("\n2. No");
            decision = scanner.nextInt();

        }while (decision != 2);
    }
}
