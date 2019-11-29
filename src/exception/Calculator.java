package exception;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        System.out.print("a=");
        int a = reader.nextInt();
        System.out.println("b=");
        int b = reader.nextInt();
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Operatie invalida");
        }

    }

    private static void divide(int a, int b) throws InvalidParameterException {
        if( b==0) {
            throw new InvalidParameterException();
        }

    }
}
