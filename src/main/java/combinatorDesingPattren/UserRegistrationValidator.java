package combinatorDesingPattren;

import utils.User;
import utils.ValidationResult;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/*
*
* in this class we check the validity of user attribute using combinator design pattern
* the method of validation consist : if the first field is correct we pass else we inform the user
*
*
*
* */

public interface  UserRegistrationValidator extends Function<User, ValidationResult> {

    //check the validity of user emil
    static UserRegistrationValidator isEmailValid(){

        return user -> {
            System.out.println("email validation executed");
            return user.getEmail()
                    .contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
        };


    }


    //check the validity of phone number

    static UserRegistrationValidator isPhoneNumber(){
        return user -> {
            System.out.println("Phone number executed ");

            return user.getPhoneNumber()
                    .startsWith("+212") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
        };

    }


    //check if the user is an adult
    static UserRegistrationValidator isAdult(){
        return user -> {

            System.out.println("age validation executed");

            return Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() > 16
                    ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
        };

    }



    /*
    *
    * we can't make and method as static because it will use  UserRegistrationValidator object
    * ,so the solution is to use default Methode
    * DOC : Before Java 8, we could only declare abstract methods in an interface.
    * However, Java 8 introduced the concept of default methods.
    * Default methods are methods that can have a body.
    * The most important use of default methods in interfaces is to provide additional
    * functionality to a given type without breaking down the implementing classes.
    * Before Java 8, if a new method was introduced in an interface then all the implementing classes used to break.
    * We would need to provide the implementation of that method in all the implementing classes.
    * see all doc here  https://www.educative.io/courses/java-8-lambdas-stream-api-beyond/R888OpmM5WO?aid=5082902844932096&utm_source=google&utm_medium=paid&utm_campaign=dynamic_core&utm_term=&utm_campaign=%5BDynamic%5D+Programming+Verticals&utm_source=adwords&utm_medium=ppc&hsa_acc=5451446008&hsa_cam=16452540641&hsa_grp=132633981983&hsa_ad=585209036158&hsa_src=g&hsa_tgt=aud-475527062782:dsa-1635638188306&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAjw46CVBhB1EiwAgy6M4u0v9vI0UuUxMc3tspsa7e_94_4969RNcpV2Pjv6up0624Oc1nLX4RoCxsgQAvD_BwE
    *
    * */
    //combine many validator
    default UserRegistrationValidator and(UserRegistrationValidator otherCheck){
        return user -> {

            ValidationResult resultOfTheFirstCheck = this.apply(user);
            return ValidationResult.SUCCESS.equals(resultOfTheFirstCheck)?otherCheck.apply(user):resultOfTheFirstCheck;


        };


    }



}
