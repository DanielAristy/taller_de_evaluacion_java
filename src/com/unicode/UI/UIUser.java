package com.unicode.UI;

import java.util.Scanner;

public abstract class UIUser {
    private static final String ENTER_THE_VALUE = "Ingrese el valor del numero";
    private static final String THEY_ARE_EQUAL = "Los numeros son iguales";
    private static final String GREATHER_THAN = " mayor que ";
    private static final String SMALLER_THAN = " menor que ";
    private static final Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        greaterOrEqualNumber();
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
