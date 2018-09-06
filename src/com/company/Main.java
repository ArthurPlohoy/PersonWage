package com.company;

public class Main {

    public static void main(String[] args) {
		Person Andrey = new Person(" Андрей", " менеджер", 25, 12,15000);
		Person Vasya = new Person(" Василий", " водитель", 44, 8,8000);
		Person Sergey = new Person(" Сергей", " директор", 52, 10,100000);

	    System.out.println("Средняя ЗП работников: " + (Andrey.getWage() + Vasya.getWage() + Sergey.getWage())/3);

	    System.out.println (Andrey);
		//System.out.println (Vasya);
		//System.out.println (Sergey);

    }
}
