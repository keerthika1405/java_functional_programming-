

//filter with predicate<T> 
//stream


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {

       Integer[] array = {1,2,3,4,5,6,7,8,9};
        List<Integer>  list =new ArrayList<>(Arrays.asList(array));

        // List<Integer>  even =new ArrayList<>();
        // for(int i=0;i<list.size(); i++){
        //         boolean result = list.get(i) % 2 == 0;
        //         if(result){
        //         even.add(list.get(i));
        //     }
        // }
        //     System.out.println(even);



        Predicate<Integer> isEven =(x) -> x % 2 ==0;
        List<Integer>  even = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(even);



        String[]  arraystr ={"functional","programming","is ","part","of","java"};
        List<String>  liststr =new ArrayList<>(Arrays.asList(arraystr));

        // Predicate<String> islengthgreaterthan5 =(str) -> str.length() > 5; 
        // List<String>  result = liststr.stream().filter(islengthgreaterthan5).collect(Collectors.toList());
        // System.out.println(result);


Function<Integer, Predicate<String> > findlengthforstr = (minlength)  -> {
    return (str) -> str.length() > minlength ;
};

    Predicate<String> islongerthan5 =findlengthforstr.apply(5);
    Predicate<String> islongerthan10 =findlengthforstr.apply(10);


        List<String>  result = liststr.stream().filter(islongerthan10).collect(Collectors.toList());
        System.out.println(result);
    }
}
