/*
 * 
A higher-order function is a function that takes one or more functions as arguments and/or 
returns a function as its result. In Java, higher-order functions can be implemented using
 functional interfaces, lambda expressions, and method references introduced in Java 8 
 */

import java.util.function.BiFunction;
import java.util.function.Function;

public class higherorderfunction {
    public static void main(String[] args) {

BiFunction<Float,Float,Float> divide = (x,y) -> x / y;

        Function<BiFunction<Float,Float,Float>,BiFunction<Float,Float,Float>>  divisiblebyzerocheck  =  
        (func) -> (x,y) ->{
            if(y== 0f){
                System.out.println("Error: zero division error");
                return 0f;
            }
            return func.apply(x, y);
        };

        BiFunction<Float,Float,Float> result = divisiblebyzerocheck.apply(divide);
        System.out.println(result.apply(10f, 2f));

    }
}
