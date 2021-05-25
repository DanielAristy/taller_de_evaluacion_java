package com.unicode.UI;

public abstract class UIUser {

    public static void showMenu(){
        greaterOrEqualNumber();
    }

    //Ejercicios del taler

    //1. Numero mayor o igual
    private static void greaterOrEqualNumber(){
        int numberOne = 20;
        int numberTwo = 10;

        if (numberOne == numberTwo){
            showMessage("Los numeros son iguales");
        }else if (numberOne > numberTwo){
            showMessage("El numero " + numberOne + " es mayor que " + numberTwo);
        }else showMessage("El numero " + numberTwo + " es mayor que " + numberOne);
    }

    private static void showMessage(String message){
        System.out.println(message);
    }
}
