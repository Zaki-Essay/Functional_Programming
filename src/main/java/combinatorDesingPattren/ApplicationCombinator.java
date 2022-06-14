package combinatorDesingPattren;

import utils.User;

import java.time.LocalDate;
import utils.ValidationResult;

import static combinatorDesingPattren.UserRegistrationValidator.*;

public class ApplicationCombinator {

    /*
    *
    * combinator design pattern :
    * if combine all the verification about user , and if there's an invalid attribute we can not determine exactly this filed
    *
    *
    * */

    public static void main(String[] args) {

        User validUser = new User(
                "ZAkariae",
                "zakaessaiydy@gamil.com",
                LocalDate.of(2000,11,12),
                "+2123456678455"
        );
        User invalidUser = new User(
                "zkariae",
                "zakaessaiydygamil.com",
                LocalDate.of(2020,11,12),
                "+2123456678455"
        );


        System.out.println("[------------::La verification without CDP::---------------]");


        //without combinator design pattern

        boolean validUser1 = new UserValidService().isValidUser(validUser);
        System.out.println("[without CDP]user 1 is valid : "+validUser1);

        boolean validUser2 = new UserValidService().isValidUser(invalidUser);
        System.out.println("[without CDP]user 2 is valid : "+validUser2);// in this case we can't spicily exactly the wrong attribute


        //application of design pattern combinator

        System.out.println("[------------::La verification with CDP::---------------]");

        //if we want to apply only onr verification
        ValidationResult apply = isEmailValid().apply(validUser);
        System.out.println(apply);

        ValidationResult apply1 = isAdult().apply(invalidUser);
        System.out.println(apply1);


        System.out.println("list of verification ");
        System.out.println("------------------------------------------------");

        ValidationResult apply2 = isEmailValid().and(isAdult()).and(isPhoneNumber()).apply(validUser);
        System.out.println("[with CDP]user 1 is valid : "+apply2);
        System.out.println("------------------------------------------------");

        ValidationResult apply3 = isPhoneNumber().and(isEmailValid()).and(isAdult()).apply(invalidUser);
        System.out.println("[with CDP]user 2 is valid : "+apply3);

    }
}
