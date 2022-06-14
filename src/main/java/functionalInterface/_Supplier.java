package functionalInterface;


import java.util.List;
import java.util.function.Supplier;

/*
*
* Supplier<T>:Represents a supplier of results.
* takes no input variable and performe result with T type
*
*
* */
public class _Supplier {

    public static void main(String[] args) {

        //normal java function
        String dbConnexionURL = getDBConnexionURL();
        System.out.println(dbConnexionURL);

        //using supplier Functional interface

        List<String> list = getListBDConnexionURLS.get();
        list.forEach(System.out::println);



    }


    //normal class java
    public static String getDBConnexionURL(){
        return "jdbc://localhost:8090/users";

    }


    //using supplier functional interface
    public static Supplier<List<String>> getListBDConnexionURLS = ()->List.of(
            "jdbc://localhost:6060/users",
            "jdbc://localhost:9090/clients"
    );




}
