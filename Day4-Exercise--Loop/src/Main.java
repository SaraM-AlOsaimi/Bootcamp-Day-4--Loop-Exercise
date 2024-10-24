import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /* 1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number. */


//        for (int i = 1; i <= 100 ; i++) {
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else System.out.println(i);

//        }
// --------------------------------------------------------------------------------------
      /* 2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT */

//
        Scanner in = new Scanner(System.in);
//
//        System.out.println("please enter a String :");
//        String str = in.nextLine();
//        String reversed = " " ;
//
//        for (int i = str.length()-1; i >= 0 ; i--) {
//            reversed += str.charAt(i) ;
//
//        }
//        System.out.println("Reverse string: " + reversed);
//

// --------------------------------------------------------------------------------------
        /*3.Write a program to find the factorial value (num!) of any number entered
through the keyboard.*/

//        System.out.println("Please enter a number");
//        int num = in.nextInt();
//
//                if (num < 0) {
//                    System.out.println("Factorial is not defined for negative numbers.");
//                } else {
//                    int facValue = 1 ;
//
//                    for (int i = 1; i <= num; i++) {
//                        facValue *= i;
//                    }
//                    System.out.println("Factorial of " + num + " is " + facValue);
//                }

// --------------------------------------------------------------------------------------
        /* 4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java
built-in method)*/
//
//        System.out.println("enter the first number ");
//        int firstNum = in.nextInt();
//
//        System.out.println("enter the second number ");
//        int secondNum = in.nextInt();
//
//        if (secondNum < 0) {
//            System.out.println("Power number must be a non-negative integer.");
//        } else {
//            int result = 1;
//
//            for (int i = 0; i < secondNum; i++) {
//                result *= firstNum;
//            }
//            System.out.println(result);
//        }

// --------------------------------------------------------------------------------------
        /* 5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.*/


//        int numbers ;
//        int evenSum = 0;
//        int oddSum = 0;
//
//        while (true){
//            System.out.println("Please enter a number ");
//              numbers = in.nextInt();
//
//             if (numbers == 0 ){
//                 break;
//
//             } else if (numbers % 2 == 0) {
//                 evenSum += numbers;
//         } else  oddSum += numbers;
//        }
//        System.out.println("Even numbers sum: " + evenSum);
//        System.out.println("Odd numbers sum: " + oddSum);


// --------------------------------------------------------------------------------------
        /* 6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.*/

//        System.out.println("enter a positive integer");
//        int num = in.nextInt();
//
//        boolean prime = true;
//
//
//        if (num <= 1) {
//            prime = false;
//        }
//        for (int i =2 ; i <= num/2;i++) {
//            if (num % i == 0) {
//                prime = false;
//                break;
//            }
//        }
//            if (prime){
//                System.out.println(num + " is a Prime Number");
//            } else System.out.println(num + " Is not a prime number ");
//


// --------------------------------------------------------------------------------------
       /* 7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.*/

//                for (int i = 1; i <= 4; i++) {
//                    System.out.println("Week " + i);
//
//                    for (int j = 1; j <= 7; j++) {
//                        System.out.println("Day " + j);
//                    }
//
//                }



// --------------------------------------------------------------------------------------
        /*8.Write a program that check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.*/

        System.out.println("Enter a word ");
        String word = in.nextLine();

        String reversed = "" ;

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i) ;

        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }
}