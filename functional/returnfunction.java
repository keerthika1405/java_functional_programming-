import java.util.function.Function;

public class returnfunction {
    
//Instead of Writing this methods 
    // public static Integer twotimes(Integer x){
    //     return x* 2;
    // }
    // public static Integer fourtimes(Integer x){
    //     return x* 4;
    // }
    // public static Integer sixtimes(Integer x){
    //     return x* 6;
    // }

    
    public static Function<Integer ,Integer>  createMultiplier(Integer y){
        return (Integer x)-> x * y ;
    }
    public static void main(String[] args) {
        Function<Integer ,Integer> twotimes = returnfunction.createMultiplier(2);
        Function<Integer ,Integer> fourtimes = returnfunction.createMultiplier(4);
        Function<Integer ,Integer> sixtimes = returnfunction.createMultiplier(6);

        System.out.println(twotimes.apply(2));
        System.out.println(fourtimes.apply(4));
        System.out.println(sixtimes.apply(6));
    }
}
