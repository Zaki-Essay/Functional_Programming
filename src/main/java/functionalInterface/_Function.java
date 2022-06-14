package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;


/*
*
* Function : Represents a function that accepts one argument and produces a result.
* in this section there's some exemple about Function , BiFunction it's exactly like delege in C#
*
*
*
*
* */

public class _Function {


    public static void main(String[] args) {

        System.out.println("Function Examples*********");

        //Function in functional programming takes 1 and produce(return) 1 result
        int increment = increment(1);
        System.out.println(increment);


        //apply incrementNumberByOne with input equal 1
        Integer apply = incrementNumberByOne.apply(increment);
        System.out.println(apply);


        Integer apply1 = multiplyNumberByTeen.apply(apply);
        System.out.println(apply1);


        //apply two functions in one time

        Integer apply2 = incrementNumberByOne.andThen(multiplyNumberByTeen).apply(apply1);
        System.out.println(apply2);


        System.out.println("BiFunction Examples*******");
        System.out.println(incrementAndMultiply.apply(4,100));
        System.out.println(incrementAndMultiply.andThen(incrementNumberByOne).apply(4,100));
        System.out.println(incrementAndMultiply.andThen(multiplyNumberByTeen).apply(4,100));








    }

    /**
     *
     *
     *Function interface to manipulate functions in functional way
     * Function<inputType,outputType> function take 1 argument and return 1 result
     *
     *
     */


    //represent Function<int,int> without using Function interface
    public static int increment(int number){
        return number+1;
    }


    //using Function interface to represent function with 1 input and 1 out put
    public static Function<Integer,Integer> incrementNumberByOne = number ->number+1;

    public static Function<Integer,Integer>  multiplyNumberByTeen = number -> number*10;



    /*
    *
    * BiFunction : 	Represents a function that accepts two arguments and produces a result.
    *
    *BiFunction<inputType,inputType2,outputType>
    *
    *
    *
    *
    * */

    static BiFunction<Integer,Integer,Integer> incrementAndMultiply = (numberToIncrement,numberToMultiplyBy)
                                                ->(numberToIncrement+1)*numberToMultiplyBy;







}
