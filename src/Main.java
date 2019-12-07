import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println((i % 2 == 0) ? "The number is even" : "The number is not even");
        } else {
            System.out.println("Error_The number entered is not correct");
        }
        System.out.println("---===Zadanie2===---");
        while (true) {
            int first;
            int second ;
            System.out.println("Enter first number");
            Scanner a = new Scanner(System.in);
            if (a.hasNextInt()) {
                first = a.nextInt();

                System.out.println("Enter second number");
                a = new Scanner(System.in);
                if (a.hasNextInt()) {
                    second= a.nextInt();
                    System.out.println(first+" + "+second+" = "+(first+second));
                }else {
                    System.out.println("YOU MUST ENTER INT NUMBER");
                }

            }else {
                System.out.println("YOU MUST ENTER INT NUMBER");

            }
        }

    }


}
