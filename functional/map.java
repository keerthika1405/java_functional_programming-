//working with array and java functionality
//stream

/*
 * map only work with stream
 * allow us to process list data in pipelined way
 * map and other stream function do nt mutate original list  they're called on
 */
//convert list to stream --> list.stream()
//calling map on stream --> list.stream().map()

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9};
        List<Integer>  list =new ArrayList<>(Arrays.asList(array));

        //Instead
        // List<Integer>  doubled =new ArrayList<>();
        // for(int i=0;i<list.size(); i++){
        //     Integer result = list.get(i) * 2;
        //     doubled.add(i, result);
        // }
        //System.out.println(doubled);


        Function<Integer, Integer> multiply = (x) -> x * 2;
        List<Integer>  doubled = list.stream().map(multiply).collect(Collectors.toList());
        System.out.println(doubled);
    }
}
