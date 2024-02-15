//reduce  with BinaryOperatot<T>
//stream

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class reduce {
    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5,6,7,8,9};
        List<Integer>  list =new ArrayList<>(Arrays.asList(array));

        BinaryOperator<Integer> sum =(acc, x) -> {
            Integer result = acc + x;
            System.out.println("acc: "+acc+"  ,  "+" x: "+ x +" === "+ result);
            return result;
        };

        Integer  result = list.stream().reduce(0,sum);
        System.out.println(result);
    }
}
