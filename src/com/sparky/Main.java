package com.sparky;
import java.util.Scanner;
public class Main {

    public static void operation(int number){
        System.out.println("Enter The first value.");
        Scanner input = new Scanner(System.in);
        int firstValue = input.nextInt();
        System.out.println("Enter The second value.");
        int secondValue = input.nextInt();
        switch (number) {
            case 0 -> System.out.println("Your sum is " + (firstValue + secondValue));
            case 1 -> System.out.println("Your subtraction is " + (firstValue - secondValue));
            case 2 -> System.out.println("Your multiplication is " + (firstValue * secondValue));
            case 3 -> System.out.println("Your division is " + (firstValue / secondValue));
            default -> System.out.println("Invalid operation. Please choose 0-4.");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean program = true;
        while(program){
            System.out.println("-------------------");
            System.out.println("Select Your Operation");
            System.out.println("0 : Addition");
            System.out.println("1 : Subtract");
            System.out.println("2 : Multiplication");
            System.out.println("3 : Division");
            System.out.println("4 : Quit");
            int operationSelection = input.nextInt();
            if(operationSelection == 4){
                program = false;
            } else {

                operation(operationSelection);
            }

            }
        }
    }
