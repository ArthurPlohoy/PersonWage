package com.company;

public class Person extends PersonWage{
    private String nameEmpl;
    private String position;
    private int age;
    private int hours;
    private int wage;




    public Person (String nameEmpl, String position, int age,  int hours, int wage){
        this.nameEmpl = nameEmpl;
        this.position = position;
        this.age = age;
        this.hours = hours;
        this.wage = wage;

        System.out.println("Имя:" + nameEmpl + ";" + " Должность:" + position + ";" +  " Возраст:" + age
                + ";" +  "за " + hours  + " часов" + " ЗП = " + wage + ";" );


    }
    public  String toString () {
        return  nameEmpl + " " + position + " " + age + " " + hours + " " + wage;
    }

    public int getWage (){
         return this.wage;
    }
    public void setWage (int wage){
         this.wage = wage;
    }

}