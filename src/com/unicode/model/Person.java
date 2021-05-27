package com.unicode.model;

public class Person {

    private String name = "";
    private int age = 0;
    private String DNI;
    private char sex = SEX_DEFAULT;
    private double weight = 0;
    private double height = 0;
    private static final char SEX_DEFAULT = 'H';

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

    private int calculateIMC(){
        int value = 0;
        int idealWeight = getIdealWeight();
        if (idealWeight < 20){
            value = -1;
        }else if(idealWeight <= 25){
            value = 0;
        }else{
            value = 1;
        }
        return value;
    }
    private int getIdealWeight() {
        return (int) (this.weight / (Math.pow(this.height,2)));
    }

    private boolean isOlder(){
        return this.age > 18;
    }

    private void checkSex(char sex){

    }
    private String generatDNI(){
        String DNI = "";
        return DNI;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DNI='" + DNI + '\'' +
                ", sex=" + sex +
                ", weight=" + weight +
                ", height=" + height +
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
