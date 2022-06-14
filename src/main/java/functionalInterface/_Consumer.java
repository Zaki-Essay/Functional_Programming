package functionalInterface;


import utils.Customer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class _Consumer {



    public static void main(String[] args) {


        /*
         *
         * Consumer : Represents an operation that accepts a single input argument and returns no result.
         *
         * */

        //normal class
        greetConsumer(new Customer("Ziko",9999));
        greetBiConsumer(new Customer("Ziko",9999),false);
        greetBiConsumer(new Customer("Ziko",9999),true);


        //consumer Functional interface


        greetCustomerConsumer.accept(new Customer("ZAki",9999));

        //BiConsumer Functional interface

        greetConsumerBiCustomer.accept(new Customer("Ayoube",1099),false);
        greetConsumerBiCustomer.accept(new Customer("Ayoube",1099),Boolean.TRUE);



        //user tow consumer in the same time

        greetCustomerConsumer.andThen(greetCustomerConsumer).accept(new Customer("ZAki",9999));











        /*
        *
        * BiConsumer :	Represents an operation that accepts two input arguments and returns no result.
        *
        * */



    }

    //Normal java function like a consumer with one input
    public static void greetConsumer(Customer customer){

        System.out.println("Hey dear (from greetConsumer Normal function) ! My name is "+customer.getName()
                            +". And My Phone number is "+customer.getNumber());


    }

    //Consumer Functional interface
    public static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("hey from greetCustomerConsumer my name is "+ customer.getNumber()
        +"and My phone number is "+customer.getNumber());
    };





    //normal java function like a consumer with two input
    public static void greetBiConsumer(Customer customer,boolean showPhoneNumber){
        System.out.println("Hey there (from geertBiConsumer  Normal function) ! My name's "+customer.getName()
                +". and my phone number is"+(showPhoneNumber?customer.getNumber():"****"));



    }

    //BiConsumer Functional
    public static BiConsumer<Customer, Boolean> greetConsumerBiCustomer = (customer, showPhoneNumber) -> {
        System.out.println("hey there (from greetConsumerBiCustomer) "+customer.getName()+".and my phone number is" +
                " "+ (showPhoneNumber? customer.getNumber() : "****"));
    };








}
