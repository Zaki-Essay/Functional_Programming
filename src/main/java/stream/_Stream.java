package stream;


import utils.Gender;
import utils.Person;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/*
*
* in this program stream functions
*
*
*
* */
public class _Stream {


    public static void main(String[] args) {


        //list of persons
        List<Person> personList = List.of(
                new Person("zaki", Gender.Male),
                new Person("med" , Gender.Male),
                new Person("meryam",Gender.Female),
                new Person("mohammed",Gender.Male),
                new Person("khalid",Gender.Male)

        );


        //example 1: filtre , foreach
        System.out.println("list of females");
        Consumer<Person> println = System.out::println;
        personList.stream().filter(person -> Gender.Female.equals(person.getGender()))
                           .forEach(println);


        //example 2: map mapToName
        System.out.println("list of name's persons length");
        personList.stream()
                .map(person -> person.getName())
                .mapToInt(personName->personName.length())// you can use : map(String::length)
                .forEach(System.out::println);




        //example 3: reduce
        Optional<Integer> reduce = personList.stream()
                .map(person -> person.getName())
                .map(peronName -> peronName.length())
                .reduce((a, b) -> a + b);
        System.out.println(reduce);


        //example 4: allMach anyMach noneMach
        boolean b = personList.stream().allMatch(person -> Gender.Female.equals(person.getGender()));
        System.out.println(b);//ture if all persons have female as a gender

        boolean b1 = personList.stream().anyMatch(person -> Gender.Female.equals(person.getGender()));
        System.out.println(b1); //ture if there is only one person have female as gender

        boolean b2 = personList.stream().noneMatch(person -> Gender.Female.equals(person.getGender()));
        System.out.println(b2); //true if there's no one have female as gender



    }
}
