package lambdaFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {
        //exemple 1
        Function<String,String> toUpperCaseFunction =  str->str.toUpperCase();
        //or easily like
        Function<String,String> toUpperCaseFunctionV2 = String::toUpperCase;

        //application
        String apply = toUpperCaseFunction.apply("zakariare");
        System.out.println(apply);
        System.out.println(toUpperCaseFunctionV2.apply("maryam"));


        //example 2 :

        BiFunction<String,Integer,String> lambdasFunction = (name,age)->{

                if(name.isBlank()){
                    throw new IllegalStateException();

                }

                System.out.println(age);

                return name.toUpperCase();


        };

        //application
        String apply1 = lambdasFunction.apply("Zakariae", 23);//if the name is null or just contain banks an exception will genre


        System.out.println(apply1);


    }
}
