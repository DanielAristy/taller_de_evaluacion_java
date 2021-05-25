package com.unicode.UI;

import java.util.Scanner;

public abstract class UIUser {
    private static final String ENTER_THE_VALUE = "Ingrese el valor del numero";
    private static final String THEY_ARE_EQUAL = "Los numeros son iguales";
    private static final String GREATHER_THAN = " mayor que ";
    private static final String SMALLER_THAN = " menor que ";
    private static final String PRODUCT_VALUE = "Ingrese el valor del producto con . decimal si lo desea";
    private static final String PRODUCT_VALUE_WITH_IVA = "El valor del producto con IVA es ";
    private static final double IVA = 0.21;
    private static final double PI = Math.PI;
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_ONE_HUNDRED = 100;
    private static final Scanner sc = new Scanner(System.in);

    public static void showMenu(){
        greaterOrEqualNumber();
        calculateAreaOfACircle();
        calculateIVA();
        getOddAndEvenNumbers();
        numberGreaterThanOrEqualToZero();
    }

    //Ejercicios del taler

    //1. Numero mayor o igual
    //2. Ingresar por consola cual de los numeros es mayor, menor o igual
    private static void greaterOrEqualNumber(){
        showMessage(ENTER_THE_VALUE);
        int numberOne = sc.nextInt();
        showMessage(ENTER_THE_VALUE);
        int numberTwo = sc.nextInt();

        if (isEquals(numberOne, numberTwo)){
            showMessage(THEY_ARE_EQUAL);
        }else if (theNumberIsGreater(numberOne, numberTwo)){
            showMessage(numberOne + GREATHER_THAN + numberTwo);
        }else {
            showMessage(numberTwo + GREATHER_THAN + numberOne);
            showMessage(numberOne + SMALLER_THAN + numberTwo);
        }
    }
    //3. Calcular el area del circulo
    private static void calculateAreaOfACircle(){
        showMessage("\nIngrese el radio del Círculo");
        getString();
        String radio = getString();
        double area = PI * getNumberSquared(radio);
        showMessage("El area del circulo es " + area);
        showMessage("");
    }
    //4. Precio del producto con IVA incluido
    private static void calculateIVA(){
        showMessage("\n" + PRODUCT_VALUE);
        String price = getString();
        double convertToDouble = parseDouble(price);
        double result = getFullPrice(convertToDouble);
        showMessage(PRODUCT_VALUE_WITH_IVA   + result);
    }

    //5. Numeros impares del 1 al 100;
    private static void getOddAndEvenNumbers(){
        getNumberIsOddAndEvenWithWhile(NUMBER_ONE, NUMBER_ONE_HUNDRED);
        getNumberIsOddAndEvenWithFor(NUMBER_ONE, NUMBER_ONE_HUNDRED);
    }

    private static void getNumberIsOddAndEvenWithWhile(int initial, int end) {
        showMessage("\nCon While");
        while (initial <= end){
            getNumberIsOdd(initial);
            getNumberIsEven(initial);
            initial++;
        }
    }

    private static void getNumberIsOdd(int initial) {
        if (numberIsOdd(initial)){
            showMessage("Numero impar");
            System.out.println(initial);
        }
    }

    private static void getNumberIsEven(int initial) {
        if (numberIsEven(initial)){
            showMessage("Numero par");
            System.out.println(initial);
        }
    }

    //6. Numeros pares e impares con el ciclo for
    private static void getNumberIsOddAndEvenWithFor(int numberOne, int numberOneHundred) {
        showMessage("\nCon For");
        for (int i = numberOne; i <= numberOneHundred; i++) {
            getNumberIsOdd(i);
            getNumberIsEven(i);
        }
    }

    //7. Numero >= 0 sino volver a pedirlo hasta que pase
    private static void numberGreaterThanOrEqualToZero(){
        double response = 0;
        do {
            showMessage("Ingrese un valor para validar que no sea cero");
            response = sc.nextInt();
        }while (response <= 0.0);
    }

    private static boolean numberIsEven(int initial) {
        return initial % 2 == 0;
    }

    private static boolean numberIsOdd(int initial) {
        return initial % 2 != 0;
    }

    private static double getFullPrice(double price) {
        return price + getIva(price);
    }

    private static double getIva(double price) {
        return price * IVA;
    }

    private static double getNumberSquared(String radio) {
        return Math.pow(parseDouble(radio),2);
    }

    private static double parseDouble(String valor) {
        return Double.parseDouble(valor);
    }

    private static String getString(){
        return sc.nextLine();
    }

    private static boolean theNumberIsGreater(int numberOne, int numberTwo) {
        return numberOne > numberTwo;
    }

    private static boolean isEquals(int numberOne, int numberTwo) {
        return numberOne == numberTwo;
    }

    private static void showMessage(String message){
        System.out.println(message);
    }
}
