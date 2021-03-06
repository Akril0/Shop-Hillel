package utils;

import MyExceptions.EmptyNameException;
import MyExceptions.PriceException;
import MyExceptions.QuantityException;

import java.util.InputMismatchException;
import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода имени
    public static String validateName(Scanner scanner) throws EmptyNameException {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            try{
                throw new EmptyNameException();
            }catch (EmptyNameException e){
                System.out.print(Constants.EMPTY_NAME_MSG);
                str = scanner.nextLine().trim();
            }

        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) throws QuantityException {

        int quantity;
        String str1 = null;

        while (true) {
            while (!scanner.hasNextInt()) {
                try{
                    str1 = scanner.next().trim();
                    throw new QuantityException(str1);
                }catch (QuantityException e){
                    System.out.print(str1 + Constants.NAN_QUANTITY_MSG);
                }
            }
            quantity = scanner.nextInt();
            if (quantity <= 0) {
                try {
                throw new QuantityException();
                }catch (QuantityException e){
                    System.out.print(Constants.INCORRECT_QUANTITY_MSG);
                }}else break;
        }
        return quantity;
    }

    // Валидация ввода цены
    public static double validatePriceInput(Scanner scanner) throws PriceException {

        double price;
        String str1 = null;

        while (true) {
            while (!scanner.hasNextDouble()) {
                try {
                    str1 = scanner.next().trim();
                    throw new PriceException(str1);
                } catch (PriceException e) {
                    System.out.print(str1 + Constants.NAN_PRICE_MSG);
                }
            }
            price = scanner.nextDouble();
            if (price <= 0) {
                try{
                    throw new PriceException();
                }catch (PriceException e) {
                    System.out.print(Constants.INCORRECT_PRICE_MSG);
            }}else break;
        }
        return price;
    }
}
