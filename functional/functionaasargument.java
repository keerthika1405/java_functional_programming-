import java.util.function.BiFunction;

public class functionaasargument {

    protected static class mymath{

    public static Integer add( Integer x,Integer y){
        return x + y;

    };

    public static Integer sub( Integer x,Integer y){
        return x - y;
        
            }

    public static Integer combine2and3(BiFunction<Integer,Integer, Integer>  combinefunc){
        return combinefunc.apply(2,3);
    }
}
    public static void main(String[] args) {
        System.out.println(mymath.combine2and3(mymath::add));

        System.out.println(mymath.combine2and3(mymath::sub));

        System.out.println(mymath.combine2and3((x,y)-> 2*x + 2*y));


    }
}
