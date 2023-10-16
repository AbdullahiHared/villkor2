import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // svar : Andledning till varför den inte fungerar är att den villkor blir sant
        // från början.
        // om den inte är sant alltså tal1 > tal2 så får vi samma svar som är fel.

        // Rättad A
        System.out.println("What is the small number");
        int smallNUmber = sc.nextInt();
        int LargeNumber = 1000;

        if (smallNUmber < LargeNumber) {
            System.out.println(smallNUmber + " is less than " + LargeNumber);
        } else {
            System.out.println(smallNUmber + "is larger than " + LargeNumber);
        }

        System.out.println("Small Number = " + smallNUmber + " Large Number = " + LargeNumber);

        // Uppgift b

        System.out.println("What is the first Number");
        int firstNumber = sc.nextInt();

        System.out.println("What is the second Number");
        int secondNumber = sc.nextInt();

        if (secondNumber > firstNumber) {
            System.out.println("The value of the second Number is larger than the value of the first Number");
        } else if (firstNumber > secondNumber) {
            System.out.println("The value of the first Number is larger than the value of the second Number");
        } else {
            System.out.println(firstNumber + " =  " + secondNumber);
        }

        // uppgift d
        System.out.println("What is the time");
        double time = sc.nextDouble();

       if (time == 7) {
        System.out.println("Time to wake up");
       }
        else if (time == 12.00) {
        System.out.println("Lunch time");
       } else if (time == 23.00 || time < 7) {
        System.out.println("Time to sleep.");
       } else {
        System.out.println("You choose what to do");
       }

       sc.nextLine();

       // Club entry
       
       System.out.println("A you a member");
       String member = sc.nextLine();
       System.out.println("How old are you");
       int userAge = sc.nextInt();
       boolean isMember;

       if (member.equalsIgnoreCase("yes")) {
         isMember = true;
       } else {
         isMember = false;
       }

       if (userAge >= 18 && isMember == true) {
        System.out.println("come in");
       } else {
        System.out.println("You don't have permission.");
       }
    }
}