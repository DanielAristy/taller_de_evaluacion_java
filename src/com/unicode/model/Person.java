package com.unicode.model;

public class Person {

    private String name = "";
    private int age = 0;
    private String DNI = "";
    private char sex = SEX_DEFAULT;
    private double weight = 0;
    private double height = 0;
    private static final char SEX_DEFAULT = 'H';
    private static final String letras[]= {"-T","-R","-W","-A","-G","-M","-Y","-F","-P","-D","-X","-B","-N","-J","-Z","-S","-Q","-V","-H","-L","-C","-K","-E"};

    public Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, int age, String DNI, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.DNI = DNI;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public int calculateIMC(){
        double idealWeight = getIdealWeight();
        if (idealWeight < 20){
            idealWeight = -1;
            System.out.println("Estas en su peso ideal");
        }else if(idealWeight <= 25){
            idealWeight = 0;
            System.out.println("Está por debajo de su peso idea");
        }else{
            idealWeight = 1;
            System.out.println("Tiene sobrepeso");
        }
        return (int) idealWeight;
    }

    private double getIdealWeight() {
        return  this.weight / (Math.pow(this.height,2));
    }

    private boolean isOlder(){
        return this.age > 18;
    }

    public void checkSex(char sex){
        if (sex == SEX_DEFAULT || sex == 'F') this.sex = sex;
        else this.sex = SEX_DEFAULT;
    }
    public String generateDNI(){

        String DNI = "";

        for (int i = 0; i < letras.length; i++) {
            DNI = letras[i];
            break;
        }
        return DNI;
    }

    public void calculateDNINumber(){
        this.DNI = "" + (int) (Math.random()*99999999) + "" + generateDNI();
    }

    @Override
    public String toString() {
        return "Person{" +
                " name= '" + name + '\'' +
                ", age = " + age +
                ", DNI = '" + DNI + '\'' +
                ", sex = " + sex +
                ", weight = " + weight +
                ", height = " + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static char getSexDefault() {
        return SEX_DEFAULT;
    }
}
