package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalInterface {

    public static void main(String[] args) {


        /*
        *
        * example 1 : java Optional interface allow you to assign nullable object
        *
        *
        * */

        String chain = "there's a value";
        String chain2 = null;

        Object o1 = Optional.ofNullable(chain) //Nullable object must have a value, if the value of chain is null the value of o1 will be "the default value"
                            .orElseGet(() -> "the default value");
        System.out.println(o1);


        Object o2 = Optional.ofNullable(chain2) //Nullable object must have a value
                            .orElseGet(() -> "the default value");

        System.out.println(o2);


        /*
        *
        * if the value of chain is null we throw an exception
        *
        *
        *
        * */


        Supplier<IllegalStateException> illegalStateExceptionSupplier = () -> new IllegalStateException();

        String s = Optional.ofNullable(chain)
                .orElseThrow(illegalStateExceptionSupplier);

        System.out.println(s);

/*
          String s1 = Optional.ofNullable(chain2)
                .orElseThrow(() -> new IllegalStateException());

        System.out.println(s1);*/  //IllegalStateException will generate


        /*
        *
        * if the value of input yo nullable is not null we'll execute the logic inside ifPresent function
        *
        *
        * */


        Optional.ofNullable("chain")
                .ifPresent(str->System.out.println(str+" ****"));

        Optional.ofNullable(null)
                .ifPresent(str->System.out.println("tabi3a rabi3a "+str));


        /*
        *
        *
        * this example with ifPresentOrElse
        * in all case we can execute same thing
        *
        *
        *
        * */


        Optional.ofNullable("zakariae@gamil.com")
                .ifPresentOrElse(email-> System.out.println("sending email to "+email),()-> System.out.println("we can't send email "));
        Optional.ofNullable(null)
                .ifPresentOrElse(email-> System.out.println("sending email to "+email),()-> System.out.println("we can't send email "));





    }
}
