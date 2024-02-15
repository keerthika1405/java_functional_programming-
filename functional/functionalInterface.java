import java.util.function.Function;

public class functionalInterface {

    protected static class mymath{
        public static Integer triple(Integer x){
            return x * 3;
}
}
    public static void main(String[] args) {
        Function<Integer, Integer>  mytriple= mymath::triple;
        Integer result= mytriple.apply(4);
        System.out.println(result);
    }

}
