//partial application is used to config more general function to  more specific function

import java.util.function.BiFunction;
import java.util.function.Function;

public class partialappliaction {

    public static void main(String[] args) {
        // Trifunction<Integer,Integer,Integer,Integer>  add = (x,y,z)-> x + y + z;
        // Function<Integer , BiFunction<Integer,Integer,Integer>> addingpartial = (x)->(y,z)-> add.apply(x,y,z);
        // BiFunction<Integer,Integer,Integer> add5 = addingpartial.apply(5);
        // System.out.println(add5.apply(5,5));


    //    Trifunction<Integer,Integer,Integer,Integer>  add = (x,y,z)-> x + y + z;
    //     Function<Integer , BiFunction<Integer,Integer,Integer>> addingpartial = (x)->(y,z)-> add.apply(x,y,z);
    //     BiFunction<Integer,Integer,Integer> add5 = addingpartial.apply(5);
    //     System.out.println(add5.apply(5,5));

    Trifunction<Integer,Integer,Integer,Integer>  add = (x,y,z)-> x + y + z;
    Function<Integer , Function<Integer,Function<Integer,Integer>>> addingpartial = (x)->(y)->(z)-> add.apply(x,y,z);
    Function<Integer,Function<Integer,Integer>> add5 = addingpartial.apply(5);
    Function<Integer,Integer> add5and6 =add5.apply(6); 
    Integer sum = add5and6.apply(3);
    System.out.println(sum);
    }
}
