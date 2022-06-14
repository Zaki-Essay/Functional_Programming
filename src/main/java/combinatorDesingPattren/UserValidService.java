package combinatorDesingPattren;


import utils.User;

import java.time.LocalDate;
import java.time.Period;

/*
*
* UserValidService contain Method to check every User attribute
*
* */
public class UserValidService {



    //check the validity of email
    private boolean isEmail(String email){
        System.out.println("email validation executed");
        return email.contains("@");

    }


    //check the validity of date of birth
    private boolean isAdult(LocalDate dateOfBirth){
        System.out.println("age validation executed");
        return Period.between(dateOfBirth,LocalDate.now()).getYears()>16;


    }

    //check if the phone number is valid
    private boolean isPhoneNumber(String phoneNumber){
        System.out.println("phone Number validation executed");
        return phoneNumber.startsWith("+212");

    }



    //check if the name of the user start with capital litter
    public boolean isName(String name){
        System.out.println("name validation executed");
        String firstChar = String.valueOf(name.charAt(0));

        return firstChar.equals(firstChar.toUpperCase());
    }


    //combine all the verification related to the user
    public boolean isValidUser(User user){


        return isEmail(user.getEmail())&&
                isAdult(user.getDateOfBirth())&&
                isName(user.getName())&&
                isPhoneNumber(user.getPhoneNumber());


    }



}
