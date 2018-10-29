package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
	Rabbit rabbit = new Rabbit(false, "grass", 4, "Peter", "Grey");

        System.out.println("Hello his name is " +rabbit.getName());
        System.out.println("Peter is Vegetarian? " +rabbit.vegetarian);
        System.out.println("Peter eats " +rabbit.getEats());
        System.out.println("Peter has " +rabbit.getNoOfLegs()+ " legs.");
        System.out.println("Peter Color is " +rabbit.getColor());
    }
}
