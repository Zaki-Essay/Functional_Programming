package imperative;

import utils.Gender;
import utils.Person;

import java.util.ArrayList;
import java.util.List;


/*
* this class describe the approach of imperative programming
*
*
*
* */

public class ImperativeProgramming {

    public static void main(String[] args) {


        //list of Persons
        List<Person> personList = List.of(
                new Person("Zakariae", Gender.Male),
                new Person ("Mohammed",Gender.Male),
                new Person( "Ayoub" , Gender.Male),
                new Person(  "Maryam",Gender.Female),
                new Person( "Fatiha",Gender.Female)
        );

        //we filter the females in person list
        List<Person> females = new ArrayList<>();
        for (Person person:personList){

            if (Gender.Female.equals(person.getGender())){
                females.add(person);

            }

        }

        for (Person person: females){
            System.out.println(person);
        }



    }


}
