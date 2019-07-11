package commandcalculator;

import java.util.Scanner;

public class CommandCalculator
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Variable Declarations.        
        Operations calculator = new Operations();
        Scanner keyboard = new Scanner(System.in);
        char operation = ' ';
        boolean endLoop = false;
        double tempNumOne = 0;
        double tempNumTwo = 0;

        // Repeat until user wants to finish.
        while (!endLoop)
        {
            // Displaying info.
            System.out.println("Enter a an operation: \n" + "[+] Addition \n[-] Substraction \n[*] Multiplication \n[/] Division \n[0] End program \nEnter the value: ");

            // Reading input.
            operation = keyboard.next().charAt(0);

            // Switch statement for operations.
            switch (operation)
            {
                // Addition.
                case '+':
                    // Catch an error(Exceptions) in case of bad input.
                    try
                    {
                        // Getting the two values.
                        System.out.println("Enter number one:");
                        tempNumOne = keyboard.nextDouble();
                        System.out.println("Enter number two:");
                        tempNumTwo = keyboard.nextDouble();
                    } catch (Exception InputMismatchException)
                    {
                        // The user typed a bad input.Get the error and continue running the program without crashing.
                        System.out.println("!!!Error!!! You didn't enter a number, try again\n");
                    }

                    // Displaying the result.
                    System.out.println("The result is: " + calculator.add(tempNumOne, tempNumTwo) + "\n");
                    break;

                // Substraction.    
                case '-':
                    // Catch an error(Exceptions) in case of bad input.
                    try
                    {
                        // Getting the two values.
                        System.out.println("Enter number one:");
                        tempNumOne = keyboard.nextDouble();
                        System.out.println("Enter number two:");
                        tempNumTwo = keyboard.nextDouble();
                    } catch (Exception InputMismatchException)
                    {
                        // The user typed a bad input.Get the error and continue running the program without crashing.
                        System.out.println("!!!Error!!! You didn't enter a number, try again\n");
                    }

                    // Displaying the result.
                    System.out.println("The result is: " + calculator.substract(tempNumOne, tempNumTwo) + "\n");
                    break;

                // Multiplication.    
                case '*':
                    // Catch an error(Exceptions) in case of bad input.
                    try
                    {
                        // Getting the two values.
                        System.out.println("Enter number one:");
                        tempNumOne = keyboard.nextDouble();
                        System.out.println("Enter number two:");
                        tempNumTwo = keyboard.nextDouble();
                    } catch (Exception InputMismatchException)
                    {
                        // The user typed a bad input.Get the error and continue running the program without crashing.
                        System.out.println("!!!Error!!! You didn't enter a number, try again\n");
                    }

                    // Displaying the result.
                    System.out.println("The result is: " + calculator.multiply(tempNumOne, tempNumTwo) + "\n");
                    break;

                case '/':
                    // Temp var to test the result.
                    double result = 0.0;

                    // Catch an error(Exceptions) in case of bad input.
                    try
                    {
                        // Getting the two values.
                        System.out.println("Enter number one:");
                        tempNumOne = keyboard.nextDouble();
                        System.out.println("Enter number two:");
                        tempNumTwo = keyboard.nextDouble();

                        // Catch an error(Exceptions) in case of division by 0. FIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//                        try
//                        {
                        result = calculator.division(tempNumOne, tempNumTwo);
//                        } catch (Exception DivisionByZero)
//                        {
//                            System.out.println("!!!Error!!! Division by zero is not defined, try again\n");
//                        }                                                      FIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                        // Displaying the result.
                        System.out.println("The result is: " + result + "\n");

                    } catch (Exception InputMismatchException)
                    {
                        // The user typed a bad input.Get the error and continue running the program without crashing.
                        System.out.println("!!!Error!!! You didn't enter a number, try again\n");
                    }
                    break;

                case '0':
                    endLoop = true;
                    System.out.println("The program has finished sucessfully");
                    break;

                default:
                    System.out.println("Not a valid input\n");
            }
        }
    }
}
