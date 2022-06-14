package functionalInterface;

/*
*
* Predicate<T>: Represents a predicate (boolean-valued function) of one argument.
* BiPredicate<T,U> : Represents a predicate (boolean-valued function) of two arguments.
*
* */

import java.util.function.Predicate;

public class _predicate {

    public static void main(String[] args) {
        //some number phone number

        String phoneNumber1 = "0790495634";
        String phoneNumber2 = "0690494634";
        String phoneNumber3 = "0290395634";
        String phoneNumber4 = "9790495634";

        //using Normal function
        System.out.println("   using normal function*****");
        System.out.println("phone number 1 : "+isPhoneNumberValid(phoneNumber1));
        System.out.println("phone number 2 : "+isPhoneNumberValid(phoneNumber2));
        System.out.println("phone number 3 : "+isPhoneNumberValid(phoneNumber3));
        System.out.println("phone number 4 : "+isPhoneNumberValid(phoneNumber4));


        //using predicate functional interface
        System.out.println("     using predicate functional interface(validation)****");


        System.out.println("phone number 1 : "+isPhoneNumberValidPredicate.test(phoneNumber1));
        System.out.println("phone number 2 : "+isPhoneNumberValidPredicate.test(phoneNumber2));
        System.out.println("phone number 3 : "+isPhoneNumberValidPredicate.test(phoneNumber3));
        System.out.println("phone number 4 : "+isPhoneNumberValidPredicate.test(phoneNumber4));

        System.out.println("     using predicate functional interface(contain three)****");

        System.out.println("phone number 1 : "+isPhoneNumberContainThree.test(phoneNumber1));
        System.out.println("phone number 2 : "+isPhoneNumberContainThree.test(phoneNumber2));
        System.out.println("phone number 3 : "+isPhoneNumberContainThree.test(phoneNumber3));
        System.out.println("phone number 4 : "+isPhoneNumberContainThree.test(phoneNumber4));

    }



    //Normal class java
    public static boolean isPhoneNumberValid(String phoneNumber){
        return (phoneNumber.startsWith("07")||phoneNumber.startsWith("06"))&& phoneNumber.length()==10;


    }

    //using predicate Functional interface
    public static Predicate<String> isPhoneNumberValidPredicate = phoneNumber-> (phoneNumber.startsWith("07")||phoneNumber.startsWith("06"))&&phoneNumber.length()==10;


    //other predicate to check if phone number contain 3
    public static Predicate<String> isPhoneNumberContainThree = phoneNumber -> phoneNumber.contains("3");




}
