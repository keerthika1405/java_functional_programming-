
//function interface to define  functionn with different number of argument

// syntax
//  BiFunction<T,U,R>
//  Beyond trifunction<T,U,V,R>

import java.util.function.BiFunction;

public class bifunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bifunc= (x,y) ->x + y ;
        System.out.println("addition  of given  number  "+ bifunc.apply(5,10));


    Trifunction<Integer,Integer,Integer,Integer> trifunc = (x,y,z)-> x + y + z;
    System.out.println("addition  of given  number  "+ trifunc.apply(5,10,15));

    Noargumentfunction<String> message =  () -> "good morning";
    System.out.println(message.apply());

    } 
}
