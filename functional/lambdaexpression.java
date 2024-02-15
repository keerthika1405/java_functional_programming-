import java.util.function.Function;


// Syntax : Function<T,R> 
// T--> Represent Type of input 
//  R--> Represent Type of output 



//Beside creating reference to other class methods,
//the functional interface allow us to create new  function

public class lambdaexpression {
    public static void main(String[] args) {

//lambda with tenary operator
Function<Integer,Integer> tenary= x -> x < 0?-x:x ;
System.out.println("absolute value of given  number  "+tenary.apply(-5));

Function<String,Integer> getstringlength= mystring -> mystring.length();
System.out.println("length of mystring "+getstringlength.apply("length"));


Function<Integer,Integer>  myfunction = value->{
    Integer result=  value * 2;
    return result;
};
System.out.println("multiply value of given  number  "+myfunction.apply(5));


//multiline lambda
        Function<Integer, Integer> absolutevalue= x-> {
    if(x < 0){
        return -x;
    }
    else{
        return x;
    }
};
System.out.println(absolutevalue.apply(-5));
}

}


// // A traditional interface with a single abstract method

// interface MyFunction {
//     void doSomething(int x);
// }

// public class Main {
//     public static void main(String[] args) {
//         // Creating an anonymous inner class to implement the interface
//         MyFunction myFunction = new MyFunction() {
//             @Override
//             public void doSomething(int x) {
//                 System.out.println("Doing something with x: " + x);
//             }
//         };

//         // Invoking the function
//         myFunction.doSomething(10);
//     }
// }
