package declarative;

import utils.Gender;
import utils.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
*
* the declarative programming
*
* */

public class DeclarativeProgramming {

    public static void main(String[] args) {


        List<Person> personList = List.of(
                new Person("Zakariae" , Gender.Male),
                new Person( "Maryam" , Gender.Female)
        );


        //filtre persons with gender equals female
        System.out.println("**the first result**");
        personList.stream()
                .filter(person -> Gender.Female.equals(person.getGender()))
                 .forEach(System.out::println);


        //to store in other array list
        System.out.println("**the second result**");
        List<Person> female =  personList.stream().filter(person -> Gender.Female.equals(person.getGender())).collect(Collectors.toList());
        female.forEach(System.out::println);








    }
}
