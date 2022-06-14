package collbacksFunction;

import java.util.function.Consumer;

public class CallBackFunction {
/*callbacks function in javaScript*/
//    function hello(firstName, lastName, callback) {
//        console.log(firstName);
//        if (lastName) {
//            console.log(lastName)
//        } else {
//            callback();
//        }
//    }
    public static void main(String[] args) {


        //for consumer
        firstCallback("zakariae",null,(lastName)-> System.out.println("hey ! "+lastName));

        firstCallback("zakariae","essaiydy",(lastName)-> System.out.println("hey ! "+lastName));



        //Runnable
        secondCallback("zakariae",null,()-> System.out.println("hey ! dear "));
        secondCallback("zakariae","essaiydy",()-> System.out.println("hey ! dear "));





    }



    //first methode to declare callbacks function
    //using Consumer takes an input and do something
    public static void firstCallback(String firstName, String lastName, Consumer<String> callback){
        if(lastName!=null){
            System.out.println("hello "+firstName+" "+lastName);
        }else{
            callback.accept(firstName);

        }

    }

    //the second methode to declare callbacks function
    //Runnable don't take anything and do something
    public static void secondCallback(String firstName ,String lastName,Runnable callback){
        if (lastName!=null){
            System.out.println("hello "+firstName+" "+lastName);
        }else{
            callback.run();
        }
    }

}
