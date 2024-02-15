//collect
//java ptovide  many standard collectors
//syntax :  num.stream().collect(...)
//                               Collectors<T, A , R>(Not a Functional Interface) 
/*
difference reduce vs collect

 * List<Integer> number = num.stream().reduce(...)-----------> must return an integer
 * List<Integer> number = num.stream().collect(...)-----------> can return any type
 */
//stream

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args) {
        
        String[]  arraystr ={"functional","programming","is ","part","of","java"};
        List<String>  liststr =new ArrayList<>(Arrays.asList(arraystr));

        // String result = liststr .stream()   .filter((str) -> str.length() > 5)  .collect(Collectors.joining(","));
        // System.out.println(result);

        // long result = liststr .stream()  .filter((str) -> str.length() > 5)  .collect(Collectors.counting());
        // System.out.println(result);  

        // Map<Integer, List<String>> result = liststr.stream().collect(Collectors.groupingBy((str)-> str.length()));
        // System.out.println(result);

        Map<Boolean, List<String>> result = liststr.stream().collect(Collectors.partitioningBy((str)-> str.length()> 5));
        System.out.println(result);

    }

}
