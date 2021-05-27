package com.unicode.ui;

import com.unicode.WorkingDay;
import com.unicode.model.Person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class UIUser {
    private static final String ENTER_THE_VALUE = "Ingrese el valor del numero";
    private static final String THEY_ARE_EQUAL = "Los numeros son iguales";
    private static final String GREATHER_THAN = " mayor que ";
    private static final String SMALLER_THAN = " menor que ";
    private static final String PRODUCT_VALUE = "Calcular el valor de un producto mas el iva, ingrese el valor del producto con . decimal";
    private static final String PRODUCT_VALUE_WITH_IVA = "El valor del producto con IVA es ";
    private static final String SMILE = "La sonrisa sera la mejor arma contra la tristeza";
    private static final String EMPATHY = ", la empatia es la participacion afectiva de una persona en una realidad ajena a ella.";
    private static final String GREATER_LESS_OR_EQUAL = "Ingresa dos valores y se devolvera si es Mayor, menor ó igual\n";
    private static final String CIRCLE_RADIO = "\nCalcular el radio del Círculo, ingrese el radio";
    private static final String CIRCLE_AREA = "El area del circulo es ";
    private static final String WITH_WHILE = "\nCon While";
    private static final String ODD_NUMBER = "Numero impar";
    private static final String EVEN_NUMBER = "Numero par";
    private static final String WITH_FOR = "\nCon For";
    private static final String DON_T_BE_ZERO  = "Ingrese un valor para validar que sea mayor que cero";
    private static final String WEEKDAY = "Escriba el dia de la semana";
    private static final String NOT_A_DAY_OF_THE_WEEK = "No es un dia de la semana";
    private static final String IT_IS_NOT_WORK = " no es laboral";
    private static final String IT_S_A_BUSINESS_DAY = " es un dia laboral";
    private static final String ADDITIONAL_TEXT = " y se adiciona un texto adicional\n";
    private static final String CHARACTER_CHANGE = "Se hace el cambio de un caracter identificado por la letra a por e en el texto";
    private static final String TEXT_WITHOUT_SPACES = "\nIngrese un texto con espacios, para devolverle un texto sin espacios";
    private static final String CHARACTER_TO_REPLACE = "a";
    private static final String REPLACEMENT_CHARACTER = "e";
    private static final double IVA = 0.21;
    private static final double PI = Math.PI;
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_ONE_HUNDRED = 100;
    private static final Scanner sc = new Scanner(System.in);


    public static void showMenu() throws Exception {
//        greaterOrEqualNumber();
//        calculateAreaOfACircle();
//        calculateIVA();
//        getOddAndEvenNumbers();
//        numberGreaterThanOrEqualToZero();
//        getWorkDay();
//        getModifiedString();
//        getTextWithoutSpaces();
//        getPhraseLengthAndNumberOfVowels();
//        getEqualityOrDifferenceBetweenLetters();
//        getDateAndTimeInFormat();
//        showOptionsMenu();
        validateUserInformation();
    }
    //Ejercicios del taler
    //1. Numero mayor o igual
    //2. Ingresar por consola cual de los numeros es mayor, menor o igual
    private static void greaterOrEqualNumber(){
        showMessage(GREATER_LESS_OR_EQUAL);
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
        showMessage(CIRCLE_RADIO);
        getString();
        String radio = getString();
        double area = PI * getNumberSquared(radio);
        showMessage(CIRCLE_AREA + area);
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
        showMessage(WITH_WHILE);
        while (initial <= end){
            getNumberIsOdd(initial);
            getNumberIsEven(initial);
            initial++;
        }
    }
    private static void getNumberIsOdd(int initial) {
        if (numberIsOdd(initial)){
            showMessage(ODD_NUMBER);
            System.out.println(initial);
        }
    }
    private static void getNumberIsEven(int initial) {
        if (numberIsEven(initial)){
            showMessage(EVEN_NUMBER);
            System.out.println(initial);
        }
    }
    //6. Numeros pares e impares con el ciclo for
    private static void getNumberIsOddAndEvenWithFor(int numberOne, int numberOneHundred) {
        showMessage(WITH_FOR);
        for (int i = numberOne; i <= numberOneHundred; i++) {
            getNumberIsOdd(i);
            getNumberIsEven(i);
        }
        showMessage("");
    }
    //7. Numero >= 0 sino volver a pedirlo hasta que pase
    private static void numberGreaterThanOrEqualToZero(){
        double response = 0;
        do {
            showMessage(DON_T_BE_ZERO);
            response = sc.nextInt();
        }while (response <= 0.0);
    }
    //8. obtener dia laborar de resto informarlo
    private static void getWorkDay() throws Exception {
        showMessage(WEEKDAY);
        getString();
        String weekDay = getString();
        WorkingDay day = WorkingDay.valueOf(weekDay.toUpperCase());
        switch (day){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                getWorkingDay(day);
                break;
            case SABADO:
            case DOMINGO:
                nonWorkingDay(day);
                break;
            default:
                throw new Exception(NOT_A_DAY_OF_THE_WEEK);
        }
    }
    //9. Obtener cadena y agregar en las letras que coincidad con a
    //cambiarlas por e y sumarle la cadena que queramos
    private static void getModifiedString(){//Obtener cadena modificada
        showMessage(CHARACTER_CHANGE);
        String text = SMILE;
        showMessage(text + ADDITIONAL_TEXT);
        String additionalText = EMPATHY;
        String replaceCharacter = getReplaceCharacterInText(text,CHARACTER_TO_REPLACE,REPLACEMENT_CHARACTER);
        String modifiedText = getTextConcatenation(replaceCharacter, additionalText);
        showMessage(modifiedText);
    }
    //10. Capturar el texto por consola y devolverlo sin espacios
    private static void getTextWithoutSpaces(){
        showMessage(TEXT_WITHOUT_SPACES);
        String text = getString();
        showMessage(getReplaceCharacterInText(text," ",""));
    }
    //11. Calcular la longitud de una frase y la cantidad de vocales que hay de cada una
    /** ASCII
     * a -> 97
     * e -> 101
     * i -> 105
     * o -> 111
     * u -> 117
     * */
    private static void getPhraseLengthAndNumberOfVowels(){
        showMessage("\nIngrese una frase");
        String phrase = getString();
        int phraseLength = getPhraseLength(phrase);
        showMessage("La longitud de la frase: "+ phraseLength + " caracteres");
        getAmountOfVowels(phrase);
    }
    //12. Igualdad o diferencia entre letras
    private static void getEqualityOrDifferenceBetweenLetters(){
        showMessage("Ingresa una letra: ");
        String letterOne = getString();
        showMessage("Ingresa una letra: ");
        String letterTwo = getString();

        if (letterOne.equalsIgnoreCase(letterTwo)){
            showMessage("Las letra " + letterOne +" es igual "+ letterTwo);
        }else {
            showMessage("Las letra " + letterOne +" es diferente "+ letterTwo);
        }
    }
    private static void getAmountOfVowels(String phrase) {
        getVowels(phrase);
    }
    //13. Calcular la fecha y hora de un formato determinado
    private static void getDateAndTimeInFormat(){
        showMessage("");
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");
        showMessage("Fecha actual y hora: " + dateFormat.format(date));
    }
    //14.
    private static void getNumbersUpToOneThousand(){

    }
    //15. Mostrar
    private static void showOptionsMenu(){
        int response = 8;
        do {
            getOptions();
            response = getResponse();
        }while (response != 8);
    }

    private static int getResponse() {
        int response;
        showMessage("\nElie una opción");
        response = sc.nextInt();
        if (isEght(response)) showMessage("Muchas gracias por visitarnos!");
        else showMessage("OPCION INCORRECTO\n");
        return response;
    }

    private static boolean isEght(int response) {
        return response == 8;
    }

    //Obtener opciones
    private static void getOptions(){
        showMessage("****** GESTION CINEMATOGRÁFICA ********");
        showMessage("1-NUEVO ACTOR");
        showMessage("2-BUSCAR ACTOR");
        showMessage("3-ELIMINAR ACTOR");
        showMessage("4-MODIFICAR ACTOR");
        showMessage("5-VER TODOS LOS ACTORES");
        showMessage("6- VER PELICULAS DE LOS ACTORES");
        showMessage("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        showMessage("8-SALIR");
    }
    //Obtener la cantidad de palabras
    private static void getVowels(String phrase) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (Character character: phrase.toCharArray()) {
            switch (character){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }
        showVowels(a, e, i, o, u);
    }
    //Mostrar la cantidad de vocales que aparecen y de cada una
    private static void showVowels(int a, int e, int i, int o, int u) {
        showMessage("Cantidad de vocales en la frase: " + (a+e+i+o+u));
        showMessage("Vocal a: "+ a);
        showMessage("Vocal e: "+ e);
        showMessage("Vocal i: "+ i);
        showMessage("Vocal o: "+ o);
        showMessage("Vocal u: "+ u);
    }
    private static void validateUserInformation(){

    }

    private static double getDouble() {
        return sc.nextDouble();
    }

    private static int getPhraseLength(String text){
        return text.length();
    }
    private static String getTextConcatenation(String text, String additionalText){
        return text.concat(additionalText);
    }
    private static String getReplaceCharacterInText(String text,String characterToReplace, String replacementCharacter) {
        return text.replace(characterToReplace, replacementCharacter);
    }
    private static void nonWorkingDay(WorkingDay day) {
        showMessage(day.toString().toUpperCase() + IT_IS_NOT_WORK);
    }
    private static void getWorkingDay(WorkingDay day) {
        showMessage(day.toString().toUpperCase() + IT_S_A_BUSINESS_DAY);
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
    private static int getNumber(){
        return sc.nextInt();
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